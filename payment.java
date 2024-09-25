package paymenst;

import java.util.*;

interface PaymentMethod{

	void paymentProccess(double amount);

}

class PayPal implements PaymentMethod{

	private String email;

	public PayPal(String email){

	this.email=email;

	}

	public void paymentProccess(double amount){

	double total=4*amount;

	System.out.println("The amount has been paid to: " + total + "\nThrough the email: " +email);


	}


}

class CardPayment implements PaymentMethod{

	private int cardnumber;

	public CardPayment(int cardnumber){

	this.cardnumber=cardnumber;

	}


	public void paymentProccess(double amount){

	double total=4*amount;

	System.out.println("The amount has been paid to pirticular account the amount is : " + total + "\nThrough the cardnumber :" +cardnumber);


	}

}


class PaymentProccessor{

	private PaymentMethod paymentMethod1;

	public PaymentProccessor(PaymentMethod paymentMethod1){

	this.paymentMethod1=paymentMethod1;

	}

	public void paymentProccess(double amount){

	paymentMethod1.paymentProccess(amount);


	}

}


public class payment{

	public static void main(String[] arges){

	Scanner sc=new Scanner(System.in);

	boolean running=true;

	while(running){

		System.out.println("Enter a choice to ake a type of payment: \n1.paypal \n2.creditpayment ");

		int ch=sc.nextInt();

		sc.nextLine();

		switch(ch){

		case 1:

			System.out.println("Enter your email to make payment : ");

			String email=sc.nextLine();

			PaymentMethod paypal1=new PayPal(email);

			PaymentProccessor proccess1=new PaymentProccessor(paypal1);

                        System.out.println("Enter the amount to make a payment: ");

                        double amnt=sc.nextDouble();

			proccess1.paymentProccess(amnt);

			break;

		case 2:

			System.out.println("Enter cerditcard number to make a payment:");

			int creditnumber=sc.nextInt();

			PaymentMethod cardpayment1=new CardPayment(creditnumber);

			PaymentProccessor proccess2=new PaymentProccessor(cardpayment1);

			System.out.println("Enter the amount to be paid: ");

			double amnt1=sc.nextDouble();

			proccess2.paymentProccess(amnt1);

			break;

		case 3:

			running = false;

			System.out.println("The programme has been exiting...............");

			break;

		default :

			System.out.println("Invalid choice.");

			break;



			}


		}

	}



}
