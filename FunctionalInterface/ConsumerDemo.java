package FunctionalInterface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>
{
    @Override
    public void accept(String name)
    {
        System.out.println("Hiii..."+name);
    }
}

public class ConsumerDemo
{
    public static void main(String[] args) {
        Consumer<String> consumer = name-> System.out.println("Name: "+name);
        consumer.accept("Babu Bhaiya");
    }
}
