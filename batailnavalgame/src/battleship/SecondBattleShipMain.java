package battleship ;

import battleship.util.Position ;

public class SecondBattleShipMain {

	public static void main(String[] args) throws java.io.IOException{
		
		Sea plateau = new Sea(10,10) ;

		Ship bateau1 = new Ship(3) ;
		Position bat1_pos1 = new Position(1,1) ;
		Position bat1_pos2 = new Position(1,2) ;
		Position bat1_pos3 = new Position(1,3) ;
		plateau.addShip(bateau1,bat1_pos1) ;
		plateau.addShip(bateau1,bat1_pos2) ;
		plateau.addShip(bateau1,bat1_pos3) ;


		Ship bateau2 = new Ship(2) ;
		Position bat2_pos1 = new Position(5,1) ;
		Position bat2_pos2 = new Position(5,2) ;
		plateau.addShip(bateau2,bat2_pos1) ;
		plateau.addShip(bateau2,bat2_pos2) ;
	


		System.out.println("Battleship starts! the defender :") ;
		plateau.display(true) ;



		System.out.println("Battleship starts! to attacker :") ;
		Game jeu = new Game(plateau) ;

		

		jeu.play() ;




	}
}