package poly;

interface paymentmethod{
    void paymentprocess(double ampunt);
}

class creditcard implements paymentmethod{

    private String cardnumber;

    public creditcard(String cardnumber){

        this.cardnumber=cardnumber;
    }

    public void paymentprocess(double amount){

        System.out.println("money transaction: "+ amount+"through card" + cardnumber);
    }

}

class paypal implements paymentmethod{

    private String email;

    public paypal(String email){

        this.email=email;

    }

    public void paymentprocess(double amount){

        System.out.println("the amount transacted: "+amount+"through email: "+email);
    }
}

class paymentproccessor{
    private paymentmethod paymentmethod1;

    public paymentproccessor(paymentmethod paymentmethod1){

        this.paymentmethod1=paymentmethod1;
    }

    public void makepayment(double amount){

        paymentmethod1.paymentprocess(amount);
    }
}
public class paymentapp {
    
    public static void main(String[] args) {
        
        paymentmethod paypal=new paypal("xyz@gmail.com");

        paymentmethod creditcard=new creditcard("123-4567-6543");

        paymentproccessor process1=new paymentproccessor(creditcard);

        paymentproccessor process2=new paymentproccessor(paypal);

        process1.makepayment(200);
        
        process2.makepayment(300);
        
    }
}
