package FileHandling;
//import the file class
import java.io.File;
import java.io.IOException;

class BasicFile
{
    public static void main(String[] args) {
        //File name to be specified
        File file = new File("myfile.txt");
//File is created , now we run a try catch block to see whether it is created by using createNewFile() method:-
        //if it is created then well get its name by using getName() method
        //else will catch an IO exception
        try {
            if (file.createNewFile()){
            System.out.println("File created:"+ file.getName());

            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }

}
