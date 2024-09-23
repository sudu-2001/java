package emailexception;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidate {
    
    private static final String email_regex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
  
    static class InvalidEmail extends Exception{

        public InvalidEmail(String message){

            super(message);

        }

    }
    
    public static void emailValidator(String email) throws InvalidEmail{

        Pattern pattern= Pattern.compile(email_regex);

        Matcher matcher=pattern.matcher(email);

        if(!matcher.matches()){

            throw new InvalidEmail("Invalid Email Entered:"+email);
        }

        System.out.println("Eneterd Email is valid: " +email);

    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the email address: ");
        
        String Test_email=sc.nextLine();

        try{

            emailValidator(Test_email);
        }

        catch(InvalidEmail e){

            System.out.println(e.getMessage());
        }



    }
    
    
}
