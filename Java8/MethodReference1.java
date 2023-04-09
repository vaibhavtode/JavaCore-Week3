package Java8;
import java.util.List;
import java.util.ArrayList;
//Program for MethodRefrences
public class MethodReference1
{
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Vaibhav");
        names.add("Mahaan");
        names.add("Aastha");
        names.add("Kshitij");
        names.add("Piyush");

        names.forEach((name)-> System.out.println(name));
        names.forEach(System.out::println);

    }
}

/*
OUTPUT;-
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar Java8.MethodReference1
Vaibhav
Mahaan
Aastha
Kshitij
Piyush
Vaibhav
Mahaan
Aastha
Kshitij
Piyush

Process finished with exit code 0
 */