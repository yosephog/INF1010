
import java.io.File;
import java.util.Scanner;


public class Sudoko {
     int radl;
     int kolonl;
     int size;
     char[][] sudokoBrett;
    Brett b;
   
    public void lesFil(String fil) throws Exception{
        try {
        Scanner in=new Scanner(new File(fil));
        radl=in.nextInt();
        kolonl=in.nextInt();
        size=radl * kolonl;
        sudokoBrett=new char[size][size];
        int i=0;
        while(in.hasNext()){
            String txt=in.next();
            
            for(int j=0;j<sudokoBrett.length;j++){
                sudokoBrett[i][j]=txt.charAt(j);
              
            }
            i++;
        }
        b=new Brett(size,size,sudokoBrett);
        
        
       in.close();
    }
        catch(Exception ex){
                
                }
    }
    public void print(){
        for(int i=0;i<sudokoBrett.length;i++){
            for(int j=0;j<sudokoBrett.length;j++){
                System.out.print(sudokoBrett[i][j]);
            }
            System.out.println();
        }
        
    }
   
   
    public int getRadSize(){
        return this.radl;
    }
    public int getKolonneSize(){
        return this.kolonl;
    }
    public int getSize(){
        return this.size;
    }
    public char[][] getSudokoArray(){
        return sudokoBrett;
    }
    
}
