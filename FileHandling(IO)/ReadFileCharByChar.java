package FileHandling;

import java.io.File;
import java.io.FileReader;

public class ReadFileCharByChar
{
    public static void main(String[] args) throws Exception{
        File f = new File("myfile.txt");

        FileReader fr = new FileReader(f);
        int ch = fr.read();
        while(ch != -1)
        {
            System.out.println(ch+"==>"+(char)ch);
            ch = fr.read();
        }

        System.out.println(ch);
    }
}
