package linkedlist2;
import java.util.Scanner;

import javax.swing.text.Style;

import java.util.LinkedList;

import java.util.Iterator;


class Task{

    String taskname;

    int priority;

    public Task(String taskname,int priority){

        this.taskname=taskname;

        this.priority=priority;
    }

    public String toString(){

        return  "the task name is : "+ taskname + "The priority is : " + priority;
    }
}

class taskmanager{

    LinkedList <Task> taskqueue=new LinkedList<>();

    public void addtask(String taskname,int priority){

        Task newtask=new Task(taskname, priority);

        taskqueue.add(newtask);

        System.out.println("the task is added : " + taskname + "\nThe priority is: " +priority);
    }

   public void listalltask(){

    Iterator<Task> iterator=taskqueue.iterator();

    while (iterator.hasNext()) {

        System.out.println("the tasks are: " + iterator.next());
        
    }
   }

   public void removetask(String taskname){

    Iterator<Task> iterator=taskqueue.iterator();

    while (iterator.hasNext()) {

        Task task=iterator.next();

        if(task.taskname.equals(taskname)){

            iterator.remove();

        }
        
    }

    System.out.println("The task has been removed: " + taskname);


   }

}
public class Main{

    public static void main(String[] args) {
        
        taskmanager manager=new taskmanager();

        Scanner sc=new Scanner(System.in);

        boolean running=true;

        while (running) {

            System.out.println("Enter the choice \n1. Add Tasks\n2. Listall\n3. remove\n4. Exit");

            int choice= sc.nextInt();

            sc.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("Enter the taskname: ");

                    String ta=sc.nextLine();

                    System.out.println("Enter the priority: ");

                    int pri=sc.nextInt();

                    manager.addtask(ta, pri);

                    break;

                case 2:

                    manager.listalltask();

                    break;

                case 3:

                    System.out.println("Enter the task name to remove: ");

                    String task=sc.nextLine();

                    manager.removetask(task);

                    break;

                case 4:

                    running=false;
                    

                        System.out.println("The programme is terminating.....");
                    

                    break;
            
                default:

                    System.out.println("You have eneterd the wrong option");
                    break;
            }
            
        }
    }

}