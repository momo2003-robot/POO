package battleship ;

public class Cell{
  private Ship ship;
  private boolean shot;

  public Cell() {
    this.ship = null ;
    this.shot =false;
  }

  public Ship getShip () {
    return this.ship;
  }

  public void setShip(Ship ship){
    this.ship = ship;
  }

  public boolean hasBeenShot(){
    return this.shot;
  }

  public Answer Shot(){
    if (this.ship==null){
      this.shot = true;
      return Answer.missed;
    }
    else{
      if (!this.hasBeenShot()){
        this.shot = true;
        this.ship.beenHitting();
        if(this.ship.hasBeenSunk()){
          return Answer.sunk;
        }else{
          return Answer.hit;
        }
      } 
      else{
        return Answer.missed;
      }
    }
    }
  public char toCharacter(boolean defender){
    char c = ' ';
    if (defender) {
      if (this.getShip()==null){
        c= '∼';
        return c;
      }  
      if ((this.getShip()!=null) && (!this.shot)){
        c = 'B';
        return c;

      } else{
        c = '*';
        return c;
      }

    }else{
      if (!this.shot){
        c = '.';
        return c;
      } 
        
      if (this.shot && this.ship == null ){
        c = '∼';
        return c;
      }  
      if (this.ship != null && this.shot){
        c = '*';
        return c;
      }        
    }
   return c;

 }
}

