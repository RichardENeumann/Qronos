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
        mainFrame.setBounds(200, 250, 640, 480);
        
        mainFrame.setVisible(true);

        JPanel mainContent = new JPanel();
        mainFrame.setContentPane(mainContent);
        mainContent.setBorder(new EmptyBorder(5, 5, 5, 5));
        mainContent.setLayout(null);

        JLabel lbApplicationTitle = new JLabel("A work-time logging application for multiple Projects");  
        mainContent.add(lbApplicationTitle);
        lbApplicationTitle.setBounds(128, 24, 400, 24);
        
        JLabel lbSelectProjects = new JLabel("Select Projects");
        mainContent.add(lbSelectProjects);
        lbSelectProjects.setBounds(100, 64, 128, 18);
        
        JLabel lbActiveProjects = new JLabel("Active Projects");
        mainContent.add(lbActiveProjects);
        lbActiveProjects.setBounds(420, 64, 128, 18);
        
        
        
    }
}