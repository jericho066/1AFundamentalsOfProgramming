import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labQuiz1 {

    public static void main(String[] args) {

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your Birth Year: ");
            String birthYearInput = dataln.readLine();
            int birthYear = Integer.parseInt(birthYearInput);
            int currentYear = 2026;
            int age = currentYear - birthYear;

            System.out.println("You were born last " + birthYear + ".");
            System.out.println("You are now " + age + " yrs old.");


        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }
    
}