package arraylist;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        ArrayList <String> cars= new ArrayList <String> ();

        cars.add("mustang");

        cars.add("Ford");

        cars.add("BMW");

        for (int i=0; i<cars.size();i++){

            System.out.println(cars.get(i));
        }
    }
}