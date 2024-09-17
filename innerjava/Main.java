package innerjava;


class outer{

    int x=5;

    class inner{

        public void method(){

            System.out.println("the number is" + x);
        }
    }

}
public class Main {
    

    public static void main(String[] args){

        outer out=new outer();

        System.out.println("The numver is:" + out.x);

        outer.inner inn=out.new inner();

        inn.method();


    }
}
