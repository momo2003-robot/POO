package rental.vehicle;

import rental.Vehicle;

/**
 * The Motorbike class represents a specific type of vehicle - a motorbike, which is a subclass of the Vehicle class.
 * It includes additional information about the engine displacement (cylindree) of the motorbike.
 */
public class Motorbike extends Vehicle{
    private int cylindree;
    
    public Motorbike(String brand, String model, int productionYear, double dailyRentalPrice,int cylindree){
        super(brand,model,productionYear,dailyRentalPrice);
        this.cylindree=cylindree;
    } 
    /**
     * Gets the engine displacement (cylindree) of the motorbike.
     * @return the engine displacement of the motorbike in cubic centimeters (cm³)
     */
    public int getCylindree(){
        return this.cylindree;
    } 
    /**
     * Returns a string representation of the Motorbike object, including details inherited from the Vehicle class
     * and information about the engine displacement.
     * @return a string representation of the Motorbike object
     */
    public String toString(){
        return super.toString()+" "+this.getCylindree()+""+"cm³";
    } 

    
} 