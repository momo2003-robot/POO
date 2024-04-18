package battleship ;

import battleship.util.Position ;

public class ThirdBattleShipMain {

	public static void main(String[] args) throws java.io.IOException {


		Sea plateau = new Sea(10,10) ;

		Ship bateau1 = new Ship(4) ;
		Ship bateau2 = new Ship(5) ;

		Position pos1 = new Position(8,3) ;
		Position pos2 = new Position(0,3) ;

		plateau.addShip(bateau1,pos1,0,4) ;
		plateau.addShip(bateau2,pos2,5,0) ;


		System.out.println("Battleship starts! the defender :") ;
		plateau.display(true) ;



		System.out.println("Battleship starts! to attacker :") ;
		Game jeu = new Game(plateau) ;

		

		jeu.play() ;



		
	}

		
}