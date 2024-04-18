package goose;

public class StartCell extends Cell{
    public StartCell(int index) {
        super(index);
    }

    public TypeCells getType() {
        return TypeCells.START;
    }

    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    }


}