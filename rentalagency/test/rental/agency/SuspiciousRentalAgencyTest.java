package rental.agency;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import rental.filter.*;
import rental.*;

public class SuspiciousRentalAgencyTest{
    private SuspiciousRentalAgency agence;
    private Vehicle renaultClio;
    private Vehicle peugeot208;
    private Vehicle fordFocus;
    private Vehicle megane;
    private Client c1;
    private Client c2;

    @BeforeEach
    public void before(){
        this.agence=new SuspiciousRentalAgency();
        this.renaultClio= new Vehicle("Renault", "Clio", 2018, 25.0);
        this.peugeot208=new Vehicle("Peugeot", "208", 2019, 30.0);
        this.fordFocus=new Vehicle("Ford", "Focus", 2020, 35.0);
        agence.addVehicle(renaultClio);
        agence.addVehicle(peugeot208);
        agence.addVehicle(fordFocus);
        this.c1 = new Client("client1", 20);
        this.c2 = new Client("client2", 30);
        this.megane=new Vehicle("Renault","megane",2020,30.0);
    

    }

    @Test
    public void rentVehicleTest() throws UnknownVehicleException,IllegalStateException{
        
        assertEquals(27.5,agence.rentVehicle(c1,renaultClio));
        assertEquals(30.0,agence.rentVehicle(c2,peugeot208));
        assertThrows(IllegalStateException.class,()-> agence.rentVehicle(c1,fordFocus));
        agence.returnVehicle(c2);
        assertThrows(IllegalStateException.class,()-> agence.rentVehicle(c2,renaultClio));
        assertThrows(UnknownVehicleException.class,()-> agence.rentVehicle(c2,megane));

    
    }





} 