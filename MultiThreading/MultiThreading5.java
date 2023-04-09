package MultiThreading;

//Program for Multithreading
class Thread11 extends Thread
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().isAlive());
    }
}

public class MultiThreading5
{
    public static void main(String[] args) {
        Thread11 t11 = new Thread11();
        t11.start();
        t11.setName("Vaibhav");
        System.out.println(t11.getName());

    }
}

/*
    OUTPUT:-
    .32/mysql-connector-j-8.0.32.jar MultiThreading.MultiThreading5
Vaibhav
12
true

Process finished with exit code 0
 */