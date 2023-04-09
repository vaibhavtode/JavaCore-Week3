package FunctionalInterface;
import java.time.LocalDateTime;
import java.util.function.Supplier;

//Program for implementation of Supplier
class SupplierImpl implements Supplier<LocalDateTime>
{
    @Override
    public LocalDateTime get()
    {
        return LocalDateTime.now();
    }

}
public class SupplierDemo
{
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = new SupplierImpl();
        System.out.print("THE LOCAL DATE AND TIME IS: ");
        System.out.println(supplier.get());
    }
}

/*
    OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar FunctionalInterface.SupplierDemo
THE LOCAL DATE AND TIME IS: 2023-04-08T19:54:22.794942

Process finished with exit code 0
 */