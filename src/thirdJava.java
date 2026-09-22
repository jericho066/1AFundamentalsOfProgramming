import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thirdJava {
    
    public static void main(String[] args) {

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        System.out.print("Please enter your name: ");

        try {
            name = dataln.readLine();

        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello " + name + "!");

    }

} 
 