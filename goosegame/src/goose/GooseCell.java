package goose;

public class GooseCell extends Cell {
    public GooseCell(int index) {
        super(index);
    }

    public int bounce(int i){
        return this.index+i;
    } 

    public TypeCells getType(){
        return TypeCells.GOOSE;
    } 

    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    } 



    
}