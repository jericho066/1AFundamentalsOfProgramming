import javax.swing.JOptionPane;

public class JOptionAssignment4 {
    
    public static void main(String[] args) {
        
        String heightString, ageString, msg, inputMsg, citizenshipMsg, recommendeeMsg;
        int height, age;
        char citizenship, recommendee;

        heightString = JOptionPane.showInputDialog("What is the applicant's height?");
        height = Integer.parseInt(heightString);

        ageString = JOptionPane.showInputDialog("What is the applicant's age?");
        age = Integer.parseInt(ageString);

        citizenship = JOptionPane.showInputDialog("Is the applicant a citizen of Panet Endor? (C/N): ").charAt(0);
        citizenshipMsg = "";

        if (citizenship == 'C') {
            citizenshipMsg = "A citizen of Planet Endor";

        } else if (citizenship == 'N') {
            citizenshipMsg = "NOT a citizen of Planet Endor";
        } 

        recommendee = JOptionPane.showInputDialog("Is the applicant  is a recommendee of Jedi Master Obi Wan? (R/N): ").charAt(0);
        recommendeeMsg = "";

        if (recommendee == 'R') {
            recommendeeMsg = "A recommendee of Jedi Master Obi Wan";

        } else if (recommendee == 'N') {
            recommendeeMsg = "NOT a recommendee of Jedi Master Obi Wan";
        } 

        inputMsg = "Height: " + height + "\n" + "Age: " + age + "\n" + "Citizenship: " + citizenshipMsg + "\n" + "Recommendee: " + recommendeeMsg + "\n";

        if ((height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') || recommendee == 'R') {
            msg = inputMsg + "The applicant is ACCEPTED!";
            JOptionPane.showMessageDialog(null, msg);
            
        } else {
            msg = inputMsg + "The applicant is REJECTED!";
            JOptionPane.showMessageDialog(null, msg);
        }

    }

}
