import javax.swing.*;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.List;

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

        setVisible(true);
    }
    private static void loadStorageFile(String fileName) {
        try {
            File openedFile = new File(fileName);
            Scanner fileScanner = new Scanner(openedFile);
           
            //Debugging info
            System.out.println("File name: " + openedFile.getName());
            System.out.println("Absolute path: " + openedFile.getAbsolutePath());
            System.out.println("File size in bytes " + openedFile.length());
            
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
            e.printStackTrace();
        } 
    }

    public static void main(String... args) {
        Qronos mainFrame = new Qronos();
        loadStorageFile("storage.xml");
    }
}