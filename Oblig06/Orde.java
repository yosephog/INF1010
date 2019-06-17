
package ord;


public class Orde {

  private final  String word;
  private int counter;
    Orde(String w){
        word=w;
        counter=0;
    }
  @Override
   public  String toString(){
        return word;
    }
   int hentAntall(){
       
       return counter;
   }
   void oakAntall(){
       counter++;
   }
    public static void main(String[] args) {
        
        Orde a=new Orde("forest");
       
        a.oakAntall();
        System.out.println("the word is " + a.toString());
        System.out.println(" the number is " + a.hentAntall());
        
        Orde b=new Orde("granite");
        b.oakAntall();
        System.out.println("the word is " + b.toString());
        System.out.println("the number is " + b.hentAntall());
        
        Orde c=new Orde("utmark");
        c.oakAntall();
        System.out.println("the word is " + c.toString());
        System.out.println("the number is " + c.hentAntall());
    }
    
}

