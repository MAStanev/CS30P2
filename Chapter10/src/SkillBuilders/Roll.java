package SkillBuilders;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
public class Roll {
   private JFrame frame;
   private JLabel Image;
   public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   Roll window = new Roll();
                   window.frame.setVisible(true);
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       });
   }
   public Roll() {
       initialize();
   }
   private void initialize() {
	   
	   
	   
	   ImageIcon d1 = new ImageIcon("../Chapter10/src/Roll_Images/die1.tif");
       ImageIcon d2 = new ImageIcon("../Chapter10/src/Roll_Images/die2.tif");
       ImageIcon d3 = new ImageIcon("../Chapter10/src/Roll_Images/die3.tif");
       ImageIcon d4 = new ImageIcon("../Chapter10/src/Roll_Images/die4.tif");
       ImageIcon d5 = new ImageIcon("../Chapter10/src/Roll_Images/die5.tif");
       ImageIcon d6 = new ImageIcon("../Chapter10/src/Roll_Images/die6.tif");
       
	   
	   
	   
	   
	   
	   
	   
	   
       frame = new JFrame();
       frame.setBounds(100, 100, 260, 368);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setLayout(null);
       Image = new JLabel();
       Image.setBounds(10, 11, 225, 225);
       frame.getContentPane().add(Image);
       JButton btnNewButton = new JButton("Roll Die");
       btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
       btnNewButton.setBounds(72, 247, 101, 32);
       frame.getContentPane().add(btnNewButton);
       // Get random number between 1-6
      
       
       btnNewButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               Random rand = new Random();
               int newRoll = rand.nextInt(6) + 1; // 1–6
             
        
               if (newRoll == 1) {
            	   
            	   Image.setIcon(d1);
               }
               
               else if (newRoll == 2) {
            	   Image.setIcon(d2);
               }
           
               else if (newRoll == 3) {
            	   Image.setIcon(d3);
               }
               
               else if (newRoll == 4) {
            	   Image.setIcon(d4);
               }
               
               else if (newRoll == 5) {
            	   Image.setIcon(d5);
               }
               
               else if (newRoll == 6) {
            	   Image.setIcon(d6);
               }
           }
       });
   }
}

