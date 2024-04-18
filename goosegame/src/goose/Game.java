package goose;
import java.util.*;

public class Game{
    protected List<Player> theplayers;
    protected Board board;
    protected Iterator<Player> iterator;

    public Game(Board board){
        this.board=board;
        this.theplayers=new ArrayList<Player>();
        
    } 

    public void addPlayer(Player p){
        this.theplayers.add(p);
        StartCell c = new StartCell(0);
        p.setCell(c);
        c.putPlayer(p);
    }
    public Board getBoard(){
        return this.board;
    } 

    public int indexMoving(int i){
        if(i>this.board.getNbOfCells()){
            int returnInt=i-this.board.getNbOfCells();
            return this.board.getNbOfCells()-returnInt;
        } 
        return i;
    } 

    public void movingPlayer(Player p,int i){
        Cell currentCell=p.getCell();
        int currentIndex=currentCell.getIndex();
        int nextIndex=this.indexMoving(currentIndex+i);
        Cell nextCell=this.board.getCell(nextIndex);
        int bounceIndex=this.indexMoving(nextCell.bounce(i));
        Cell bounceCell=this.board.getCell(bounceIndex);
        System.out.println(p.toString() + " is on the cell  " +bounceCell.getType()+" " +currentIndex+ " ," +p.toString()+" throws " + i +" and reaches "+ nextCell.getIndex()+ " ");
        if(nextCell.getType() != TypeCells.NORMAL){
            if(nextCell.getType()==TypeCells.WAITING){
                System.out.println(p.toString()+" is on a "+nextCell.getType()+" "+bounceCell.getIndex()+" "+bounceCell.toString());
            } 
            System.out.println(p.toString()+" is on a "+nextCell.getType()+" and so jumps to "+bounceCell.getIndex()+" ");
        }

        if(!bounceCell.isEmpty()){
            Player otherplayer=bounceCell.getPlayer();
            otherplayer.setCell(currentCell);
            currentCell.putPlayer(otherplayer);
            p.setCell(bounceCell);
            bounceCell.putPlayer(p);
            System.out.println(" cell is busy "+otherplayer.toString()+" " );
            System.out.print( " and so jumps to "+ bounceCell.getIndex()+" ");

        } 
        bounceCell.putPlayer(p);
        p.setCell(bounceCell);

    } 

    public boolean isFinished(){
        Cell finalCell=this.board.getCell(this.board.getNbOfCells());
        if(finalCell.isEmpty()){
            return false;
        } 
        return true;
    }

    public Player nextPlayer(){
        
        if(this.iterator.hasNext()){
            return this.iterator.next();
        } 
        this.iterator=this.theplayers.iterator();
        return this.iterator.next();
    } 

    public void play(){
        for(Player p:this.theplayers){
            p.setCell(this.board.getCell(1));
        } 
        
        this.iterator=this.theplayers.iterator();
        while(!this.isFinished()){
            Player p=this.nextPlayer();
            Cell c=p.getCell();
            if(c.playerCanPlay()){
               int index= p.twoDiceThrow();
               this.movingPlayer(p,index);
            } 
            else{
              String answer = p.toString() + " is in "+ c.toString()+", "+p.toString() + " cannot play ";
              System.out.println(answer);
            }
        } 
        Player p = this.board.getCell(63).getPlayer();
        System.out.println(p.toString()+" has won ");
        System.out.println("CONGRATULATIONS !!");


    } 











 

    


} 