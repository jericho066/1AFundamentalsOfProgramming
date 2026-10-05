import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderAssignment4 {

    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            String heightString, ageString;
            int height, age;
            char citizenship, recommendee;

            System.out.print("What is the applicant's height?: ");
            heightString = input.readLine();
            height = Integer.parseInt(heightString);

            System.out.print("What is the applicant's age?: ");
            ageString = input.readLine();
            age = Integer.parseInt(ageString);

            System.out.print("Is the applicant a citizen of Panet Endor? (C/N): ");
            citizenship = input.readLine().charAt(0);

            System.out.print("Is the applicant  is a recommendee of Jedi Master Obi Wan? (R/N): ");
            recommendee = input.readLine().charAt(0);

            if ((height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') || recommendee == 'R') {
                System.out.println("The applicant is ACCEPTED!");
            } else {
                System.out.println("The applicant is REJECTED!");
            }

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        }

    }
    
}