package goose;

public class WaitingCell extends Cell {
    protected int nbrounds;
    protected int time;
    public WaitingCell(int index,int nbrounds) {
        super(index);
        this.nbrounds=nbrounds;
        this.time=nbrounds;

    }

    public int getNbRounds(){
        return this.nbrounds;
    } 

    public int getTime(){
        return this.time;
    } 

    public String getWaitingTime(){
      return "waiting for "+getTime()+" turns";
    }

    public boolean playerCanPlay(){
        if(this.time==0){
            return true;
        }
        this.time=this.time-1; 
        return false;
    } 

    public void putPlayer(Player p){
        super.putPlayer(p);
        this.time=this.nbrounds;
    } 

    public TypeCells getType(){
        return TypeCells.WAITING;
    } 

    public String toString(){
        return this.getType()+"Cell"+" "+getIndex()+" "+this.getWaitingTime();
    } 

}