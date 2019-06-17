
public class Brett {
    

    Sudoko s;
    char[][] brettArray;
    int radl;
    int kolonnel;
    Ruta neste;
    Rad[] radArray;
    Kolonne[] kArray;
    Box[] boxArray;
    Rad rp;
    Box bp;
    Kolonne kp;
    Ruta[][] rutaArray;
    char value;
    Brett(int radl,int kolonnel,char[][]brettArray){
        this.radl=radl;
        this.kolonnel=kolonnel;
        this.brettArray=brettArray;
        s=new Sudoko();
        
    }
  
     public void printBrett(){
        for(int i=0;i<brettArray.length;i++){
            for(int j=0;j<brettArray.length;j++){
                System.out.print(brettArray[i][j]);
            }
           System.out.println();
        }
        
    }
    
     public void setBox(int size){
         boxArray=new Box[s.getSize()];
         for(int i=0;i<boxArray.length;i++){
             boxArray[i]=new Box(size);
         }
     }
     public void setRad(int size){
         radArray=new Rad[s.getSize()];
         for(int i=0; i<radArray.length;i++){
             radArray[i]=new Rad(size);
         }
     }
     public void setKolonne(int size){
         kArray=new Kolonne[size];
         for(int i=0;i<kArray.length;i++){
             kArray[i]=new Kolonne(size);
         }
             
     }
    
     public int getRow(){
        radl=s.getRadSize();
        return radl;
     }
     public int getColumn(){
         kolonnel=s.getKolonneSize();
         return kolonnel;
     }
     
     public int getLength(){
         return getColumn() * getRow();
     }
   
}
