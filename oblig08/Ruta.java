
public class Ruta {
    private char rutaElement;
    private Rad rad;
    private Kolonne koll;
    private Box box;
    Ruta next;
   
    int size;
    
    Ruta (char rut,Rad r,Kolonne k,Box b,int size){
        rutaElement=rut;
        rad=r;
        koll=k;
        box=b;
        this.size=size;
    }
   
    public char getRuta(){
        return this.rutaElement;
    }
    public Rad getRad(){
        return rad;
    }
    public Box getBox(){
        return box;
    }
    public Kolonne getKolonne(){
        return koll;
    }
    public int getSize(){
        return this.size;
    }
    public char getCharValueOfInt(int n) {
		return (char) ('0' + n);
	}
    public int[]finnAlleMuligeTall(){
       
		int[] temp = new int[getSize()];
		int k = 0;
                 int counter=0;
                 
                 // if the place is not taken
		if (rutaElement == '.'){
                    for (int i = 1; i <= getSize(); i++) {
		         if (!rad.check(getCharValueOfInt(i)) // chcking the value in the rad
			     && !koll.check(getCharValueOfInt(i)) // checking the value in the kollomen
			      && !box.check(getCharValueOfInt(i))) { // checking the value in the box
                               rutaElement = getCharValueOfInt(i); // then the rutaElement is accepted
				

				temp[k] = i;

				k++;

				}

			}
		}
                
                else 
                    System.out.println("the place is taken");
                  
               

	
		return temp;
        
    }
}
