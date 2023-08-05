package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Smarth , Yuvraj");
        name.setBounds(70, 220, 5500, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        JLabel name1 = new JLabel("Pranav and Aryan");
        name1.setBounds(200, 259, 5500, 40);
        name1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name1);
        
        JLabel rollno = new JLabel("Roll number: 14 , 05 , 164 ,167");
        rollno.setBounds(70, 300, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
