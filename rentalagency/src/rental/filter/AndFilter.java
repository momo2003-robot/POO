package rental.filter;

import java.util.*;

import rental.Vehicle;
import rental.VehicleFilter;

/**
 * An AndFilter performs the intersection of filters. It accepts a vehicle if
 * each of its filter accepts it.
 */
public class AndFilter implements VehicleFilter {

   private List<VehicleFilter> theFilters;

   /** creates an InterFilter with no filter */
   public AndFilter() {
      // A COMPLETER
      this.theFilters=new ArrayList<>();

   }

   /**
    * adds a new filter
    * 
    * @param f the added filter
    */
   public void addFilter(VehicleFilter f) {
      // A COMPLETER
      this.theFilters.add(f);
   }
   /**
    * Retrieves the list of VehicleFilter objects associated with the rental agency.
    * @return a List of VehicleFilter objects representing the filters used by the rental agency
    */
   public List<VehicleFilter> getFilters(){
      return this.theFilters;
   } 

   /**
    * Accept the vehicle if each of its filters accepts it
    * 
    * @see VehicleFilter#accept(Vehicle)
    */
   public boolean accept(Vehicle v) {
      // A COMPLETER
      for(VehicleFilter f:theFilters){
         if(!f.accept(v)){
            return false;
         } 
      } 
      return true;
   }
}
