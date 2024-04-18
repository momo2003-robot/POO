public class rectangle {

     /**la largeur de ce rectangle */
     private double largeur;
     /**la longeur de ce rectangle */
     private double longeur;
     /**le calcule daire de rectangle */
     public double air(){
        return largeur * longeur;
     }
     /**le calcule de perimetre de rectangle */
     public double perim(){
        return 2 * (largeur + longeur);

     }
     /**
      *constructeur de la classe rectangle param:longeu et largeur
      */
     public rectangle(double largeur, double longeur){
        this.largeur = largeur;
        this.longeur = longeur;
         
    
     }
     /** savoir si le rectangle est carré*/
     public boolean carre(){
        return largeur == longeur;
     }
     /**tester legalite de rectangle avec un autre objets */
     @Override
     public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    rectangle other = (rectangle) o;
    return Double.compare(other.longeur, longeur) == 0 && Double.compare(other.largeur, largeur) == 0;
}

     /**avoir la largeur de rectangle */
     public double getlarg(){
        return  largeur ;
     }
     /**avoir la longeur de rectangle */
     public double getlong(){
        return  longeur ;
     }
     /**decrire le rectangle */
     public String toString(){

      return "ce rectagle a comme longeur" + longeur + "est comme largeur" + largeur ;
     }
     
    
        

    
     }

