package rental;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import rental.filter.*;


public class RentalAgencyTest{
    private RentalAgency agence;
    private Vehicle renaultClio;
    private Vehicle peugeot208;
    private Vehicle fordFocus;
    private Vehicle megane;
    private BrandFilter brandFilter;
    private MaxPriceFilter maxPriceFilter;
    private AndFilter andFilter;
    private Client c1;
    private Client c2;



    @BeforeEach
    public void before(){
        this.agence=new RentalAgency();
        this.renaultClio= new Vehicle("Renault", "Clio", 2018, 25.0);
        this.peugeot208=new Vehicle("Peugeot", "208", 2019, 30.0);
        this.fordFocus=new Vehicle("Ford", "Focus", 2020, 35.0);
        agence.addVehicle(renaultClio);
        agence.addVehicle(peugeot208);
        agence.addVehicle(fordFocus);
        this.brandFilter= new BrandFilter("Renault");
        this.maxPriceFilter = new MaxPriceFilter(35.0);
        this.andFilter=new AndFilter();
        andFilter.addFilter(brandFilter);
        andFilter.addFilter(maxPriceFilter);

        this.c1 = new Client("client1", 20);
        this.c2 = new Client("client2", 30);

        this.megane=new Vehicle("Renault","megane",2020,30.0);
    

    }

    @Test
    public void addVehicleTest(){
        
        assertTrue(agence.getAllVehicles().contains(renaultClio));
        assertTrue(agence.getAllVehicles().contains(peugeot208));
        assertTrue(agence.getAllVehicles().contains(fordFocus));

    }
    @Test
    public void removeVehicleTest() throws UnknownVehicleException{
        
        agence.removeVehicle(renaultClio);
        agence.removeVehicle(peugeot208);
        agence.removeVehicle(fordFocus);
        assertFalse(agence.getAllVehicles().contains(renaultClio));
        assertFalse(agence.getAllVehicles().contains(peugeot208));
        assertFalse(agence.getAllVehicles().contains(fordFocus));
        assertThrows(UnknownVehicleException.class,()->agence.removeVehicle(megane));
        

    } 
    @Test
    public void selectTest(){
        assertTrue(agence.select(brandFilter).contains(renaultClio));
        assertTrue(agence.select(maxPriceFilter).contains(peugeot208));
        assertFalse(agence.select(maxPriceFilter).contains(fordFocus));
        assertTrue(agence.select(andFilter).contains(renaultClio));
        assertFalse(agence.select(andFilter).contains(peugeot208));
        assertFalse(agence.select(andFilter).contains(fordFocus));


    }
    @Test
    public void hasRentedAVehicleTest() throws UnknownVehicleException{
        agence.rentVehicle(c1,renaultClio);
        assertTrue(agence.hasRentedAVehicle(c1));
        assertFalse(agence.hasRentedAVehicle(c2));

    }
    @Test
    public void isRentedTest() throws UnknownVehicleException,IllegalStateException{
        agence.rentVehicle(c1,renaultClio);
        agence.rentVehicle(c2,peugeot208);
        assertTrue(agence.isRented(renaultClio));
        assertTrue(agence.isRented(peugeot208));
        assertFalse(agence.isRented(fordFocus));
        
        

    }
    @Test
    public void rentVehicleTest() throws UnknownVehicleException,IllegalStateException{
        
        assertEquals(25.0,agence.rentVehicle(c1,renaultClio));
        assertTrue(agence.allRentedVehicles().contains(renaultClio));
        assertEquals(30.0,agence.rentVehicle(c2,peugeot208));
        assertTrue(agence.allRentedVehicles().contains(peugeot208));
        assertFalse(agence.allRentedVehicles().contains(fordFocus));
        assertThrows(IllegalStateException.class,()-> agence.rentVehicle(c1,fordFocus));
        agence.returnVehicle(c2);
        assertThrows(IllegalStateException.class,()-> agence.rentVehicle(c2,renaultClio));
        assertThrows(UnknownVehicleException.class,()-> agence.rentVehicle(c2,megane));


    
    }
    @Test
    public void returnVehicleTest() throws UnknownVehicleException,IllegalStateException{
        agence.rentVehicle(c1,renaultClio);
        agence.rentVehicle(c2,peugeot208);
        agence.returnVehicle(c1);
        agence.returnVehicle(c2);
        agence.rentVehicle(c2,fordFocus);
        assertFalse(agence.allRentedVehicles().contains(renaultClio));
        assertFalse(agence.allRentedVehicles().contains(peugeot208));
        assertTrue(agence.allRentedVehicles().contains(fordFocus));


    
    }

} 