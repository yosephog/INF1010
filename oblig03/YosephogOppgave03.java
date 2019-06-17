


import java.util.*;
import java.io.*;

public class YosephogOppgave03 {

   
    public static void main(String[] args) throws Exception{
        
       ArrayList<Bil> bilList=new ArrayList<>();
        String text;

       for(int i=0;i<args.length;i++){
        text=args[i];
       Scanner in=new Scanner(new File(text));

       while(in.hasNext()){
           text=in.nextLine();
          
          if(text.startsWith("BIL")){
              
              Bil b=new Bil();
             
              b.setBilNummer(text);
              bilList.add(b);
          }
          if(text.startsWith("EL")){
              
              ElBiler el=new ElBiler();
              el.setBilNummer(text);
              bilList.add(el);
          }
          if(text.startsWith("FOSSIL")){
              
              FossilBiler fossil=new FossilBiler();
              fossil.setBilNummer(text);
              bilList.add(fossil);
          }
          if(text.startsWith("PERSONFOSSILBIL")){
              
              PersonBil person=new PersonBil();
              person.setBilNummer(text);
              bilList.add(person);
          }
          if(text.startsWith("LASTEBIL")){
              
              LastBiler last=new LastBiler();
              last.setBilNummer(text);
              bilList.add(last);
          }
       }
}
       
      for(Bil b:bilList){
          if(b instanceof FossilBiler )
              System.out.println(b.getBilNUmmer());
      }
    }
    
}
