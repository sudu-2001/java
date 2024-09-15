package inherit;

public class vehicle {
    
    protected String model="mustang";

    public void sound(){
        System.out.println("the must ang car");
    }
}

class car extends vehicle{

    public static void main(String[] args) {
        
        car cr=new car();

        System.out.println(cr.model);

        cr.sound();
    }
}
