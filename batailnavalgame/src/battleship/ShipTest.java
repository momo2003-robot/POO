package test.battleship;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShipTest {

    @Test
    public void testGetLifePoints() {
        Ship ship1 = new Ship(10);
        assertEquals(10, ship1.getLifePoints());
    }

    @Test
    public void testHasBeenSunk() {
        Ship ship2 = new Ship(2); // Le navire a initialement 2 points de vie
        assertFalse(ship2.hasBeenSunk());


        Ship shipSunck = new Ship(0);
        assertTrue(shipSunck.hasBeenSunk());
        
    }

    @Test
    public void testBeenHitting() {
        Ship ship3 = new Ship(3);
        ship3.beenHitting();
        assertEquals(2, ship3.getLifePoints()); // Un coup a été porté

        ship3.beenHitting();
        assertEquals(1, ship3.getLifePoints()); // Deux coups ont été portés

        ship3.beenHitting();
        assertEquals(0, ship3.getLifePoints()); // Trois coups ont été portés, le navire a coulé
    }

    @Test
    public void testToString() {
        Ship ship4 = new Ship(7);
        assertEquals("ship lifepoints: 7", ship4.toString());
    }
}
