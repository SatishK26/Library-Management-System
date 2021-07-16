package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class ReadMe extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JButton b2;
    public static void main(String[] args){
        new ReadMe().setVisible(true);
    }
    public ReadMe() {
        super("Read Me - Library Management System");
        setBounds(500,250,700,500);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel l3 = new JLabel("Library");
        l3.setForeground(new Color(0,250,154));
        l3.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,34));
        l3.setBounds(160,40,150,55);
        contentPane.add(l3);
        
        JLabel l4 = new JLabel("Management System");
        l4.setForeground(new Color(127, 255, 0));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(70, 90, 405, 40);
        contentPane.add(l4);
        
        JLabel l5 = new JLabel("V5.1");
        l5.setForeground(new Color(30,144,255));
        l5.setFont(new Font("Trebuchet MS",Font.BOLD,25));
        l5.setBounds(185,140,100,21);
        contentPane.add(l5);
        
        JLabel l6 = new JLabel("Developed By : K Satish");
        l6.setFont(new Font("Trebuchet MS",Font.BOLD,30));
        l6.setBounds(70,198,600,35);
        contentPane.add(l6);
        
        JTextArea l7 = new JTextArea(" Library management system is a project which\n aims in developing a computerized system to\n maintain all the daily work of a library.The system helps\n both students and library manager to keep a constant track\n of all the books available in the library.It allows both the\n admin and the student to search for the desired book.");
        l7.setFont(new Font("Trebuchat MS",Font.BOLD,20));
        l7.setBounds(70,260,600,200);
        contentPane.add(l7);
        
        
        b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(212, 300, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	
	contentPane.add(b2);
          
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b2){
    
         this.setVisible(false);
		new Home().setVisible(true);
    
        }
    }
}