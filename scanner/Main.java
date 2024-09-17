package scanner;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter user name: ");

        String name=sc.nextLine();

        System.out.println("enter the age: " );


        int age=sc.nextInt();

        System.out.println("the salary is : " );

        double salary=sc.nextDouble();

        
        System.out.println("the name of user is : " +name + " the age is : " +age+ "the salary is : "+salary);

    }
    
}
