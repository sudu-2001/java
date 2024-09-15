package construct;

public class modifiersprotected {
    
    protected String name="bob";

    protected int age=54;

    protected String address="london";

    public static void main(String[] args) {

        modifiersprotected mof=new modifiersprotected();

        System.out.println("NAME: " + " " + mof.name + "age: " + mof.age+ "address: "+ mof.address);
    }
    
}
