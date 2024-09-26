import java.io.File;

public class FileAttributes{

	public static void main(String[] args){

		File myobj= new File("File.txt");

		if(myobj.exists()){

			System.out.println("The File name is " + myobj.getName());

			System.out.println("Readable:" + myobj.canRead());

			System.out.println("Writable:" + myobj.canWrite());

			System.out.println("Absolute Path: " +myobj.getAbsolutePath());

			System.out.println("Lenth of file is" + myobj.length());

			}

		}

}
