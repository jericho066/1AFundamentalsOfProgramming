import javax.swing.JOptionPane;

public class JOption1 {
    
    public static void main(String[] args) {
        
        int num, highest, lowest;
        String enteredNumbers = "Entered Numbers: ";

        num = Integer.parseInt(JOptionPane.showInputDialog("Number 1"));
        enteredNumbers += String.valueOf(num) + " ";

        highest = num;
        lowest = num;

        for (int i = 2; i <= 10; i++) {


            num = Integer.parseInt(JOptionPane.showInputDialog("Number " + i + ": "));
            enteredNumbers += String.valueOf(num) + " ";

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }

        }

        JOptionPane.showMessageDialog(null, enteredNumbers + "\n" + "Highest: " + highest + "\n" + "Lowest: " + lowest);

    }

}
