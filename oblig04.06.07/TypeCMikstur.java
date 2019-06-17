
package yosephogoppgave04;


public final class TypeCMikstur extends LegeMidler implements Mikstur {
    
    private double volume;
    private double virkstoff;
    private String form;
    private String type;
    
     public TypeCMikstur(int id,String navn,String form,String type, double pris,
             double volume, double virkstoff){
        
        super(id,navn, pris);
        this.virkstoff= virkstoff;
        this.volume= volume;
        
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
