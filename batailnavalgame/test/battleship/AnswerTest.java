package battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnswerTest{
    // answer is missed for shot when no ship
   @Test 
    public void answserIsMissedForShotWhenNoShip(){
        Cell c = new Cell();
        Answer answer = c.Shot();
        assertEquals(answer, Answer.missed);
    } 
    @Test
    public void testAnswerissunkwhenlastshot(){
        Cell c = new Cell();
        Ship s = new Ship(1);
        c.setShip(s);
        Answer answer = c.Shot();
        assertTrue(s.hasBeenSunk());
        assertEquals(Answer.sunk, answer);       
    }
    @Test  
    public void testfirstshotdecreaselifepointsandanswerishit(){
        Cell c = new Cell();
        Ship s = new Ship(3);
        c.setShip(s);
        assertEquals(3, s.getLifePoints());
        Answer answer = c.Shot();
        assertEquals(2, s.getLifePoints());
        assertEquals(Answer.hit, answer);
    } 
    @Test
    public void testsecondshotsamecell(){
        Cell c = new Cell();
        Ship s= new Ship(2);
        c.setShip(s);
        assertEquals(2, s.getLifePoints());
        c.Shot();
        assertTrue(c.hasBeenShot());
        assertEquals(1, s.getLifePoints());
        c.Shot();
        assertEquals(1, s.getLifePoints());

    
    }
     // ---Pour permettre l'exécution des test----------------------
   public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(battleship.AnswerTest.class);
   }
}
