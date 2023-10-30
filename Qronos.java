import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
 
public class Qronos {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Qronos 0.1");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(200, 250, 640, 480);
        mainFrame.setVisible(true);

        Font heading = new Font("Tahoma", Font.PLAIN, 12);
        Font normalText = new Font("Tahoma", Font.PLAIN, 16);

        JPanel mainContent = new JPanel();
        mainFrame.setContentPane(mainContent);
        mainContent.setBorder(new EmptyBorder(5, 5, 5, 5));
        mainContent.setLayout(null);

        JLabel lbApplicationTitle = new JLabel("A work-time logging application for multiple Projects");  
        lbApplicationTitle.setBounds(150, 25, 450, 25);
        lbApplicationTitle.setFont(heading);
        mainContent.add(lbApplicationTitle);
        
        JLabel lbSelectProjects = new JLabel("Select Projects");
        lbSelectProjects.setBounds(100, 64, 128, 18);
        lbSelectProjects.setFont(normalText);
        mainContent.add(lbSelectProjects);
        
        JLabel lbActiveProjects = new JLabel("Active Projects");
        lbActiveProjects.setBounds(420, 64, 128, 18);
        lbActiveProjects.setFont(normalText);
        mainContent.add(lbActiveProjects); 
        
        JButton pauseButton = new JButton("Pause");
        pauseButton.setFont(normalText);
        pauseButton.setBounds(280, 350, 128, 24);
        pauseButton.setFont(heading);
        mainContent.add(pauseButton);
    }
}