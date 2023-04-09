package MultiThreading;
//Program for printing names of Cricketers using MultiThreading

//First we create Thread of Indian Team
class IndiaThread extends Thread
{
    @Override
    public void run()
    {
        String names[] ={"Sachin","Dhoni","Jadeja","Raina","Rohit","Pandya"};
        for(int i=0; i< names.length;i++)
        {
            try {
                Thread.sleep(4000);
                System.out.println(names[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

//Now, we create Thread of Pakistan Team
class PakThread extends Thread
{
    @Override
    public void run()
    {
        String names[] = {"Afridi","Akhtar","Malik","Amir","Rizwan"};
        for( int i=0; i< names.length;i++)
        {
            try {
                Thread.sleep(5000);
                System.out.println(names[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

//Now We Create Srilanka Thread
class SriLankaThread extends Thread
{
    @Override
    public void run()
    {
        String names[] = {"Sanghkara","Dilshan","Murlitharan","Malinga","Mendis"};
        for( int i=0; i< names.length;i++)
        {
            try {
                Thread.sleep(5000);
                System.out.println(names[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class MultiThreading4
{
    public static void main(String[] args) throws InterruptedException {
        //Creating object and using it to start the thread
        IndiaThread india = new IndiaThread();
        india.start();
        india.join();//Indian Thread gets the first priority and executes entirely alone
        PakThread pak = new PakThread();
        pak.start();
        SriLankaThread sri = new SriLankaThread();
        sri.start();

    }
}

/*
    Output:-
   /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar MultiThreading.MultiThreading4
Sachin
Dhoni
Jadeja
Raina
Rohit
Pandya
Afridi
Sanghkara
Akhtar
Dilshan
Malik
Murlitharan
Malinga
Amir
Mendis
Rizwan

Process finished with exit code 0
 */