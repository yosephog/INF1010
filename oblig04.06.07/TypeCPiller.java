
package yosephogoppgave04;


public final class TypeCPiller extends LegeMidler implements Piller {
    
    private int antallPiller;
    private double virkstoff;
    private String type;
    private String form;
    
    public TypeCPiller(int id,String navn,String form,String type, double pris,
            int antallPiller, double virkstoff){
        
        super( id,navn, pris);
        this.antallPiller=antallPiller;
        this.virkstoff=virkstoff;
        
    }
    /*
    returns the number of pills for type C piller
    */
     public int getAntallPiller(){
        
        return this.antallPiller;
    }
    
     /*
     returns the effect of the type c piller medicine
     */
    public double getVirkestoff() {
        
        return this.virkstoff;
    }
}
