package rental.vehicle;
import rental.Vehicle;

/**
 * The Car class represents a specific type of vehicle - a car, which is a subclass of the Vehicle class.
 * It includes additional information about the number of passengers it can accommodate.
 */
public class Car extends Vehicle{
    private int passagers;
    public Car(String brand, String model, int productionYear, double dailyRentalPrice,int passagers){
        super(brand,model,productionYear,dailyRentalPrice);
        this.passagers=passagers;
    } 

    /**
     * Gets the number of passengers the car can accommodate.
     * @return the number of passengers
     */
    public int getPassagers(){
        return this.passagers;
    }
    
    /**
     * Returns a string representation of the Car object, including details inherited from the Vehicle class
     * and information about the number of passengers.
     * @return a string representation of the Car object
     */
    public String toString(){
        return super.toString()+" "+this.getPassagers()+" "+" passagers"; 
    } 
} 