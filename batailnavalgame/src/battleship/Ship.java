package battleship;

public class Ship{
    /**life point of ship */
    private int lifepoints;

    /**build a ship with given lifepoints
     * @param lifepoints this ship lifepoints
     */
    public Ship(int lifepoints){
        this.lifepoints = lifepoints;
    }
    /* @return the LifePoints of ship
    * */
    public int getLifePoints(){
        return this.lifepoints;

    }
    /*@return false if ship has not been sunck
       @return true if ship has been sunck * */

    public boolean hasBeenSunk(){
       
        return lifepoints <= 0;
    }

    
    /**remove 1 lifepoints if ship beenhitting(if true) */

    public int beenHitting(){
        return this.lifepoints = this.getLifePoints()-1;
       
    
    }

    /** */
    public String toString(){
        return "ship lifepoints: " + this.lifepoints;
    }
}