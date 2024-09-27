package addtwo;

import java.util.*;

public class AddTwo{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	System.out.println("Eneter a number: ");

	int x= sc.nextInt();

	sc.nextLine();

	System.out.println("Enter the another number: ");

	int y=sc.nextInt();

	sc.nextLine();

	int sum=x+y;

	System.out.println("The addition of ntwo numbers is: " + sum);

	}


}
