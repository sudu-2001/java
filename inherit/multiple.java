package inherit;

class multiple {

    String brand="ford";

    public void cost(){

        System.out.println("the car brand: "   +brand+ " cost ranges from 120000$ to 180000$");
    }

    public static void main(String[] args){

        mustang mu=new mustang();

        multiple mul=new multiple();

        gt g=new gt();

        mul.cost();

        System.out.println("the brand of car is:"+ mul.brand + "\n"+ "the model of car is:"+ mu.model);

        mu.cost();

        System.out.println("The brand of car is:" + mul.brand + "\n" +"the model of car is:" + g.model);

        g.cost();

        
        

    }
}

class mustang extends multiple{

    String model="mustang";

    public void cost(){

        System.out.println("the cost of mustang is: $12000$");
    }
}

class gt extends multiple{

    String model="GT";

    public void cost(){

        System.out.println("the cost of GT is: $160000$");
    }


}
