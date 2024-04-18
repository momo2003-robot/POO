package battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest{     
   @Test
   public void testtocaracterwhendefendercasevide(){
    Cell c = new Cell();
    assertTrue(c.getShip()==null);
    assertEquals(c.toCharacter(true),'∼');
   }

  @Test
  public void testtocaracterwhendefendercasewithshipnoshoted(){
    Cell c = new Cell();
    Ship s = new Ship(1);
    c.setShip(s);
    assertEquals(c.toCharacter(true),'B');
  } 

  @Test
  public void testtocaracterwhendefendershiphasbeenshot(){
    Cell c = new Cell();
    Ship s = new Ship(2);
    c.setShip(s);
    c.Shot();
    assertEquals(c.toCharacter(true),'*');
  } 
  @Test  
  public void testtocaracterwhenattackerwithcasenotshoted(){
    Cell c = new Cell();
    Ship s = new Ship(2);
    c.setShip(s);
    assertEquals(c.toCharacter(false),'.');
  }
  @Test  
  public void testtocaracterwhenattackerwithcaseshotedempty (){
    Cell c = new Cell();
    c.Shot();
    assertEquals(c.toCharacter(false),'∼');
  } 
  @Test  
  public void testtocaracterwhenattackerwithcasennoshoted(){
    Cell c = new Cell();
    Ship s = new Ship(2);
    c.setShip(s);
    c.Shot();
    assertEquals(c.toCharacter(false),'*');
  }
   // ---Pour permettre l'exécution des test----------------------
   public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(battleship.CellTest.class);
   }

}     
 

