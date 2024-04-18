package rental.agency;
import java.util.*;
import rental.*;

/**
 * The SuspiciousRentalAgency class represents a specialized type of rental agency that may apply additional costs
 * to the rental price based on certain criteria, such as the age of the client. It extends the RentalAgency class.
 */
public class SuspiciousRentalAgency extends RentalAgency{
    private static final double COUT=0.1;

    public SuspiciousRentalAgency(){
        super();
    } 
    /** client rents a vehicle 
     * @param client the renter
     * @param v the rented vehicle
     * @return the daily rental price for client for vehicle v
     * @exception UnknownVehicleException   if v is not a vehicle of this agency  
     * @exception IllegalStateException if v is already rented or client rents already another vehicle
     */
    public double rentVehicle (Client client,Vehicle v) throws UnknownVehicleException, IllegalStateException{
        double price=super.rentVehicle(client,v);
        if(client.getAge()<25){
            price+=price*COUT;
            return price;
        }

        return price;
    } 



} 