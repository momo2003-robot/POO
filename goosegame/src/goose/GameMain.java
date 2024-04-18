package goose;
import goose.*;

public class GameMain{
    public static void main(String[] args){
       
        if (args.length < 1){
            ClassicalBoard board = new ClassicalBoard();
            board.getAllCells();
            System.out.println("please give players");
            System.exit(1);
        }
        else{
            ClassicalBoard board = new ClassicalBoard();
            board.initBoard();
            Game game = new Game(board);
            for(int i =0; i<args.length;i++){
                Player player = new Player(args[i]);
                game.addPlayer(player);
            }
            game.play();
        }
    } 
} 