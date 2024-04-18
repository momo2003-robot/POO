



package vlille;
public class BikeStation {

   /** array of slots for bikes in the station */
   private Bike[] bikes;
   /** name of the station */
   private String name;
   /**capacity of the station*/
   

   /**
    *  Build a station with given name and capacity
    * @param name this.name
    * @param capacity this .capacity 
    * 
    */
   public BikeStation(String name,int capacity ) {
      this.name = name;
      this.bikes = new Bike[capacity];
      
   }

   /**
    * @return the name of the station
    */
   public String getName() {
      
      return this.name;
   }

   /**
    * @return the capacity of the station
    */
   public int getCapacity() {
      
      return bikes.length;
   }

   /**
    * @return the number of bikes at the station 
    */
   public int getNumberOfBikes() {
      
      int counter = 0 ;
      for(Bike b : this.bikes){
         if((b != null)){
         counter++;
         }
         
      }
      return counter ;
   }
   /** return the first free slot of the bikestation
    * @return the smallest index that's null
    */
   
   public int firstFreeSlot() {
      for(int i=0; i<bikes.length; i++){
         if(bikes[i]==null){
            return i;
         }
      }
      return -1;
      
   }

   /** insert a bike in the first free slot
    * @param bike : the bike we want to put in the first free slot
    * @return true if there's a free slot for the bike , false if not
    */

   public boolean dropBike(Bike bike) {
      if(firstFreeSlot()!=-1){
         bikes[firstFreeSlot()]=bike;
         return true;
         }
      else{
         return false;
      }
     
   }

   
   /** return the bike in given slot 
    * @param i the slot of the bike we want to take
    * @return bike in the slot i
    */

   public Bike takeBike(int i) throws BikeNotAvailableException {
      
      if(i>=0 && i<bikes.length){
         if(bikes[i]!=null){
         Bike bike=bikes[i];
         bikes[i]=null;
         return bike;
       }
         else{
            throw new BikeNotAvailableException("no bike in the given position");
         }
      }
      else{
         throw new BikeNotAvailableException("Index out of range");
      }
   }
    
    

}
