import javax.swing.JOptionPane;

public class JOption2 {
    
    public static void main(String[] args) {

        String msg = "";
        
        for (int i = 2; i <= 100; i += 2) {

            msg += i + " ";

            if (i % 20 == 0) {
                msg += "\n";
            }


        }

        JOptionPane.showMessageDialog(null, msg);

    }

}
