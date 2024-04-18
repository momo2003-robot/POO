package goose;

public abstract class Board {
    protected int nbOfCells;
    protected Cell[] theCells;


    public Board(int nbOfCells) {
      this.nbOfCells=nbOfCells;
      this.theCells=new Cell[this.nbOfCells+1];
      this.initBoard();
    }

    public Cell getCell(int i) {
        Cell c=new Cell(i);
        if(i>=0 && i<= this.nbOfCells){
            c=this.theCells[i]; 
        } 
        return c;
        

    }

    public int getNbOfCells() {
        return this.nbOfCells;

    }

    public abstract void initBoard();
}


