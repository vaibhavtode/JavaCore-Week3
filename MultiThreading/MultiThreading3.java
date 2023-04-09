package MultiThreading;
//Program for Employee Thread using Multithreading
class EmployeeThread extends Thread
{
  @Override
  public void run()
  {
   String names[]= {"Vaibhav","Aastha","Vihar","Shekhar"};
   for (int i=0; i< names.length;i++)
   {
       try {
           Thread.sleep(5000);
           System.out.println(names[i]);
       }
       catch (InterruptedException e)
       {
           System.out.println(e);
       }

   }
  }

}

public class MultiThreading3
{
     public static void main(String[] args)
    {
        EmployeeThread et = new EmployeeThread();
        et.start();


    }
}


/*
    OUTPUT:
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar MultiThreading.MultiThreading3
Vaibhav
Aastha
Vihar
Shekhar

Process finished with exit code 0

 */