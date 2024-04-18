package goose;


public class ClassicalBoard extends Board{

    public ClassicalBoard () {
      super(63);
    }

    public void initBoard() {
        
        for(int i=0; i<this.nbOfCells+1; i++){
            this.theCells[i] = new Cell(i);
        }
      this.theCells[0]=new StartCell(0);
       
      // les cases Oie
      this.theCells[9]  = new GooseCell(9);
      this.theCells[18] = new GooseCell(18);
      this.theCells[27] = new GooseCell(27);
      this.theCells[36] = new GooseCell(36);
      this.theCells[45] = new GooseCell(45);
      this.theCells[54] = new GooseCell(54);
      // les cases Pièges
      this.theCells[31] = new TrapCell(31);
      this.theCells[52] = new TrapCell(52);
      // case d'attente(19)
      this.theCells[19] = new WaitingCell(19,2);
      //cases de teleportation
      this.theCells[6] = new TeleportationCell(6,12);
      this.theCells[42] = new TeleportationCell(42,30);
      this.theCells[58] = new TeleportationCell(58,1);



    }

    public Cell getCell(int i){
        return this.theCells[i];  
    } 


    public Cell getAllCells(){
       Cell c=new Cell(0);
        for(int i=0;i<this.theCells.length;i++){
            c=this.getCell(i);
            System.out.println(c);
        } 
        return c;
        
    } 

      


}

