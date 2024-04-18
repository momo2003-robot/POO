package image;

import image.color.GrayColor;


public class Pixel {
    private GrayColor color ;

    public Pixel(int grayLevel) {
        this.color = new GrayColor(grayLevel) ;
    }

    public void setColor(GrayColor color) {
        this.color = color ;
    }

    public GrayColor getColor() {
        return this.color ;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pixel)) {
            return false ;
        }
        //else
        Pixel other = (Pixel)o ;
        return (this.getColor().equals(other.getColor())) ;
    }
    
    public int colorLevelDifference(Pixel p) {
        return Math.abs(this.color.getGrayLevel() - p.color.getGrayLevel()) ;

    }

}









    


