
package yosephogoppgave04;


public final class TypeBMikstur extends LegeMidler implements Mikstur {
    
    private double volume;
    private double virkstoff;
    private double mixture;
    private String type;
    private String form;
    
    public TypeBMikstur(int id,String navn,String form,String type, double pris, 
            double mixture,double virkstoff,int styrke){
        
        super( id,navn, pris);
        this.virkstoff=virkstoff;
        this.volume=volume;
        this.mixture=mixture;
    }
    /*
    returns the amounte it can be mixed or become to liquid
    */
    public double getAmountMixture(){
        
        return this.mixture;
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
