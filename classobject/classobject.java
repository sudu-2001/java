package classobject;
public class classobject {
    int x=5;

    public static void main(String[] args){
        classobject cl=new classobject();
        //access the attributes of class//

        System.out.println("access the values:"  +cl.x);

        //modify the values in the class//
        cl.x=44;

        System.out.println("modify the values using an object:" +cl.x);
    }
}
