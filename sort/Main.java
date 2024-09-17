package sort;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        ArrayList <String> cars=new ArrayList<String>();

        cars.add("mustang");

        cars.add("Ford");

        cars.add("Benz");

        cars.add("BMW");

        Collections.sort(cars);

        for (String i: cars){

            System.out.println(i);
        }
    }
    
}
