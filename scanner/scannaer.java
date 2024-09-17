package scanner;


import java.util.Scanner;

public class scannaer{

    String UserName;

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter yout username:");

    String UserName=sc.nextLine();

    System.out.println("Your user name is:" + UserName);
 
        
    }
    
}

