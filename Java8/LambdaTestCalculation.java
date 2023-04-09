package Java8;

interface Calculation
{
    int cal(int a, int b);
}

class Summation implements Calculation
{
    public int cal(int a, int b)
    {
        return (a+b);
    }
}

public class LambdaTestCalculation
{
    public static void main(String[] args) {
        Calculation cal = (a,b)->{ return (a+b);
        };
        System.out.print("The Sum of the Numbers is: ");
        System.out.println(cal.cal(40,50));
    }
}

/*
    OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar Java8.LambdaTestCalculation
The Sum of the Numbers is: 90

Process finished with exit code 0
 */
