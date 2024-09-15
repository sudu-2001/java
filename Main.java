import java.util.Scanner;


class vehicle{

    String brand="Ford";

    public void cost(){

        System.out.println("the cost is ranges from 1200$ to 18000$");
    }

}

class mustang extends vehicle{

    String brand="Mustang";

    public void cost(){

        System.out.println("the cost of mustang is : $2599" + brand);
    }
}

class gt extends vehicle{

    String brand="GT";

    public void cost(){

        System.out.println("the cost of gt is : $12000" +brand);
    }
}

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the car type {mustang/GT}");

        String cartype=sc.nextLine();

        switch (cartype.toLowerCase()) {
            case "mustang":

                mustang mu=new mustang();

                mu.cost();
                
                break;

            case "gt":

                gt g=new gt();

                g.cost();

                break;
        
            default:

                System.out.println("you have entered the wrong car options");

                break;
        }

        sc.close();
    }

}
