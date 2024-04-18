package rental;

import java.util.*;
import rental.filter.*;
import rental.vehicle.*;
import rental.agency.*;


public class MainAgency{
    public static void main(String[] args){
        RentalAgency agence=new RentalAgency();
        SuspiciousRentalAgency suspiciousagence=new SuspiciousRentalAgency();
        FriendlyRentalAgency Friendlyagence=new FriendlyRentalAgency(0.1,2);


        Vehicle clio = new Vehicle("Renault", "Clio", 2014, 20.0);
        Vehicle megane = new Vehicle("Renault", "Megane", 2020, 30.0);
        Vehicle golf = new Vehicle("Volkswagen", "Golf", 2018, 25.0);

        agence.addVehicle(clio);
        agence.addVehicle(megane);
        agence.addVehicle(golf);

        suspiciousagence.addVehicle(clio);
        suspiciousagence.addVehicle(megane);
        suspiciousagence.addVehicle(golf);

        Friendlyagence.addVehicle(clio);
        Friendlyagence.addVehicle(megane);
        Friendlyagence.addVehicle(golf);

        BrandFilter renaultfiltre=new BrandFilter("Renault");
        
        MaxPriceFilter filtremaxPrice=new MaxPriceFilter(30.0);

        System.out.println("\n*Tous les véhicules de l'agence :");
        agence.displayAllVehicles();

        System.out.println("\n*Les véhicules de la marque Renault :");
        agence.displaySelection(renaultfiltre);

        System.out.println("\n*Les véhicules avec un prix inférieur à 30.0 €:");
        agence.displaySelection(filtremaxPrice);

        AndFilter andfiltre=new AndFilter();

        andfiltre.addFilter(renaultfiltre);
        andfiltre.addFilter(filtremaxPrice);
        

        System.out.println("\n*Les véhicules de la marque Renault et avec un prix inférieur à 30.0 €:");
        agence.displaySelection(andfiltre);

        System.out.println("\n **********************Partie Héritage Véhicules**********************");

        Car ford=new Car("Ford","ford",2020,30.0,2);
        Car fabia=new Car("Skoda","fabia",2018,20.0,4);
        Car Audi=new Car("Audi","audi",2018,60.0,4);


        Motorbike Tmax=new Motorbike("Yamaha","Tmax",2019,70.0,500);
        Motorbike NinjaZX6R =new Motorbike("Kawasaki","NinjaZX6R ",2023,80.0,636);

        agence.addVehicle(ford);
        agence.addVehicle(fabia);
        agence.addVehicle(Audi);
        agence.addVehicle(Tmax);
        agence.addVehicle(NinjaZX6R);

        System.out.println("\n*Tous les véhicules de l'agence :");
        agence.displayAllVehicles();

        MaxPriceFilter maxprice=new MaxPriceFilter(80.0);

        AndFilter andfiltre2=new AndFilter();
        andfiltre2.addFilter(maxprice);
        
        System.out.println("\n*Tout les véhicules avec un prix de location moin de 80.0 € :");

        agence.displaySelection(maxprice);



        System.out.println("********************************************************************");

        System.out.println("\n**********************Location de voitures**********************");
        try{


            Client anes=new Client("SEGHIR",22);
            Client didin=new Client("ferdjoukh",21);
            Client clement=new Client("clement",26);

            System.out.println("\n-Renault clio loué son prix de location est "+ agence.rentVehicle(anes,clio)+"€"+" par"+anes.getName());
            System.out.println("\n-Renault megane loué son prix de location est"+agence.rentVehicle(didin,megane)+"€"+" par"+didin.getName());

            System.out.println("\n*Liste de véhicules louées:");
            System.out.println(agence.allRentedVehicles());

            System.out.println("\n*Retour de véhicules louées :");
            agence.returnVehicle(anes);
            agence.returnVehicle(didin);

            System.out.println("\n*Liste de véhicules louées est vide après le retour:");
            System.out.println(agence.allRentedVehicles());

            System.out.println("\n**********************Partie Héritage Agences**********************");

            System.out.println("\n*Tout les véhicules de l'agence Suspicious:");
            suspiciousagence.displayAllVehicles();
            System.out.println("\n**10% pour les clients qui ont moin de 25 ans**");
            System.out.println("\n-Renault clio loué son prix de location est "+ suspiciousagence.rentVehicle(anes,clio)+"€"+" par Mr "+anes.getName()+" "+anes.getAge()+"ans");
            System.out.println("\n-Renault megane loué son prix de location est "+suspiciousagence.rentVehicle(didin,megane)+"€"+" par Mr "+didin.getName()+" "+didin.getAge()+"ans");
            System.out.println("\n-Volkswagen golf loué son prix de location est "+suspiciousagence.rentVehicle(clement,golf)+"€"+" par Mr "+clement.getName()+" "+clement.getAge()+"ans");

            System.out.println("\n*Tout les véhicules de l'agence Friendlyagence:");
            Friendlyagence.displayAllVehicles();
            System.out.println("\n**une réduction de 10% pour les clients fidèle**");
            System.out.println("\n-Renault clio loué son prix de location est "+ Friendlyagence.rentVehicle(anes,clio)+"€"+" par Mr "+anes.getName()+" "+Friendlyagence.getPoints(anes)+" pts");
            Friendlyagence.returnVehicle(anes);
            System.out.println("\n-Renault megane loué son prix de location est "+Friendlyagence.rentVehicle(anes,megane)+"€"+" par Mr "+anes.getName()+" "+Friendlyagence.getPoints(anes)+" pts");
            Friendlyagence.returnVehicle(anes);
            System.out.println("\n**Félicitation Monsieur "+anes.getName()+" vous avez 10% de réduction");
            System.out.println("\n-Volkswagen golf loué son prix de location est "+Friendlyagence.rentVehicle(anes,golf)+"€"+" par Mr "+anes.getName()+" "+Friendlyagence.getPoints(anes)+" pts");


        } 
        catch(UnknownVehicleException | IllegalStateException e ){

        }


        
 
        
        
        

    
    } 
} 