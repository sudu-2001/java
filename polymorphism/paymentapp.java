package poly;

interface paymentmethod{

    void paymentprocess(double amount);

}

class paypal implements paymentmethod{

    private String email;

    public paypal(String email){

        this.email=email;

    }

    public void paymentprocess(double amount){

        System.out.println("The amount transacted is:" + amount + " and you have got an notification in email: "+ email);
    }
}

class creditcard implements paymentmethod{

    private String cardnumber;

    public creditcard(String cardnumber){

        this.cardnumber=cardnumber;
    }

    public void paymentprocess(double amount){

        System.out.println("the amount is transacted: "+ amount + " through your creditcard"+ cardnumber);

    }
}

class paymentprocessor{

    private paymentmethod paymentmethod1;

    public paymentprocessor(paymentmethod paymentmethod1){

        this.paymentmethod1=paymentmethod1;

    }

    public void paymentprocess(double amount){

        paymentmethod1.paymentprocess(amount);

    }
}
public class paymentapp {

    public static void main(String[] args) {

        paymentmethod paypal=new paypal("xyz@gmail.com");

        paymentmethod creditcard=new creditcard("123-456-3462");

        paymentprocessor process1=new paymentprocessor(creditcard);

        paymentprocessor process2=new paymentprocessor(paypal);

        process1.paymentprocess(2000);

        process2.paymentprocess(3000);

    }

}
