package FileHandling;

import java.io.File;

public class TestFile
{
    public static void main(String[] args) {
        File f2 = new File("myfile.txt");
        if (f2.exists())
        {
            System.out.println(f2.getName());
            System.out.println(f2.isFile());
            System.out.println(f2.canWrite());
            System.out.println(f2.getPath());
            System.out.println(f2.isDirectory());
            System.out.println(f2.length());
            System.out.println(f2.lastModified());
            System.out.println("This is Okay Bro..!");
        }
    }
}
