import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderAssignment3 {
    
    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            String NSATScoreString, parentsSalaryString, entranceExamScoreString;
            int NSATScore, parentsSalary, entranceExamScore;

            System.out.print("What is the student's NSAT Score?: ");
            NSATScoreString = input.readLine();
            NSATScore = Integer.parseInt(NSATScoreString);

            System.out.print("What is the student's parents' Salary?: ");
            parentsSalaryString = input.readLine();
            parentsSalary = Integer.parseInt(parentsSalaryString);

            System.out.print("What is the student's Entrance Exam Score?: ");
            entranceExamScoreString = input.readLine();
            entranceExamScore = Integer.parseInt(entranceExamScoreString);

            double average = (NSATScore + entranceExamScore) / 2;

            if (parentsSalary > 10000 || NSATScore < 90 || entranceExamScore < 85) {
                System.out.println("The applicant is rejected!");
            } else if (parentsSalary <= 3500 && average > 90) {
                System.out.println("The applicant is accepted!");
            } else {
                System.out.println("The applicant is for further study!");
            }

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }

}
