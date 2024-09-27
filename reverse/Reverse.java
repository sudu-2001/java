package reverse;

public class Reverse{

	public static void main(String[] args){

	String originstr="Hello";

	String rverstr="";

	for(int i=0;i<originstr.length();i++){

		rverstr=originstr.charAt(i) + rverstr;

		System.out.println("Rverse of String is: " +rverstr);

		}

	}

}
