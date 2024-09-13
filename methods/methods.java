package methods;

public class methods {
    static void mymethod(){
        System.out.println("hello world");
    }

    public void method(){
        System.out.println("my name");
    }

    public static void main(String[] args) {
        
        // the static method is called by method name// 

        mymethod();

        // the public method is called by creating object//

        methods m=new methods();

        m.method();


    }
}
