
package oblig6;


public class Ord {
   private final  String word;
  private int counter;
    Ord(String w){
        word=w;
        counter=0;
    }
 
   public  String toString(){
        return word;
    }
   int hentAntall(){
       return counter;
   }
   void oakAntall(){
       counter++;
   }
}
