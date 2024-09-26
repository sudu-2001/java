import java.io.FileWriter;

import java.io.IOException;

public class WriteFile{

	public static void main(String[] args){

		try{

		FileWriter mywrite=new FileWriter("File.txt");

		mywrite.write("This is java writer file");

		mywrite.close();

		System.out.println("The content has been copied successfullyy....");

			}

		catch(IOException e){

		System.out.println("Something Error has been occured");

		e.printStackTrace();

			}


		}



}
