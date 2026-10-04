import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderAssignment1 {

    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Enter a Year: ");
            String yearString = input.readLine();
            int year = Integer.parseInt(yearString);

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is NOT a leap year.");
            }

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
            
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }
    
}