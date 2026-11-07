import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    
    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {

            int num, highest, lowest;

            System.out.print("Number 1: ");
            num = Integer.parseInt(input.readLine());

            highest = num;
            lowest = num;

            for (int i = 2; i <= 10; i++) {

                System.out.print("Number " + i + ": ");
                num = Integer.parseInt(input.readLine());

                if (num > highest) {
                    highest = num;
                }

                if (num < lowest) {
                    lowest = num;
                }

            }

            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);



        } catch (IOException e) {
            System.err.println("Error reading input stream.");
            
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }
    
}