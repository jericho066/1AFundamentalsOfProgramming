import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader2 {
    public static void main(String[] args) {
        
        try {

            for (int i = 2; i <= 100; i += 2) {

                System.out.print(i + " ");

                if (i % 20 == 0) {
                    System.out.println();
                }

            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }
}
