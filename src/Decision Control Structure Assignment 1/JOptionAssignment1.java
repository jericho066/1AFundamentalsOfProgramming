import javax.swing.JOptionPane;

public class JOptionAssignment1 {
    public static void main(String[] args) {

        String yearString = JOptionPane.showInputDialog("Enter a year: ");
        int year = Integer.parseInt(yearString);

        String msgForLeapYear =  year +  " is a leap year.";
        String msgForNotLeapYear =  year +  " is NOT a leap year.";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            JOptionPane.showMessageDialog(null, msgForLeapYear);
        } else {
            JOptionPane.showMessageDialog(null, msgForNotLeapYear);
        }

    }
}
