



public class YosephogOppgave02 {

   
    public static void main(String[] args) {
       
        Hylle<Bok> shelf= new Hylle<>();
       
      Bok b1=new Bok("lestat", "Anna Rice");
      Bok b2= new Bok("the echo", "minethe walter");
      
      // get the size of the shelf while empty
      test("the size is",Integer.toString(shelf.getSize()),"0");
     
      
      // putting the two books in the shelf at a specific place
 
      shelf.settInn(b1, 1);
      test("the book title and author is ",shelf.getInput().toString(),"lestat Anna Rice");
      test("the book position is ", Integer.toString(shelf.getPosition()),"1");
      
      shelf.settInn(b2, 6);
      test("the book title and author is ",shelf.getInput().toString(),"the echo minethe walter");
       test("the book position is ", Integer.toString(shelf.getPosition()),"6");

      
      // checking if a specific place is empty
    
     System.out.println("Expecting ===> true \n" + shelf.sjekk(0));
     
      
      // checking a place that is already taken
     
     System.out.println("Expecting ==> false \n" + shelf.sjekk(6));
      
      // trying to put a book at a place that is already taken
     System.out.println("Expecting ===> ERROR");
      shelf.settInn(b2, 1);
   
      // get the size of the shelf after putting two books
   
        test("the size is",Integer.toString(shelf.getSize()),"2");

      
      // takeing out a book from a  position that is empty
     System.out.println("Expecting ===> ERROR");
      shelf.taUt(0);
      
      
      
      // takeing out a book from a position that is not empty
      System.out.println("Expecting ===> ERROR");
        shelf.taUt(1);
        
      //  getting the size after removeing a book
     
        test("the size is",Integer.toString(shelf.getSize()),"1");
      
       
    }
     public static void test(String detail, String value, String expectedValue) {
	String outcome;
	if (value.compareTo(expectedValue) == 0){
            outcome = value + ", correct.";
        }
        
	else 
            outcome =  "inncorrect, the value found : " + value 
		 + ", expected value: " + expectedValue; 
	System.out.println("Testing " + detail + ": " + outcome );
    }
   
   
    
}
