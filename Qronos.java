import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
 
public class Qronos {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Qronos Timekeeper");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 150, 600, 400);
        // mainFrame.add(new JLabel("Select Projects"));
        // mainFrame.add(new JLabel("Active Projects"));
        mainFrame.setVisible(true);

        JPanel mainContent = new JPanel();
        mainContent.setBorder(new EmptyBorder(5, 5, 5, 5));
        mainFrame.setContentPane(mainContent);
        mainContent.setLayout(null);

        JTextField projectName = new JTextField();
        projectName.setFont(new Font("Tahoma", Font.PLAIN, 12));
        projectName.setBounds(20, 46, 190, 20);
        mainContent.add(projectName);
    }
}