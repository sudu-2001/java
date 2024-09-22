package hashtable;

import java.util.*;

public class hashset {

    public static void main(String[] args) {
        
        HashSet<String> emaiSet=new HashSet<>();

        Scanner sc=new Scanner(System.in);


        while (true) {

            System.out.println("Enter the email address: ");

            String email=sc.nextLine();

            if (email.equalsIgnoreCase("exit")) {

                break;
                
            }

            if (emaiSet.add(email)) {

                System.out.println("Enter the email to add"+ emaiSet);
                
            }

            else{

                System.out.println("enter email is not subscribed");
            }


            
        }

        System.out.println("The total number of email subscribed" + emaiSet.size());

        System.out.println("Total number of email are: ");

        for (String email:emaiSet){

            System.out.println("The eamil subscribed are: " + email);
        }
    }
}
