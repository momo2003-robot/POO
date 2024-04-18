package image;

import image.*;
import image.color.*;
import image.util.*;
import image.util.ImageDisplayer;


public class ImageMain {
    private static final String LAMP_IMAGE = "/images/lamp.pgm" ;
    public static void main(String[] args ) {
        
        ImageDisplayer displayer = new ImageDisplayer();

        //Q7
        Image image = new Image (200, 150) ;
        image.fillRectangle(20, 30, 30, 50, GrayColor.BLACK) ; 
        image.fillRectangle(50, 100, 40, 40, new GrayColor(128)) ;
        image.fillRectangle(90, 20, 70, 50, new GrayColor(200)) ;
        displayer.display(image, "resultat Q7") ;

        //Q9
        Image lampImg = ImageLoader.loadPGM(LAMP_IMAGE) ;
        Image imageNegative = lampImg.negative() ;
        displayer.display(lampImg, "image originale", 120, 230) ;
        displayer.display(imageNegative, "image Negative", 620, 230) ;

        //Q11
        Image image1 = ImageLoader.loadPGM(LAMP_IMAGE);
        Image imageedge = image1.edgeExtraction(10);
        displayer.display(imageedge , "imageectract" , 400 , 230);
        //Q13
        Image image2 = ImageLoader.loadPGM(LAMP_IMAGE);
        Image imagedecrease = image2.decreaseNbGrayLevels(10);
        displayer.display(imagedecrease,"imagedecred",400, 230);
    }


}