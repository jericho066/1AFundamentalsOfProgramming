import javax.swing.JOptionPane;

public class JOptionAssignment2 {
    
    
    public static void main(String[] args) {

        String hourlyPayRateString, hoursWorkedString, msg;
        double hourlyPayRate, hoursWorked, grossPay, taxRate, withHoldingTax, netPay;

        hourlyPayRateString = JOptionPane.showInputDialog("Employee's hourly pay rate: ");
        hourlyPayRate = Double.parseDouble(hourlyPayRateString);

        hoursWorkedString = JOptionPane.showInputDialog("How many hours did the employee worked: ");
        hoursWorked = Double.parseDouble(hoursWorkedString);

        grossPay = hoursWorked * hourlyPayRate;

        taxRate = 0.0;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else if (grossPay > 10000) {
            taxRate = 0.20;
        }

        withHoldingTax = grossPay * taxRate;
        netPay = grossPay - withHoldingTax;

        msg = "Gross Pay: " + grossPay + "\n" + "Withholding Tax: " + withHoldingTax + "\n" + "Net Pay: " + netPay;

        JOptionPane.showMessageDialog(null, msg);

    }


}
