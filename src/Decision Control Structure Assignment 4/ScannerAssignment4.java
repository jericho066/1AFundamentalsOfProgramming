import java.util.Scanner;

public class ScannerAssignment4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int height, age;
        char citizenship, recommendee;

        System.out.print("What is the applicant's height?: ");
        height = input.nextInt();

        System.out.print("What is the applicant's age?: ");
        age = input.nextInt();

        System.out.print("Is the applicant a citizen of Panet Endor? (C/N): ");
        citizenship = input.next().charAt(0);

        System.out.print("Is the applicant  is a recommendee of Jedi Master Obi Wan? (R/N): ");
        recommendee = input.next().charAt(0);

        if ((height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') || recommendee == 'R') {
            System.out.println("The applicant is ACCEPTED!");
        } else {
            System.out.println("The applicant is REJECTED!");
        }

    }

}
