import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader3 {
    public static void main(String[] args)  {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            double balance = 20000.00;
            System.out.println("Mucho Dinero's Account");
            System.out.println("Initial Balance: P" + balance);
            System.out.println("Enter amounts (Positive = Deposit, Negative = Withdrawal).");
            System.out.println("Enter 0 to stop.\n");

            while (true) {
                System.out.print("Enter amount: ");
                double amount = Double.parseDouble(br.readLine());

                if (amount == 0) {
                    break;
                }

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: P" + amount);
                } else {
                    if (Math.abs(amount) > balance) {
                        System.out.println("INSUFFICIENT FUNDS!");
                    } else {
                        balance += amount; 
                        System.out.println("Withdrew: P" + Math.abs(amount));
                    }
                }
                
                System.out.println("Outstanding Balance: P" + balance + "\n");
            }
            
            System.out.println("Transaction ended.");

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
            
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }
}