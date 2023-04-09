package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine
{
    public static void main(String[] args) throws IOException {
        FileReader reader1 = new FileReader("myfile.txt");
        BufferedReader br = new BufferedReader(reader1);
        String line = br.readLine();

        //System.out.println(line);
        while(line!=null)
        {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
