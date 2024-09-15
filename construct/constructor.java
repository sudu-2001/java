package construct;

// constructors are used to initialize the objects and it is called automatically when the object is created

public class constructor {

   int year1;
   String modelcar1;

   public constructor(int year,String model){

    year1=year;

    modelcar1=model;
        
    }

    public static void main (String[] args) 
    {

       constructor ct=new constructor(1956, "mustang");

       System.out.println(ct.modelcar1 + " " + ct.year1);

    }

    


   
}
