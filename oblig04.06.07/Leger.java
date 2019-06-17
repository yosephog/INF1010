
package yosephogoppgave04;


public class Leger implements Comparable<Leger>,Lik,Avtale{
    
    private String uniktNavn;
    private String avtaleNummer;
    public Leger(String uniktNavn,String avtale) {
        
        this.uniktNavn=uniktNavn; 
        this.avtaleNummer=avtale;
    }
    
    
    /*
    this method returns true if the name in the parameter 
    is the same as this.navn
    */
    public boolean samme(String name){
        
        return this.uniktNavn.equalsIgnoreCase(name);
    }

    @Override
    public int compareTo(Leger o) {
        return this.uniktNavn.compareTo(o.getNavn());
    }
    
    public String getNavn(){
        return this.uniktNavn;
    }
     public String getAvtaleNummer(){
       
       return this.avtaleNummer;
   }
    public String toString(){
        return this.uniktNavn;
    }
}
