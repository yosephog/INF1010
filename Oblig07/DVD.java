
package dvdadminstrater;


public class DVD {
    String title;
    String owner;
    DVD(){
        title="";
        owner="";
    }
   
    void setTitle(String t){
        this.title=t;
       
    }
    void setOwner(String o){
        this.owner=o;
    }
    String getTitle(){
        return this.title;
    }
    String getOwner(){
        return this.owner;
    }
    
}
