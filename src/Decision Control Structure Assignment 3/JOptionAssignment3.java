import javax.swing.JOptionPane;

class JOptionAssignment3 {
    
    public static void main(String[] args) {

        String NSATScoreString, parentsSalaryString, entranceExamScoreString, msg;
        int NSATScore, parentsSalary, entranceExamScore;

        NSATScoreString = JOptionPane.showInputDialog("What is the student's NSAT Score?");
        NSATScore = Integer.parseInt(NSATScoreString);

        parentsSalaryString = JOptionPane.showInputDialog("What is the student's parents' Salary?");
        parentsSalary = Integer.parseInt(parentsSalaryString);

        entranceExamScoreString = JOptionPane.showInputDialog("What is the student's Entrance Exam Score?");
        entranceExamScore = Integer.parseInt(entranceExamScoreString);

        double average = (NSATScore + entranceExamScore) / 2;

        if (parentsSalary > 10000 || NSATScore < 90 || entranceExamScore < 85) {
            msg = "The applicant is rejected!";
            JOptionPane.showMessageDialog(null, msg);
        } else if (parentsSalary <= 3500 && average > 90) {
            msg = "The applicant is accepted!";
            JOptionPane.showMessageDialog(null, msg);
        } else {
            msg = "The applicant is for further study!";
            JOptionPane.showMessageDialog(null, msg);
        }


    }

}