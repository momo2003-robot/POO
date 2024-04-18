public class rectanglemain{

    public static void main(String[] args){
        rectangle rect1 = null;

            if (args.length == 1) {

                double largeur = Double.parseDouble(args[0]);
                double longeur = Double.parseDouble(args[0]);
                rect1 = new rectangle(largeur, longeur);


                
            } else if (args.length == 2) {
                double largeur = Double.parseDouble(args[0]);
                double longeur = Double.parseDouble(args[1]);
                rect1 = new rectangle(largeur, longeur);
                
                
            }
            /**je cree mes deux rectangle */


   



            rectangle rect2 = new rectangle(5.0, 5.0);
        /**jafiche les resultats de to string */
        System.out.println("rectangle1 :" + rect1.toString());
        System.out.println("rectanle2:" + rect2.toString());

        /**calcule dair et perim */
        double airrect1 = rect1.air();
        double perimrect1 = rect1.perim();
        System.out.println("air de rct1" + airrect1);
        System.out.println("perim de rect1" + perimrect1);

        /**verifiez si les rect sont carre  */
        boolean estcarre1 = rect1.carre();
        boolean estcarre2 = rect2.carre();
        System.out.println("est ce que rect1 estcarre" + estcarre1);
        System.out.println("est ce que rect2 est carre" + estcarre2);

        /**testez legalite */
        boolean sontegaux = rect1.equals(rect2);
        System.out.println("les deux rect sont egaux :" + sontegaux);



    }



}