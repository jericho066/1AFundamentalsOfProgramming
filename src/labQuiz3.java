import javax.swing.JOptionPane;

public class labQuiz3 {

    public static void main(String[] args) {


        double salaryIncrease = 0.1775;


        String salaryString = JOptionPane.showInputDialog("What is the employee's old salary?");
        double oldSalary = Double.parseDouble(salaryString);


        double amountOfRetroativePay = (oldSalary * salaryIncrease) * 2;
        double newSalary = oldSalary + (oldSalary * salaryIncrease);
        

        String msg = "The amount of increase 2 months ago was " + amountOfRetroativePay + "\n" + "The employee's new salary is " + newSalary;

        JOptionPane.showMessageDialog(null, msg);


    }
    
}
