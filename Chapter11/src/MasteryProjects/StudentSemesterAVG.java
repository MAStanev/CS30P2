/*
Program: StudentSemesterAVG.java 
Last Date of this Revision: November 6, 2025
Purpose: An application	that allows you to enter information about a student and save it to a file
and display the contents of the file.
Author: Michael Stanev,
School: CHHS
Course: Computer Programming 30
*/


package MasteryProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StudentSemesterAVG {

	private JFrame frame;
	private JTextField studentName;
	private JTextField gradeLevel;
	private JTextField semesterNumber;
	private JTextField firstGrade;
	private JTextField secondGrade;
	private JTextField thirdGrade;
	private JTextField fourthGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAVG window = new StudentSemesterAVG();
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
	public StudentSemesterAVG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 137, 29);
		panel.add(lblNewLabel);
		
		JLabel lblGradeLevel = new JLabel("Grade Level:");
		lblGradeLevel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGradeLevel.setBounds(10, 41, 137, 29);
		panel.add(lblGradeLevel);
		
		JLabel lblSemester = new JLabel("Semester Number:");
		lblSemester.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemester.setBounds(10, 72, 137, 29);
		panel.add(lblSemester);
		
		JLabel lblGrade = new JLabel("Grade 1:");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade.setBounds(10, 99, 137, 29);
		panel.add(lblGrade);
		
		JLabel lblGrade_2 = new JLabel("Grade 2:");
		lblGrade_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_2.setBounds(10, 128, 137, 29);
		panel.add(lblGrade_2);
		
		JLabel lblGrade_4 = new JLabel("Grade 3:");
		lblGrade_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_4.setBounds(10, 158, 137, 29);
		panel.add(lblGrade_4);
		
		JLabel lblGrade_1 = new JLabel("Grade 4:");
		lblGrade_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_1.setBounds(10, 184, 137, 29);
		panel.add(lblGrade_1);
		
		JLabel lblGrade_1_1 = new JLabel("Average:");
		lblGrade_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_1_1.setBounds(10, 212, 137, 29);
		panel.add(lblGrade_1_1);
		
		studentName = new JTextField();
		studentName.setBorder(new LineBorder(new Color(171, 173, 179)));
		studentName.setBounds(302, 17, 244, 20);
		panel.add(studentName);
		studentName.setColumns(10);
		
			
		
		gradeLevel = new JTextField();
		gradeLevel.setColumns(10);
		gradeLevel.setBorder(new LineBorder(new Color(171, 173, 179)));
		gradeLevel.setBounds(302, 47, 244, 20);
		panel.add(gradeLevel);
		
		semesterNumber = new JTextField();
		semesterNumber.setColumns(10);
		semesterNumber.setBorder(new LineBorder(new Color(171, 173, 179)));
		semesterNumber.setBounds(302, 78, 244, 20);
		panel.add(semesterNumber);
		
		firstGrade = new JTextField();
		firstGrade.setColumns(10);
		firstGrade.setBorder(new LineBorder(new Color(171, 173, 179)));
		firstGrade.setBounds(302, 105, 244, 20);
		panel.add(firstGrade);
		
		secondGrade = new JTextField();
		secondGrade.setColumns(10);
		secondGrade.setBorder(new LineBorder(new Color(171, 173, 179)));
		secondGrade.setBounds(302, 134, 244, 20);
		panel.add(secondGrade);
		
		thirdGrade = new JTextField();
		thirdGrade.setColumns(10);
		thirdGrade.setBorder(new LineBorder(new Color(171, 173, 179)));
		thirdGrade.setBounds(302, 164, 244, 20);
		panel.add(thirdGrade);
		
		fourthGrade = new JTextField();
		fourthGrade.setColumns(10);
		fourthGrade.setBorder(new LineBorder(new Color(171, 173, 179)));
		fourthGrade.setBounds(302, 190, 244, 20);
		panel.add(fourthGrade);
		
		// Text area
		JTextArea Dis = new JTextArea();
		Dis.setBounds(20, 252, 526, 150);
		panel.add(Dis);
		
		// Buttons
		JButton saveButton = new JButton("Save to File");
		saveButton.setBounds(140, 413, 122, 50);
		panel.add(saveButton);
		
		JButton viewButton = new JButton("View File Contents");
		viewButton.setBounds(336, 413, 129, 50);
		panel.add(viewButton);
		
		



	}
}
