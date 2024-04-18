package image;

import image.ImageInterface;
import image.color.GrayColor;
import image.UnknownPixelException;


public class Image implements ImageInterface {
    private Pixel[][] pixels ;

    public Image(int width, int height) {
        pixels = new Pixel[width][height] ;
        for (int x = 0 ; x < width ; x++) {
            for (int y =0 ; y< height ; y++) {
                pixels[x][y] = new Pixel(GrayColor.WHITE.getGrayLevel()) ;
            }
        }
    }

    public int getHeight() {
        return pixels[0].length ;
    }

    public int getWidth() {
        return pixels.length ;
    }

    public Pixel getPixel(int x, int y) {
        if (x>=0 && x< getWidth() && y>= 0 && y < getHeight()) {
            return pixels[x][y] ;
        }
        else {
            throw new UnknownPixelException("Ce pixel n'est pas dans l'image") ;
        }
    }

    public void changeColorPixel(int x, int y, GrayColor color) throws UnknownPixelException {
        if (x >= 0 && x < getWidth() && y >= 0 && y < getHeight() ) {
            getPixel(x,y).setColor(color) ;
        }
        else {
            throw new UnknownPixelException ("Ce pixel n'existe pas dans l'image" ) ;
        }
    }

    public void fillRectangle(int x, int y, int width, int height, GrayColor color) {
        for (int i = x ; i < x + width ; i++ ) {
            for (int j = y ; j < y + height ; j++ ) {
                if (i >= 0 && i < getWidth() && j >= 0 && j < getHeight() ) {
                    changeColorPixel(i, j, color) ;
                }
            }
        }
    }


    /**
     * Creates a new image by replacing the color of each pixel with the inverse grayscale value.
     *
     * @return The new image with inverted colors.
     */
    public Image negative() {
        Image negativeImage = new Image(getWidth(), getHeight()) ;

        for (int x = 0 ; x < getWidth() ; x++) {
            for (int y = 0 ; y < getHeight() ; y++) {
                GrayColor couleur = getPixel(x, y).getColor() ;
                int levelNeg = 255 - couleur.getGrayLevel() ; 
                GrayColor couleurNeg = new GrayColor(levelNeg) ;
            
                negativeImage.changeColorPixel(x, y, couleurNeg) ;
            }
        }
        return negativeImage ;

    }


    /**
     * Creates a new image by extracting edges from the original image based on a specified threshold.
     *
     * @param threshold The threshold value for edge extraction.
     * @return The new image with extracted edges.
     */
    public Image edgeExtraction(int threshold) {
        Image edgeImage = new Image(getWidth(), getHeight());

        for (int x = 0; x < getWidth() - 1; x++) {
            for (int y = 0; y < getHeight() - 1; y++) {
                int diffX = Math.abs(getPixel(x, y).getColor().getGrayLevel() - getPixel(x + 1, y).getColor().getGrayLevel());
                int diffY = Math.abs(getPixel(x, y).getColor().getGrayLevel() - getPixel(x, y + 1).getColor().getGrayLevel());

                if (diffX > threshold || diffY > threshold) {
                    edgeImage.changeColorPixel(x, y, GrayColor.BLACK);
                }
            }
        }
        return edgeImage;
    }


    public Image decreaseNbGrayLevels(int NbGrayLevels){
        Image resultImage = new Image(this.getWidth(),this.getHeight());
        for(int i = 0;i<this.getWidth();i++){
            for(int j = 0 ; j<this.getHeight();j++){
                Pixel originalPixel = this.pixels[i][j];
                int originalgraylevel = originalPixel.getColor().getGrayLevel();
                int t = 256 / NbGrayLevels;
                int k = originalgraylevel / t;
                int min = k*t;
                int max = (k+1)*t;
                if((originalgraylevel >= min)&&(originalgraylevel < max)){
                    GrayColor newcolor = new GrayColor(min);
                    resultImage.pixels[i][j].setColor(newcolor);
                }
            }
        }
        return resultImage;
    }






}