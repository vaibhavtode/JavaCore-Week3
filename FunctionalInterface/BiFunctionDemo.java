package FunctionalInterface;

import java.util.function.BiFunction;
//Program to implement Addtion by using Bifunction
class BiFunctionImpl implements BiFunction<Integer,Integer,Integer>
{
    @Override
    public Integer apply(Integer t, Integer u)
    {
        Integer c = t + u;

        return c;

    }
}

public class BiFunctionDemo
{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bifun =(t,u)-> {
            Integer c = t + u;
            return c;
        };
        System.out.print("THE RESULT IS: ");
        System.out.println(bifun.apply(50,60));
    }
}

/*
    OUTPUT:
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar FunctionalInterface.BiFunctionDemo
THE RESULT IS: 110

Process finished with exit code 0
 */