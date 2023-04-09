package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileWriter
{
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("myfile.txt");
        PrintWriter pw = new PrintWriter(file);
        System.out.println("Writing into the file");
        pw.append("I am writing some texts into the file which i have created!");
        System.out.println("Writing finished Successfully");
        pw.close();
        file.close();
    }
}
