import java.io.File;

public class DeleteFile{

	public static void main(String[] args){

		File myobj=new File("File.txt");

		if(myobj.delete()){

			System.out.println("File is deleted"+ myobj.getName());

			}

		else{

			System.out.println("File is not deleted");

			}

	}

}
