import javax.swing.*;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class Qronos extends JFrame {

    public Qronos() {
        setTitle("Qronos 0.1");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container mainContent = getContentPane();
        GroupLayout gl = new GroupLayout(mainContent);
        mainContent.setLayout(gl);
                
        Font heading = new Font("Tahoma", Font.PLAIN, 16);
        Font normalText = new Font("Tahoma", Font.PLAIN, 12);
        
        JLabel lbApplicationTitle = new JLabel("A work-time logging application for multiple Projects");  
        lbApplicationTitle.setFont(normalText);
        lbApplicationTitle.setBounds(150, 25, 450, 25);
        mainContent.add(lbApplicationTitle);
                
        JLabel lbSelectProjects = new JLabel("Select Projects");
        lbSelectProjects.setBounds(100, 64, 128, 18);
        lbSelectProjects.setFont(heading);
        mainContent.add(lbSelectProjects);
                
        JLabel lbActiveProjects = new JLabel("Active Projects");
        lbActiveProjects.setBounds(420, 64, 128, 18);
        lbActiveProjects.setFont(heading);
        mainContent.add(lbActiveProjects); 
                
        JButton pauseButton = new JButton("Pause");
        pauseButton.setFont(normalText);
        pauseButton.setBounds(280, 350, 128, 24);
        pauseButton.setFont(normalText);
        mainContent.add(pauseButton);
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Qronos mainFrame = new Qronos();
                mainFrame.setVisible(true);
            }
       });
    }
}