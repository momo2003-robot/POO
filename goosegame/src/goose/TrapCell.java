package goose;

public class TrapCell extends Cell {
    public TrapCell(int index) {
        super(index);
    }

    public boolean playerCanPlay(){
        return false;
    }

    public TypeCells getType(){
        return TypeCells.TRAP;
    } 

    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    } 

 

}