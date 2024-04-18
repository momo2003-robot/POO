package battleship;

import battleship.util.Position ;

import java.util.Arrays ;


public class Sea  {

    private Cell[][] cells;
    private int remainingLifePoints = 0 ;

    public Sea (int dimx, int dimy){

        cells = new Cell[dimx][dimy] ;

        for (int i=0; i<this.cells.length; i++){
            for (int j=0; j<this.cells.length;j++){
                this.cells[i][j] = new Cell();
            } 
            
        }
        
    }


    public void addShip(Ship s, Position p){

        Cell cell = this.cells[p.getX()][p.getY()] ;

        if (cell.getShip() == null ) {

                cell.setShip(s) ;

                this.remainingLifePoints ++ ; }

} 


    
    public Answer shoot(Position p ) {

        Cell cell = this.cells[p.getX()][p.getY()] ;

        Answer answer =  cell.Shot() ;

        if (answer != Answer.missed) {
            this.remainingLifePoints -- ; }
        
        


        return answer ; 

    }


    public int getRemaningLifePoints() {
        return this.remainingLifePoints ;
    }


    public void display ( boolean defender) {

        boolean lastInLine ;

        for (Cell[] line : this.cells ) {

            for (Cell cell : line ) {

                lastInLine = Arrays.asList(line).indexOf(cell) == (line.length - 1);  

                char c = cell.toCharacter(defender) ;

                String s = ""+c ;
                
                if (lastInLine)

                System.out.println(s) ;

                //System.out.print(""+c) ;
                else 

                System.out.print(s) ;
                

            }

        }

    }

    private void testIfShipCanBePlacedVertically(Ship shipToPlace, Position position) throws IllegalStateException {

        int verticalLength = shipToPlace.getLifePoints() ;
        Position[] positions ;
        positions = new Position [verticalLength] ;

        for ( int i = 0 ; i < positions.length; i++ ) {
                    positions[i] = new Position(position.getX()+i,position.getY() ) ;}

        
        char c ;

        for ( Position pos : positions ) {

            try {

            c = this.cells[pos.getX()][pos.getY()].toCharacter(true) ;

             }

            catch (ArrayIndexOutOfBoundsException e) {

                throw new IllegalStateException() ;
            }

            if (c != '∼' )
                throw new IllegalStateException() ;


        }






}


    public void addShipVertically(Ship shipToPlace, Position position) throws IllegalStateException {

        this.testIfShipCanBePlacedVertically(shipToPlace,position) ;


        int verticalLength = shipToPlace.getLifePoints() ;
        Position[] positions ;
        positions = new Position [verticalLength] ;

        for ( int i = 0 ; i < positions.length; i++ ) {
                    positions[i] = new Position(position.getX()+i,position.getY()) ;}



        for ( Position pos: positions ) {

            this.addShip(shipToPlace, pos) ;

        }

    }





    private void testIfShipCanBePlacedHorizontally(Ship shipToPlace, Position position) throws IllegalStateException {

        int horizontalLength = shipToPlace.getLifePoints() ;
        Position[] positions ;
        positions = new Position [horizontalLength] ;

        for ( int i = 0 ; i < positions.length; i++ ) {
                    positions[i] = new Position(position.getX(),position.getY()+i) ;}

        
        char c ;

        for ( Position pos : positions ) {

            try {

            c = this.cells[pos.getX()][pos.getY()].toCharacter(true) ;

             }

            catch (ArrayIndexOutOfBoundsException e) {

                throw new IllegalStateException() ;
            }

            if (c != '∼' )
                throw new IllegalStateException() ;


        }






}


    public void addShipHorizontally(Ship shipToPlace, Position position) throws IllegalStateException {

        this.testIfShipCanBePlacedHorizontally(shipToPlace,position) ;


        int horizontalLength = shipToPlace.getLifePoints() ;
        Position[] positions ;
        positions = new Position [horizontalLength] ;

        


        for ( int i = 0 ; i < positions.length; i++ ) {
                    positions[i] = new Position(position.getX(),position.getY()+i) ;}




        for ( Position pos: positions ) {

            this.addShip(shipToPlace, pos) ;

        }

    }


    public void addShip(Ship shipToPlace, Position position, int dx, int dy) throws IllegalStateException {

            if (dx == 0)
                this.addShipHorizontally(shipToPlace,position) ;

            if (dy == 0)
                this.addShipVertically(shipToPlace,position) ;
    }






    }