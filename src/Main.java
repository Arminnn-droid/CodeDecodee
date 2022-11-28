import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write("hello world!!" +
                    "\nHow are you doing?!");
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}