package MultiThreading;

class MyRunnable implements Runnable
{

    public void run()
    {
        System.out.println("I am Running!!");
        System.out.println("Yippieeee ,I am Running");
    }
}
public class MultiThreading6
{
    public static void main(String[] args)
    {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        //mr.run();

    }
}

/*
    OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar MultiThreading.MultiThreading6
I am Running!!
Yippieeee ,I am Running

Process finished with exit code 0

 */