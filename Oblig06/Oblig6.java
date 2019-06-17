
package oblig6;


public class Oblig6 {

   
    public static void main(String[] args) throws Exception{
        Ordeliste a=new Ordeliste();
        a.lesBok("scarlet.text");
        a.add("Scarlet.text");
        
        Ord b=a.findord("Holmes");
        System.out.println(" the word holmes is repeted " + b.hentAntall() + " times");
        b=a.findord("elementary");
        System.out.println("the word elementary is repeted " + b.hentAntall() + " times");
        
        b=a.vanligste();
        System.out.println(" the most repeted word is " + b.toString());
        System.out.println("it is  " + b.hentAntall());
      
        
        
    }
    
}
