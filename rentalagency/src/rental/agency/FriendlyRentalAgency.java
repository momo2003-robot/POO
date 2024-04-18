package rental.agency;
import java.util.*;
import rental.*;
/**
 * The FriendlyRentalAgency class represents a specialized type of rental agency that rewards clients with loyalty points.
 * It extends the RentalAgency class and includes additional features such as tracking loyalty points for clients and applying
 * discounts based on accumulated points.
 */
public class FriendlyRentalAgency extends RentalAgency{
    private int points;
    private double cout;
    private int seuil;
    private Map<Client,Integer> clients; 

    public FriendlyRentalAgency(double cout,int seuil) {
        super();
        this.points=0;
        this.cout=cout;
        this.seuil=seuil;
        this.clients=new HashMap<Client,Integer>();
    
    }
    /**
     * get the Map for clients
     * @return Map Clients in this Map we have client and value number of points
     */
    public Map<Client,Integer> getClients(){
        return this.clients;
    } 
    /**
     * get the seuil
     * @return return the seuil 
     */
    public int getSeuil(){
        return this.seuil;
    } 
    /**
     * get the cout
     * @return return the cout 
     */
    public double getCout(){
        return this.cout;
    }
    /**
     * Gets the loyalty points associated with a specific client.
     * @param client the client for whom loyalty points are queried
     * @return the loyalty points for the specified client
     */
    public int getPoints(Client client){
        return this.clients.get(client);
            
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

        if(!this.clients.containsKey(client)){
            this.points++;
            this.clients.put(client,this.points);
        }
        else{
            this.points=this.clients.get(client)+1;
            this.clients.put(client,this.points);
        } 
         
        if(this.getPoints(client)>this.getSeuil()){
            price=price-(price*this.getCout());
            
        } 
        
        return price;
    }



} 