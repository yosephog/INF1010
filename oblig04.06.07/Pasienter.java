
package yosephogoppgave04;


public final class Pasienter {
    
   private String navn;
   private String fodselsNummer;
   private String address;
   private int  unikNummer;
   private String postNummer;
   
   public Pasienter(int unikNummer,String navn, String fodselsNummer,
           String address, String postNummer) {
       
       this.navn=navn;
       this.fodselsNummer=fodselsNummer;
       this.address=address;
       this. unikNummer=unikNummer;
       this.postNummer= postNummer;
               
       
   }
   
   public String getNavn(){
       
       return this.navn;
   }
   
   /*
   return the 11 digit fodselsnummer
   */
   public String getFodselsNummer(){
       
       return this.fodselsNummer;
   }
   
   /*
   returns a string address that is a combnation of address 
   that is string and gatenavn that is number
   */
   public String getAddress(){
       
       return this.address;
   }
   
   /*
   this method returns the unik number given to the pasient when
   he/she is registerd that starts with 0
   */
   
   
   
   public int getUnikNummer(){
       
         return this.unikNummer;
   }
   
   public String getPostNummer(){
       
       return this.postNummer;
   }
   
   public String toString(){
       return this.navn + " " + this.fodselsNummer + " " + 
               this.address + " " +  this.unikNummer + " " +  this.postNummer;
   }
}
