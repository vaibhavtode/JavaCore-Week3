package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//Program for sorting using Lambda Expression
public class Lambda1
{
    public static void main(String[] args) {
        List <String> names = Arrays.asList("SharmaJi","SharmaJi's Son","VermaJi","Babuji","Kabuter's Chick");
        //sorting using lambda expression
        names.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println("Sorted List by using Lamda Expression =>"+names);
    }
}


/*
OUTPUT:-
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar Java8.Lambda1
Sorted List by using Lamda Expression =>[Babuji, Kabuter's Chick, SharmaJi, SharmaJi's Son, VermaJi]
 */