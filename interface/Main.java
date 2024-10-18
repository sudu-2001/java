
interface vehicle{

	void gear(int a);

	void speedup(int a);

	void applybreak(int a);

}

class bike implements vehicle{

	int gear;

	int speed;

	public void gear(int newgear){

		gear=newgear;

	}

	public void speedup(int increment){

		speed=speed+increment;

	}

	public void applybreak(int decrement){

		speed=speed-decrement;

	}

	public void applystate(){

		System.out.println("The bike gear: "+gear+" speed is: "+speed);

	}

}

class car implements vehicle{

	int gear;

	int speed;

	public void gear(int NewGear){

		gear=NewGear;

	}

	public void speedup(int increment){

		speed=speed+increment;

	}

	public void applybreak(int decrement){

		speed=speed-decrement;

	}

	public void applystate(){

		System.out.println("The car Gear: "+gear+" Speed: "+speed);

	}

}

public class Main{

	public static void main(String[] args){

		bike bi=new bike();

		car c=new car();

		bi.gear(4);

		bi.speedup(6);

		bi.applybreak(2);

		bi.applystate();

		c.gear(2);

		c.speedup(6);

		c.applybreak(2);

		c.applystate();


	}

}
