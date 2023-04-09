package MultiThreading;

class Count extends Thread
{
    Count()
    {
        super("I am Extending my thread");
        System.out.println("My Thread got Created" + this);
        start();
    }
    public void run()
    {
        try
        {
            for (int i=0; i<10;i++)
            {
                System.out.println("No of Thread Counts:"+i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e)
        {
            System.out.println("Thread Got Interrupted");
        }
        System.out.println("The Thread has Finished its runtime");

    }
}
public class MultiThreading2
{
    public static void main(String[] args)
    {
        Count cnt = new Count();
        try
        {
            while (cnt.isAlive())
            {
                System.out.println("Main Thread is Still Alive until the Child Thread gets interrupted");
                Thread.sleep(1500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Now The Main Thread gets Interrupted");
        }
        System.out.println("The Main Thread has Finished its runtime");

    }
}

/*
  OUTPUT:-
  /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar MultiThreading.MultiThreading2
My Thread got CreatedThread[I am Extending my thread,5,main]
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:0
No of Thread Counts:1
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:2
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:3
No of Thread Counts:4
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:5
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:6
No of Thread Counts:7
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:8
Main Thread is Still Alive until the Child Thread gets interrupted
No of Thread Counts:9
The Thread has Finished its runtime
The Main Thread has Finished its runtime

Process finished with exit code 0
 */