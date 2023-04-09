package Java8;
//Program for thread implementation using Lambda Function using Runnable class
class TestThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread is Running!");
    }
}

public class LambdaFun
{
    public static void main(String[] args) {
        Runnable r1 = ()-> {
            System.out.println("Thread is Running");
        };
        Thread t1 = new Thread(r1);
        t1.start();

    }
}


/*
    OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar Java8.LambdaFun
Thread is Running

Process finished with exit code 0
 */