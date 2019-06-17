
package yosephogoppgave04;


public final class TypeAPiller extends LegeMidler implements Piller {
    
    private int sterk;
    private int antallPiller;
    private double virkstoff;
    private String form;
    private String type;
    
    public TypeAPiller(int id,String navn,String form,String type, double pris, 
            int antallPiller, double virkstoff,int sterk)
    {
        
        super( id,navn, pris);
        this.sterk=sterk;
        this.antallPiller=antallPiller;
        this.type=type;
        this.form=form;
        this.virkstoff=virkstoff;
        
    }
    
    /*
    retrun the number of pills
    */
    public int getAntallPiller(){
        
        return this.antallPiller;
    }
    
    /*
    returns the effect of the medicene
    */
    public double getVirkestoff() {
        
        return this.virkstoff;
    }
    
    /*
    return the strength of the medicene
    */
    
    public int getSterk(){
        
        return this.sterk;
    }
}
