package image.color ;

public class GrayColor {
    public static final GrayColor BLACK = new GrayColor(0) ;
    public static final GrayColor WHITE = new GrayColor (255) ;
    /*pour les utiliser 
    *GrayColor blackColor = GrayColor.BLACK;
    *GrayColor whiteColor = GrayColor.WHITE;
    */

    private int grayLevel ;
    private double alpha ;

    public GrayColor(int level) {
        if (level < 0 || level > 255 ) {
            throw new IllegalArgumentException("level must be between 0 and 255.");
        }
        grayLevel = level ;
        alpha = 1.0 ;
    }

    public int getGrayLevel() {
        return grayLevel ;
    }

    public double getAlpha() {
        return alpha ;
    }

    public void setAlpha(double a) {
        if (a < 0 || a > 1) {
            throw new IllegalArgumentException("Alpha must be between 0 and 1.");
        }
        alpha = a ;
    }

    public boolean equals(Object o) {
        if (!(o instanceof GrayColor)){
            return false;
        }
        //else
        GrayColor other = (GrayColor) o ;
        return (this.grayLevel == other.grayLevel) && (this.alpha == other.alpha);
    }




    }










