
package yosephogoppgave04;


public final class TypeAMikstur extends LegeMidler implements Mikstur{
    
    private int sterk;
    private double volume;
    private double virkstoff;
    private String form;
    private String type;
    
    public TypeAMikstur(int id,String navn,String form,String type, double pris, 
            double volume, double virkstoff,int sterk){
        
        super(id,navn, pris);
        this.sterk=sterk;
        this.virkstoff=virkstoff;
        this.volume=volume;
        this.form=form;
    }
    /*
    return the strenth of the type A narkotisk
    */
    public int getSterk(){
        
        return this.sterk;
    }
    /*
    returns the volume or amount of the liquid medicene
    */
    public double getVolume(){  
        
        return this.volume;
    }
    
    /*
    returns the effect of the medicene that is in cubic cenetimeter
    */
    public double getVirkestoff(){
        
        return this.virkstoff;
    }
}
