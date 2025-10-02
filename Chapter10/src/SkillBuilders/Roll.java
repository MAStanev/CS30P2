package SkillBuilders;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;
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
	   
	   
	   
	   ImageIcon d1 = new ImageIcon("../Chapter10/src/Roll_Images2/die1.png");
       ImageIcon d2 = new ImageIcon("../Chapter10/src/Roll_Images2/die2.png");
       ImageIcon d3 = new ImageIcon("../Chapter10/src/Roll_Images2/die3.png");
       ImageIcon d4 = new ImageIcon("../Chapter10/src/Roll_Images2/die4.png");
       ImageIcon d5 = new ImageIcon("../Chapter10/src/Roll_Images2/die5.png");
       ImageIcon d6 = new ImageIcon("../Chapter10/src/Roll_Images2/die6.png");
       
	   
	   
	   
	   
	   
	   
	   
	   
       frame = new JFrame();
       frame.setBounds(100, 100, 541, 522);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setLayout(null);
       Image = new JLabel();
       Image.setBounds(30, 11, 225, 225);
       frame.getContentPane().add(Image);
       JButton btnNewButton = new JButton("Roll Die");
       btnNewButton.setBackground(new Color(0, 255, 0));
       btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
       btnNewButton.setBounds(200, 356, 174, 72);
       frame.getContentPane().add(btnNewButton);
       
       JLabel Image_1 = new JLabel();
       Image_1.setBounds(276, 11, 225, 225);
       frame.getContentPane().add(Image_1);
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

               // Second dice
               int newRoll2 = rand.nextInt(6) + 1; // 1–6	   
            
            if (newRoll2 == 1) {
            	Image_1.setIcon(d1);
            }
            
            else if (newRoll2 == 2) {
            	Image_1.setIcon(d2);
            }
            
            else if (newRoll2 == 3) {
            	Image_1.setIcon(d3);
            }
            
            else if (newRoll2 == 4) {
            	Image_1.setIcon(d4);
            }
            
            else if (newRoll2 == 5) {
            	Image_1.setIcon(d5);
            }
            
            else if (newRoll2 == 6) {
            	Image_1.setIcon(d6);
            }
            
            
            	  
               }
           
       });
   }
}

