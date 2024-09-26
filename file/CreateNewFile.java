import java.io.File;

import java.io.IOException;

public class CreateNewFile{

	public static void main(String[] args){

		try{

			File myobj=new File("File.txt");

			if(myobj.createNewFile()){

				System.out.println("File is created: " + myobj.getName());

					}



			else{

				System.out.println("File is already Created");


				}


				}

		catch(IOException e){


				System.out.println("Some error occured");

				e.printStackTrace();



				}

			}

		}
