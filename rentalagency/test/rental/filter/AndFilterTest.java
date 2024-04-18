package rental.filter;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import rental.Vehicle;
import rental.filter.*;


public class AndFilterTest {
    private Vehicle renaultClio;
    private Vehicle peugeot208;
    private Vehicle fordFocus;
    private BrandFilter brandFilter;
    private MaxPriceFilter maxPriceFilter;
    private AndFilter andFilter;
    @BeforeEach 
    public void before(){
        this.renaultClio= new Vehicle("Renault", "Clio", 2018, 25.0);
        this.peugeot208=new Vehicle("Peugeot", "208", 2019, 30.0);
        this.fordFocus=new Vehicle("Ford", "Focus", 2020, 35.0);
        this.brandFilter= new BrandFilter("Renault");
        this.maxPriceFilter = new MaxPriceFilter(35.0);
        this.andFilter=new AndFilter();
        andFilter.addFilter(brandFilter);
        andFilter.addFilter(maxPriceFilter);
    }

    @Test
    public void addFilterTest(){
        assertTrue(andFilter.getFilters().contains(maxPriceFilter));
        assertTrue(andFilter.getFilters().contains(brandFilter));

    }  

    @Test
    public void acceptTest() {
        
        assertTrue(andFilter.accept(renaultClio));
        assertFalse(andFilter.accept(peugeot208));
        assertFalse(andFilter.accept(fordFocus));
    }

}