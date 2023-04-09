package FunctionalInterface;

@FunctionalInterface
interface ShowAble
{
    public void message(String s);
}
class SMS
{
    public static void showSMS(String s)
    {
        System.out.println("This is "+s);
    }
}
class Mail
{
    public void showMail(String s)
    {
        System.out.println("This is " +s);

    }
}
class Letter
{
     Letter(String s)
     {
         System.out.println("This is " +s);
    }


}

public class FunInterface1
{
    public static void main(String[] args) {
        //Static method reference
        ShowAble sms = SMS::showSMS;
        sms.message("Static Method Reference");
        //Instance Method Reference
        Mail mail = new Mail();
        ShowAble showmail = mail::showMail;
        showmail.message("Instance MEthod Reference");
        //Constructor method reference
        ShowAble letter = Letter::new;
        letter.message("Constructor Method Reference");
    }
}

/*
    OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore:/home/vaibhav/Downloads/mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar FunctionalInterface.FunInterface1
This is Static Method Reference
This is Instance MEthod Reference
This is Constructor Method Reference

Process finished with exit code 0
 */