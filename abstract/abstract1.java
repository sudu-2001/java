abstract class employee{

        String name;
        int id;
    public employee(String name,int id){

        this.name=name;
        this.id=id;

    }

    public abstract double caluclatesalary();

    public void displayinfo(){

        System.out.println("The name of employee is: " + name + " and the id is: "+id);
    }
}

class Fulltimeemployee extends employee{

    private double salary;

    public Fulltimeemployee(String name,int id, double salary){

        super(name,id);
        this.salary=salary;
    }

    public double caluclatesalary(){
        return salary;

    }

}

class contractemployee extends employee{

    private double salary;

    private int workinghour;

    public contractemployee(String name,int id,double salary,int workinghour){

        super(name,id);

        this.salary=salary;

        this.workinghour=workinghour;

    }

    public double caluclatesalary(){

        return salary*workinghour;

    }
}


public class abstract1 {

    public static void main(String[] args) {
        
        employee e1=new Fulltimeemployee("alice", 1, 200000000);

        employee e2=new contractemployee("bob", 2, 30000, 6);

        e1.displayinfo();

        System.out.println("salary is: $" + e1.caluclatesalary());

        e2.displayinfo();

        System.out.print("salary is: $" + e2.caluclatesalary());

        
    }
    
}
