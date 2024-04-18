package vlille;
import vlille.util.BikeModel;
import vlille.BikeStation;
import vlille.Bike;
import vlille.BikeNotAvailableException;

public class BikeStationMain{
   public static void main(Bike[] bikes){
        BikeStation station = new BikeStation("Timoleon", 10);
        Bike bike1 = new Bike("b001", BikeModel.CLASSIC);
        Bike bike2 = new Bike("b002", BikeModel.ELECTRIC);
        station.dropBike(bike1);
        station.dropBike(bike2);
   }

}
