package sorting;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

import java.util.Collections;

import java.util.Comparator;

import java.util.Date;


public class OrderList {

    public static void main(String[] args) {
        
        List<Order> orders=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of orders: ");

        int noorder=sc.nextInt();

        for (int i=0 ; i<noorder ; i++){

            System.out.println("Enter the OrderId: ");

            String OrderId=sc.nextLine();

            sc.nextLine();

            System.out.println("Enter the Amount: ");

            Double amount=sc.nextDouble();

            sc.nextLine();

            System.out.println("Enter the status: ");

            String status=sc.nextLine();

            Date date=null;

            boolean validdate=false;

            while (!validdate) {

                System.out.println("Enter the date in the format YYYY-MM-DD");

                String dateString=sc.nextLine();

                try{

                    date=java.sql.Date.valueOf(dateString);

                    validdate=true;
                }
                
                catch(IllegalArgumentException e){

                    System.out.println("Invalide date");
                }
            }

            orders.add(new Order(date, OrderId, amount, status));
        }

        System.out.println("Ordered By amount");

        Collections.sort(orders,Comparator.comparing(Order::getamount));

        orders.forEach(System.out::println);



        
    }
    
}
