package FunctionalInterface;

import java.util.function.Function;
//Program to calculate length of the string using Lambda function
class Funimpl implements Function<String,Integer>
{
    @Override
    public Integer apply(String s)
    {

        return s.length();
    }
}

public class FunInterface
{
    public static void main(String[] args) {
        //Function<String,Integer> fun = new Funimpl();
        Function<String,Integer> fun = (t)->{return t.length();};
        System.out.println(fun.apply("Heyy,. This is Vaibhav here!!"));
    }
}

/*
    OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar FunctionalInterface.FunInterface
29

Process finished with exit code 0

 */