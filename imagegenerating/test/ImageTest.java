package image;

import image.Image;
import static org.junit.Assert.*;
import org.junit.Test;
import image.color.GrayColor;

public class ImageTest {
    private Image image ;

    public void setUp() {
        image = new Image(250,150) ;
    }

    @Test
    public void testGetWidth() {
        assertEquals(250, image.getWidth()) ;
    }

    @Test 
    public void testGetHeight() {
        assertEquals(150, image.getHeight()) ;
    }

    @Test void testChangeColorPixel() {
        image.changeColorPixel(15, 20, GrayColor.BLACK);
        assertEquals(GrayColor.BLACK, image.getPixel(15, 20).getColor()) ;
    }

    @Test
    public void testFillRectangle() {
        image.fillRectangle(15, 20, 30, 20, new GrayColor(150)) ;
        for (int x = 15 ; x < 45 ; x++) {
            for (int y = 20 ; y < 40 ; y++) {
                assertEquals(new GrayColor(150), image.getPixel(x, y).getColor()) ;
            }
        }
    }

    @Test 
    public  static void testNegativeMethod() {
        Image testImage = new Image(1, 1) ;
        testImage.changeColorPixel(0, 0, new GrayColor(125)) ;

        Image negativeImage = testImage.negative() ;
        GrayColor couleurNeg = negativeImage.getPixel(0, 0).getColor() ;

        assertEquals(new GrayColor(130), couleurNeg) ; 

    }
    /*
    @Test 
    public static void testedgeExtraction(){
        Image testImage1 = new Image(2 , 2);
        Image edgeImage = new Image(testImage1.getWidth(), testImage1.getHeight());
       
     
        assertEquals(GrayColor.BLACK, edgeImage.edgeExtraction(10).getPixel(1,1).getColor())    ;
     }
    **/
}