package rental;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

   private Vehicle v1;
   private Vehicle v2;

   /* méthode exécutée avant l'exécution de chacune des méthodes de test */
   @BeforeEach
   public void before() {
      // réinitialisation des attributs v1 et v2 pour chacun des tests
      this.v1 = new Vehicle("brand1", "model1", 2015, 100.0f);
      this.v2 = new Vehicle("brand2", "model2", 2000, 200.0f);
   }

   @Test
   public void testGetBrand() {
      // this.v1 et this.v2 initialisés car before() a été exécutée avant cette méthode
      assertEquals("brand1", this.v1.getBrand());
      assertEquals("brand2", this.v2.getBrand());
   }

   @Test
   public void testGetModel() {
      // this.v1 et this.v2 initialisés car before() a été exécutée avant cette méthode
      assertEquals("model1", this.v1.getModel());
      assertEquals("model2", this.v2.getModel());
   }

   @Test
   public void testGetDailyPrice() {
      // this.v1 et this.v2 initialisés car before() a été exécutée avant cette méthode
      assertEquals(100.0, this.v1.getDailyPrice(), 0.0001);
      assertEquals(200.0, this.v2.getDailyPrice(), 0.0001);
   }

   @Test
   public void testGetProductionYear() {
      assertEquals(2015, this.v1.getProductionYear());
      assertEquals(2000, this.v2.getProductionYear());
   }

   @Test
   public void testEquals() {
      Vehicle v3 = new Vehicle("brand1", "model1", 2015, 100.0f);
      Vehicle v4 = new Vehicle("brand1", "model1", 2015, 200.0f);
      assertTrue(v1.equals(v3));
      assertFalse(v1.equals(v2));
      assertFalse(v1.equals(v4));
      assertFalse(v1.equals(new Object()));
   }


}
