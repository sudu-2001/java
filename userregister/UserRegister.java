package userregister;

import java.util.Scanner;

public class UserRegister {
    
    private static final String email_regex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,7}$";

    private static final String phone_regex="^\\+?[0-9]{10,15}$";

    private static final String username_regex="^[a-zA-Z0-9]{5,15}$";

    private static final String password_regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"; 

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Email: ");

        String email=sc.nextLine();

        validateEmail(email);

        System.out.println("Enter Phone number: ");

        String phone=sc.nextLine();

        validatePhone(phone);

        System.out.println("Enter the username:" );

        String username=sc.nextLine();

        validateUsername(username);

        System.out.println("Enter your password: ");

        String password=sc.nextLine();

        validatePassword(password);

        
    }

    public static void validateEmail(String email){

        if(!email.matches(email_regex)){

            throw new IllegalArgumentException("Invalid Email" + email);

        }

        System.out.println("Enterde email is valid: "+ email);
    }

    public static void validatePhone(String phone){

        if(!phone.matches(phone_regex)){

            throw new IllegalArgumentException("Invalid Phone number: " +phone);
        }

        System.out.println("Enterde phone number is valid: "+ phone);
    }

    public static void validateUsername(String username){

        if(!username.matches(username_regex)){

            throw new IllegalArgumentException("Invalid username :" + username);

        }

        System.out.println("Entered username is valid: "+username);
    }

    public static void validatePassword(String password){

        if(!password.matches(password_regex)){

            throw new IllegalArgumentException("Invalid Password:" +password);
        }

        System.out.println("Entered Password is valid: " +password);
    }
}
