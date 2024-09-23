package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements to enter: ");

        int noele=sc.nextInt();

        sc.nextLine();

        for (int i=0;i<noele;i++){

            System.out.println("Enter the element: " + (i+1) + ":");

            String elemnt=sc.nextLine();

            list.add(elemnt);
        }

        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){

            String car=iterator.next();

            System.out.println(car);

            if (car.equals("mustang")) {

                iterator.remove();
                
            }
        }


    }
}
