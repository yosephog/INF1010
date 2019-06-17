
package oblig6;

import java.io.*;
import java.util.*;
public class Ordeliste {
    ArrayList<Ord>list=new ArrayList<>();
    
   public Ordeliste(){
        list=new ArrayList<>();
    }
   
   void lesBok(String fil)throws Exception{
       fil="C:\\Users\\gena1010\\workspace\\scarlet.text";
        Scanner in=new Scanner(new File(fil));
         while(in.hasNext()){
            String txt=in.next();
             System.out.println(txt);
   }
         
       
   }
   void leggTilord(String a){
       Ord b=new Ord(a);
       b.oakAntall();
       list.add(b);
   }
   void uniquelist(){
       Ord c=new Ord("");
       for(int i=0;i<list.size();i++){
           c=list.get(i);
           for(int j=i+1;j<list.size();j++){
               String d= c.toString();
               if(d.compareToIgnoreCase(list.get(j).toString())==0){
                   list.get(i).oakAntall();
                   list.remove(j);
               }
           }
       }
   }
         void add(String fil)throws Exception{
             fil="C:\\Users\\gena1010\\workspace\\scarlet.text";
        Scanner in=new Scanner(new File(fil));
        do{
            leggTilord(in.nextLine());
        } while(in.hasNextLine());
             
         uniquelist();
         }
         
       
        // the while loop do something about it
         
         Ord findord(String x){
             // try to change the loop form
             
             for( Ord list1:list){
                 if(0==x.compareToIgnoreCase(list1.toString())){
                     return list1;
                 }
                 
             } 
             return null;
         }
         int antallord(){
             return list.size();
         }
         int antallForkomster(String z){
             return findord(z).hentAntall();
         }
         Ord vanligste(){
             if(list.size()>0){
                 Ord v=list.get(0);
                 for(int i=1;i<list.size();i++){
                     if(list.get(i).hentAntall()>v.hentAntall()){
                         v=list.get(i);
                     }
                 }
                 return v;
             } 
             else{
                 return null;
             }
         }
         
}
