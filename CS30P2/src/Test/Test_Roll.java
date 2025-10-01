package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Test_Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_Roll window = new Test_Roll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test_Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/Roll_Images/die1.tif");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/Roll_Images/die2.tif");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/Roll_Images/die3.tif");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/Roll_Images/die4.tif");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/Roll_Images/die5.tif");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/Roll_Images/die6.tif");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 548, 512);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dieFace = new JLabel("");
		dieFace.setBounds(41, 235, 215, 239);
		panel.add(dieFace);
		
		JLabel dieFace2 = new JLabel("");
		dieFace2.setBounds(255, 209, 258, 239);
		panel.add(dieFace2);
		
		JButton btnNewButton = new JButton("Roll Die");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieFace.setIcon(d1);
				}
				else if(newRoll == 2)
				{
					dieFace.setIcon(d2);
				}
				else if(newRoll == 3)
				{
					dieFace.setIcon(d3);
				}
				else if(newRoll == 4)
				{
					dieFace.setIcon(d4);
				}
				else if(newRoll == 5)
				{
					dieFace.setIcon(d5);
				}
				else if(newRoll == 6)
				{
					dieFace.setIcon(d6);
				}
				
				newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1)
				{
					dieFace2.setIcon(d1);
				}
				else if(newRoll2 == 2)
				{
					dieFace2.setIcon(d2);
				}
				else if(newRoll2 == 3)
				{
					dieFace.setIcon(d3);
				}
				else if(newRoll == 4)
				{
					dieFace2.setIcon(d4);
				}
				else if(newRoll2 == 5)
				{
					dieFace2.setIcon(d5);
				}
				else if(newRoll2 == 6)
				{
					dieFace2.setIcon(d6);
				}
				
				
			}
		});
		btnNewButton.setBounds(27, 25, 497, 147);
		panel.add(btnNewButton);
		
		
		
		
	}
}