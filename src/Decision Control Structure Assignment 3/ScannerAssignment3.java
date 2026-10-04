import  java.util.Scanner;

public class ScannerAssignment3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int NSATScore, parentsSalary, entranceExamScore;

        System.out.print("What is the student's NSAT Score?: ");
        NSATScore = input.nextInt();

        System.out.print("What is the student's parents' Salary?: ");
        parentsSalary = input.nextInt();

        System.out.print("What is the student's Entrance Exam Score?: ");
        entranceExamScore = input.nextInt();

        double average = (NSATScore + entranceExamScore) / 2;

        if (parentsSalary > 10000 || NSATScore < 90 || entranceExamScore < 85) {
            System.out.println("The applicant is rejected!");
        } else if (parentsSalary <= 3500 && average > 90) {
            System.out.println("The applicant is accepted!");
        } else {
            System.out.println("The applicant is for further study!");
        }

    }

}
