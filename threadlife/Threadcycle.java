package threadlife;

class Mythread extends Thread
{

	public void run()
	{

		for(int i=0 ; i <= 10 ; i++)
		{

			System.out.println(i + "- Running" + Thread.currentThread().getName());

			try{
				Thread.sleep(5000);
			}

			catch(InterruptedException e){

				System.out.println(e.getMessage());

				}
		}
	}
}

public class Threadcycle{

	public static void main(String[] args){
		Mythread thread1=new Mythread();

		thread1.setName("thread1");

		thread1.start();

		Mythread thread2=new Mythread();

		thread2.setName("thread2");

		thread2.start();

		}


}
