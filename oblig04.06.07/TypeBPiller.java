
package yosephogoppgave04;


public final class TypeBPiller extends LegeMidler implements Piller {
    
    private int styrke;
    private int antallPiller;
    private double virkstoff;
    private String form;
    private String type;
    
    public TypeBPiller(int unikNummer,String navn,String form,String type, double pris, 
             int antallPiller, double virkstoff,int styrke){
        
        super(unikNummer,navn, pris);
        this.styrke=styrke;
        this.antallPiller=antallPiller;
        this.virkstoff=virkstoff;
        
    }
    /*
    this method returns the number of pills
    */
     public int getAntallPiller(){
        
        return this.antallPiller;
    }
    
     /*
     returns the effect a medicine have
     */
    public double getVirkestoff() {
        
        return this.virkstoff;
    }
    
    /*
    return the amount it would mix to for type B pillers
    */
    public int getStyrke(){
        
        return this.styrke;
    }
}
