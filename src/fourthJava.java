import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class fourthJava {

    public static void main(String[] args) {

        String filePath = "OLiver.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is the first line of text.");
            writer.newLine();
            writer.write("This is the second line of text");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("data successfully written to the file!");
        } catch (IOException e) {
            System.err.println("An error occured while writing to the file");
            e.printStackTrace();
        }

    }
    
}  
