// private access modifiers are used inside the class where it is declared

package construct;

public class modeifiers {

    private int age=30;

    private String name="bob";

    public static void main(String[] args) {
        
        modeifiers mod=new modeifiers();

        System.out.println(mod.age + " " + mod.name);
    }
    
}