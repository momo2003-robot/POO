package goose;

public class TeleportationCell extends Cell {
    protected int telIndex;
    public TeleportationCell(int index,int telIndex) {
        super(index);
        this.telIndex=telIndex;

    }

    public int getTelportIndex(){
        return this.telIndex;
    } 

    public int bounce(){
        return this.telIndex;
    } 
    public TypeCells getType(){
        return TypeCells.TELEPORTATION;
    }  

    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    } 

}