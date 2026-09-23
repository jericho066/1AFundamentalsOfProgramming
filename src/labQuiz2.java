import java.util.Scanner;


public class labQuiz2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Adobo Cooking Show");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("How many kilo of pork will you cook? ");
        String kiloString = input.nextLine();
        double kilo = Double.parseDouble(kiloString);

        double ratioForSauce = kilo * (1.0 / 2.0);
        double ratioForVinegar = kilo * (1.0 / 3.0);

        System.out.println("The ratio of soy sauce for " + kilo + "kg is " + ratioForSauce);
        System.out.println("The ratio of vinegar for " + kilo + "kg is " + ratioForVinegar);

    }
    
}
