package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Dis;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion frame = new MetricConversion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MetricConversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox conversionChoice = new JComboBox();
		conversionChoice.setModel(new DefaultComboBoxModel(new String[] {"Select conversion", "Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		conversionChoice.setBounds(59, 81, 311, 22);
		contentPane.add(conversionChoice);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(126, 37, 180, 33);
		contentPane.add(lblNewLabel);
		
		Dis = new JTextField();
		Dis.setBounds(114, 165, 204, 85);
		contentPane.add(Dis);
		Dis.setColumns(10);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(64, 0, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(156, 117, 126, 37);
		contentPane.add(btnNewButton);

		
		
		
		
		if(conversionChoice.getSelectedItem().equals("Inches to Centimeters"))
		{
			Dis.setText("1 inch = 2.54 centimeters ");
		}
		else if(conversionChoice.getSelectedItem().equals("Feet to Meters"))
		{
			Dis.setText("1 foot = 0.3048");
		}
		else if(conversionChoice.getSelectedItem().equals("Gallons to Liters"))
		{
			Dis.setText("1 Gallon = 4.5461 Liters");
		}
		else if(conversionChoice.getSelectedItem().equals("Gallons to Liters"))
		{
			Dis.setText("1 Pound = 0.4536");
		}
		
		
		
		
	}
}
