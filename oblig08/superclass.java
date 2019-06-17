
public class superclass {
    private int index;
    private Ruta[] rutaElement;
    private int size;
    
    superclass(int size){
        this.size=size;
    }
    public void setRuta(Ruta r){
        rutaElement[index++]=r;
    }
    public boolean check(char ch){
        for(int i=0;i < rutaElement.length;i++){
            if(rutaElement[i].getRuta()==ch)
                return true;
            
        }
       
                return false;
    }
    public int getLength(){
        return this.size;
    }
    public void print(){
       for(Ruta r : rutaElement)
           System.out.println(r.getRuta());
    }
}
