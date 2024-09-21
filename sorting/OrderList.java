package sorting;

import java.util.Collections;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Comparator;

import java.util.Date;

import java.util.List;

public class OrderList {

    public static void main(String[] args) {
        
        List<Order> orders=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of orders: ");

        int noorders=sc.nextInt();

        for ( int i=0; i<noorders ; i++){

            System.out.println("Enetr the OrderId: " +(i+1)+ ":");

            String OrderId=sc.nextLine();

            System.out.println("Enter the Status: ");

            String status=sc.nextLine();

            System.out.println("Enter the amount: ");

            Double amount=sc.nextDouble();

            sc.nextLine();

            Date date=null;

            boolean validate=false;

            while (!validate) {

                System.out.println("Enter the date in the format od YYYY-MM-DD");

                String dateString=sc.nextLine();

                try{

                    date=java.sql.Date.valueOf(dateString);

                    validate=true;

                }

                catch(IllegalArgumentException e){

                    System.out.println("Enter the valid date");
                }


                
            }

            orders.add(new Order(date, OrderId, amount, status));
            

        }
        Collections.sort(orders,Comparator.comparing(Order::getamount));

        System.out.println("order by date");

        orders.forEach(System.out::println);

    }
}
