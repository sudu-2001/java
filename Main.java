import java.util.Iterator;

import java.util.LinkedList;

import java.util.Scanner;

class Task{

    String taskname;

    int priority;

    public Task(String taskname,int priority){

        this.taskname=taskname;

        this.priority=priority;

    }

    public String toString(){
        return  "name of the task is: " + taskname + " and the priority is: " + priority;
    }
}

class Taskmanager{

    LinkedList<Task> taskqueue=new LinkedList<>();

    public void addtask(String taskname,int priority){

        Task newtask= new Task(taskname, priority);

        taskqueue.add(newtask);

        System.out.println("Task added: " + newtask);
    }

    public void processtask(){

        if(taskqueue.isEmpty()){

            System.out.println("There are no task to remove");

        }
        else{

            Task task=taskqueue.remove();

            System.out.println("the task is removed" + task);
        }
    }
}

public class Main {

    public static void main(String[] args){

        Taskmanager manager=new Taskmanager();

        Scanner sc=new Scanner(System.in);

        boolean running = true;

        while (running) {  // Keep the program running until the user chooses to exit

            System.out.println("Enter your choice: \n1. Add Task\n2. Process Task\n3. Exit");

            int choice = sc.nextInt();

            sc.nextLine();  // Consume the newline character after nextInt()


       

        switch (choice) {
            case 1:

                System.out.println("enter the taskname:");

                System.out.println("enter the priority: ");

                String ts=sc.nextLine();

                int pri=sc.nextInt();

                manager.addtask(ts, pri);

                
                break;

            case 2:

                manager.processtask();

                break;

            case 3:

                running=false;

                System.out.println("The programme is terminating.....");

                break;
            
        
            default:

                System.out.println("Invalid choice");

                break;


        }
    }

    sc.close();

    
    }
}
