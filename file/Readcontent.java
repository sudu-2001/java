import java.io.File;

import java.util.Scanner;

import java.io.FileNotFoundException;

public class Readcontent{

	public static void main(String[] args){

	try{

		File myobj=new File("File.txt");

		Scanner data=new Scanner(myobj);

		while(data.hasNextLine()){

			String data1=data.nextLine();

			System.out.println(data1);

			}

		}

	catch(FileNotFoundException e){

		System.out.println("File not found");

		e.printStackTrace();

		}

		}


}
