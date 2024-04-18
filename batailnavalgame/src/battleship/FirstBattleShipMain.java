package battleship;

import battleship.util.Position ;


public class  FirstBattleShipMain {

	public static void main(String[] args) {


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
	


		System.out.println("To the defender") ;
		plateau.display(true) ;

		System.out.println("To the attacker") ;
		plateau.display(false) ;


		System.out.println("Shooting "+bat1_pos3) ;
		plateau.shoot(bat1_pos3) ;
		System.out.println("Shooting "+bat1_pos3) ;
		plateau.shoot(bat2_pos1) ;




		System.out.println("To the defender") ;
		plateau.display(true) ;

		System.out.println("To the attacker") ;
		plateau.display(false) ;


	}
}