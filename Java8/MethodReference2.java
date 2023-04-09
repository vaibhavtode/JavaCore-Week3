package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//Program for sorting using MethodRefrence and Lambda Expression
public class MethodReference2
{
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Vaibhav","Mahaan","Aastha","Babuji","Kabuter");
        //sorting using lambda expression
        names.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println("Sorted List by using Lamda Expression =>"+names);
        //sorting using method reference
        names.sort(String::compareTo);
        System.out.println("Sorted List using Method References =>" +names);

    }
}

/*
  OUTPUT:-

  /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar Java8.MethodReference2
Sorted List by using Lamda Expression =>[Aastha, Babuji, Kabuter, Mahaan, Vaibhav]
Sorted List using Method References =>[Aastha, Babuji, Kabuter, Mahaan, Vaibhav]

Process finished with exit code 0

 */

