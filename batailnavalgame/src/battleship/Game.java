package battleship ;

import io.Input ;
import battleship.util.Position ;

public class Game {
		
	Sea sea ;


	public Game(Sea sea) {
		this.sea = sea ;
	}



	private Position inputPosition() throws java.io.IOException{

		int xInt = -1 ;
		int yInt  = -1;

		while (xInt == -1) {

		try { 

			System.out.print(" enter position : x coordinate ? ");
      		xInt = Input.readInt() ;}
      	catch (java.io.IOException e) {
      		System.out.print(" enter position : x coordinate ? ");
      		xInt = Input.readInt() ;}

      	}

      	while (yInt == -1) {

		try { 

			System.out.print(" enter position : y coordinate ? ");
      		yInt = Input.readInt() ;}
      	catch (java.io.IOException e) {
      		System.out.print(" enter position : y coordinate ? ");
      		yInt = Input.readInt() ;}

      	}

		
        Position position
         = new Position(xInt,yInt) ;
      	
      	return position ;
	}


	public Sea getSea() {

		return this.sea ;
	}


    public void play() throws java.io.IOException {

    	Position position ;



    	while (true) {
    	 
    	 this.sea.display(false) ;
    	 System.out.println("Attacker : choose a position to attack !") ;
    	 position = this.inputPosition() ;
  	     Answer result = this.sea.shoot(position);
    	 System.out.println(result.toString());

   
    	 if (this.sea.getRemaningLifePoints() == 0) {
    	 		System.out.println("All ships destroyed. Game is over!.") ;
    	 		break ;
    	 	}

    	 }

	}





}