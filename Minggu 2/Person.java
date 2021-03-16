package Person;

/**
 * @author Rokhis
 */
        class profil {
    String fName ; 
    String LName ;
    int stuId ;
    boolean stuStatus ;
 
    public void set(String fName , String LName , int stuId , boolean stuStatus){
        this.fName = fName ;
        this.LName = LName ;
        this.stuId = stuId ;
        this.stuStatus = stuStatus ; 
    }
        
    public void show(){
        System.out.println("Student Name : " + fName +" " + LName);
        System.out.println("Student Id : " + stuId );
        if (stuStatus == true){
            System.out.println("Student status : Active" );
        }
        else{
            System.out.println("Student status : Non Active");
        }
                 
    }
       
}

public class Person{
    public static void main (String[]args){
        profil Rokhis = new profil() ;
            Rokhis.set("Rokhis", "Alqodir",41202250,true);
            Rokhis.show();
    }

}