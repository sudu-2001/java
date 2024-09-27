package count;

public class CountWord{

	public static void main(String[] args){

		String words="Hello World This is Java";

		int countw=words.split("\\s").length;

		System.out.println("The total length of a string is:" + countw);


		}

}
