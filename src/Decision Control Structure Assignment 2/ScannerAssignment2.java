import java.util.Scanner;

public class ScannerAssignment2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        double hourlyPayRate, hoursWorked, grossPay, taxRate, withHoldingTax, netPay;

        System.out.print("Employee's hourly pay rate: ");
        hourlyPayRate = input.nextInt();

        System.out.print("How many hours did the employee worked: ");
        hoursWorked = input.nextInt();

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

    }

}
