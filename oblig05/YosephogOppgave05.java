



public class YosephogOppgave05 {

    
    public static void main(String[] args) {
         LenkeListe <String> it=new LenkeListe<>();
         
         System.out.println("Expecting 0");
          it.getCounter();
         
         it.leggTil("c");
         it.leggTil("a");
         it.leggTil("b");
         it.leggTil("d");
         
         System.out.println("Expecting 4");
         it.getCounter();
         
         it.print();
        
          System.out.println("Expecting false");
        System.out.println("are the two elements equal " + " " +it.inneholder("b"));
        
        System.out.println("Expecting a");
        System.out.println("the element removed is " + " " + it.fjernMinste()) ;
        
        System.out.println("Expecting 3");
        it.getCounter();
        
        System.out.println("Expecting true");
        System.out.println("are the two elements equal " + " " +it.inneholder("b"));
        it.print();
       
    }
    
}
