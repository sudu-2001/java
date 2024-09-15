package inherit;

public class vehiclemultilevel {
    
    protected String brand="ford";

    public void cost(){
        System.out.println("cost ranges form 12000$ to 18000$");
    }

    public static void main(String[] args){

        mustang mu=new mustang();

        System.out.println("the model is:" + mu.model );

        mu.cost();

        gt g=new gt();

        System.out.println("the brand of ford is :"+ g.brand);

        g.cost();
    } 
}

class mustang extends vehiclemultilevel{

    String model="mustang";

    public void cost(){

        System.out.println("the cost of mustang is: 12002$");

    }

    
}

class gt extends mustang{

    String model="GT";

    public void cost(){

        System.out.println("the cost of GT is: 1600$");


    }

}
