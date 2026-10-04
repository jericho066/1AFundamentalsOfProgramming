import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAssignment2 {
    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String hourlyPayRateString, hoursWorkedString;
        double hourlyPayRate, hoursWorked, grossPay, taxRate, withHoldingTax, netPay;

        try {
            System.out.print("Employee's hourly pay rate: ");
            hourlyPayRateString = input.readLine();
            hourlyPayRate = Double.parseDouble(hourlyPayRateString);

            System.out.print("How many hours did the employee worked: ");
            hoursWorkedString = input.readLine();
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


            System.out.println("Gross Pay: " + grossPay);
            System.out.println("Withholding Tax: " + withHoldingTax);
            System.out.println("Net Pay: " + netPay);

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }


    }
}
