package goose;
import java.util.Random;



public class Player{
    private static Random random=new Random();
    protected Cell cell;
    protected String name;

    public Player(String name){
        this.name=name;
        this.cell=null;
    } 

    public String toString(){
        return this.name;
    } 

    public Cell getCell(){
        return this.cell;
    } 

    public void setCell(Cell newCell){
        this.cell=newCell;
    } 

    private int oneDieThrow(){
        return Player.random.nextInt(6)+1;
    } 

    public int twoDiceThrow(){
        int result=oneDieThrow()+oneDieThrow();
        return result;
    }  

} 