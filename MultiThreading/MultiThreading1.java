package MultiThreading;
//Creating a Thread by Extending The Thread Class
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("The Thread is running!");

    }
}

public class MultiThreading1
{
    public static void main(String[] args) {
        //creating object
        Thread1 t1 = new Thread1();
        t1.start();
    }
}

//OUTPUT:-
/*
.32/mysql-connector-j-8.0.32.jar MultiThreading.MultiThreading1
The Thread is running!

Process finished with exit code 0
 */