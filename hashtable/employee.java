package hashtable;

import java.util.*;

class employees{
    
    private String employeename;

    private Double Salary;

    private String Department;

    public employees(String employeename,Double Salary,String Department){

        this.employeename=employeename;

        this.Salary=Salary;

        this.Department=Department;

    }

    public String getemployeename(){

        return employeename;
    }

    public Double getSalary(){

        return Salary;

    }

    public String getDeparment(){

        return Department;
    }

    public String toString(){

        return "Employee Name="  +employeename + "\t" + "Salary=" + Salary + "\t" +"Department=" + Department;
    }

}
public class employee {

    public static void main(String[] args) {
        
        HashMap<String,employees> empMap=new HashMap<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number employees to Enter: ");

        int totemp=sc.nextInt();

        sc.nextLine();

        for( int i=0; i<totemp;i++){

        System.out.println("Enter the Employeename: " +(i+1)+ ":");

        System.out.println("Enter the Employee Id: ");

        String id=sc.nextLine();

        System.out.println("Enter the Employeename: ");

        String empname=sc.nextLine();

        System.out.println("Enter the Salary: ");

        Double salary=sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter the Department: ");

        String Department=sc.nextLine();

        empMap.put(id, new employees(empname, salary, Department));

        }

        System.out.println("Enter the Employee ID to search: ");

        String empid=sc.nextLine();

        employees emp=empMap.get(empid);

        if (emp!=null) {

            System.out.println("Employee Details are: " +emp);
            
        }

        else{

            System.out.println("Employee Details is empty");

        }

        sc.close();

        System.out.println("Only id of hash Table: ");

        for (String i: empMap.keySet()){

            System.out.println(i);
        }

        System.out.println("Only values of Hashtable: ");

        for (employees i: empMap.values()){

            System.out.println(i);
        }

        System.out.println("The total set of values is: " +empMap.size());

    }
   
    
}
