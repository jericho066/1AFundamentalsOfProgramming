import javax.swing.JOptionPane;

public class JOption3 {
    public static void main(String[] args) {
        
        double balance = 20000.00;
        
        JOptionPane.showMessageDialog(null, "Mucho Dinero's Account\nInitial Balance: P" + balance);

        while (true) {
            
            String input = JOptionPane.showInputDialog("Enter amount:\n(Positive = Deposit, Negative = Withdrawal)\nEnter 0 to stop.");
            
            double amount = Double.parseDouble(input);

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
            } else {
                if (Math.abs(amount) > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                } else {
                    balance += amount; 
                }
            }
            
            JOptionPane.showMessageDialog(null, "Outstanding Balance: P" + balance);
        }
        
        JOptionPane.showMessageDialog(null, "Transaction ended.");
    }
}