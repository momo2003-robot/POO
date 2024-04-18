package goose;

public class Cell {
    protected int index;
    protected Player player;

    public Cell(int index) {
        this.index=index;
        this.player=player;
    }

    public int getIndex() {
        return this.index;
    }

    public Player getPlayer(){
        return this.player;
    }

    public boolean playerCanPlay(){
        return true;
    } 

    public TypeCells getType(){
        return TypeCells.NORMAL;
    } 

    public int bounce(int index){
        return this.index;
    } 

    public boolean isEmpty(){
        return this.player==null;
    } 

    public void putPlayer(Player p){
        this.player=p;
    } 

    public String toString() {
        return "Cell "+ this.getIndex();
    }


    public boolean equals(Object o){
        if(!(o instanceof Cell)){
          return false;
        }
        else{
          Cell other =(Cell) o;
          return this.getIndex()== other.getIndex();
        } 

    }



    
    

    






}




