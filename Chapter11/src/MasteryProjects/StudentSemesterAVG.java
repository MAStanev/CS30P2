/*
Program: StudentSemesterAVG.java 
Last Date of this Revision: November 24, 2025
Purpose: An application that prompts the user for name, grade, marks, and puts it in a text file.
Author: Misha Stanev
School: Crescent Heights High School
Course: Computer Programming 30
*/

package MasteryProjects;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class StudentSemesterAVG 
{
    private JFrame frame;
    private JTextField StuNameText;
    private JTextField GradeLevelText;
    private JTextField SemNumText;
    private JTextField Gr1Text;
    private JTextField Gr2Text;
    private JTextField Gr3Text;
    private JTextField Gr4Text;
    private JLabel AvgDisplay;
    private JTextArea textArea;

    // ABSOLUTE PATH
    private static final String FILE_PATH =
        "C:\\Users\\39046001\\git\\CS30P2\\Chapter11\\src\\MasteryProjects\\studentData.txt";

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    StudentSemesterAVG window = new StudentSemesterAVG();
                    window.frame.setVisible(true);
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }

    public StudentSemesterAVG() 
    {
        initialize();
    }

    private void initialize() 
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 580, 491);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
        JLabel StuName = new JLabel("Student Name:");
        StuName.setFont(new Font("Tahoma", Font.BOLD, 14));
        StuName.setBounds(10, 0, 250, 26);
        panel.add(StuName);
        JLabel GradeLevel = new JLabel("Grade Level:");
        GradeLevel.setFont(new Font("Tahoma", Font.BOLD, 14));
        GradeLevel.setBounds(10, 25, 250, 26);
        panel.add(GradeLevel);
        JLabel SemNum = new JLabel("Semester Number:");
        SemNum.setFont(new Font("Tahoma", Font.BOLD, 14));
        SemNum.setBounds(10, 51, 250, 26);
        panel.add(SemNum);
        JLabel Gr1 = new JLabel("Grade 1:");
        Gr1.setFont(new Font("Tahoma", Font.BOLD, 14));
        Gr1.setBounds(10, 76, 250, 26);
        panel.add(Gr1);
        JLabel Gr2 = new JLabel("Grade 2:");
        Gr2.setFont(new Font("Tahoma", Font.BOLD, 14));
        Gr2.setBounds(10, 102, 250, 26);
        panel.add(Gr2);
        JLabel Gr3 = new JLabel("Grade 3:");
        Gr3.setFont(new Font("Tahoma", Font.BOLD, 14));
        Gr3.setBounds(10, 128, 250, 26);
        panel.add(Gr3);
        JLabel Gr4 = new JLabel("Grade 4:");
        Gr4.setFont(new Font("Tahoma", Font.BOLD, 14));
        Gr4.setBounds(10, 154, 250, 26);
        panel.add(Gr4);
        JLabel Average = new JLabel("Average:");
        Average.setFont(new Font("Tahoma", Font.BOLD, 14));
        Average.setBounds(10, 180, 70, 26);
        panel.add(Average);
        StuNameText = new JTextField();
        StuNameText.setBounds(234, 3, 320, 23);
        panel.add(StuNameText);
        GradeLevelText = new JTextField();
        GradeLevelText.setBounds(234, 28, 320, 23);
        panel.add(GradeLevelText);
        SemNumText = new JTextField();
        SemNumText.setBounds(234, 54, 320, 23);
        panel.add(SemNumText);
        Gr1Text = new JTextField();
        Gr1Text.setBounds(234, 79, 320, 23);
        panel.add(Gr1Text);
        Gr2Text = new JTextField();
        Gr2Text.setBounds(234, 105, 320, 23);
        panel.add(Gr2Text);
        Gr3Text = new JTextField();
        Gr3Text.setBounds(234, 131, 320, 23);
        panel.add(Gr3Text);
        Gr4Text = new JTextField();
        Gr4Text.setBounds(234, 157, 320, 23);
        panel.add(Gr4Text);
        textArea = new JTextArea();
        textArea.setBounds(10, 208, 544, 194);
        panel.add(textArea);
        JButton Save = new JButton("Save to File");
        Save.setFont(new Font("Tahoma", Font.BOLD, 11));
        Save.setBounds(114, 415, 139, 26);
        panel.add(Save);
        JButton Contents = new JButton("View File Contents");
        Contents.setFont(new Font("Tahoma", Font.BOLD, 11));
        Contents.setBounds(261, 415, 139, 26);
        panel.add(Contents);
        AvgDisplay = new JLabel("");
        AvgDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
        AvgDisplay.setBounds(80, 180, 200, 26);
        panel.add(AvgDisplay);

        // SAVE BUTTON
        Save.addActionListener(e -> 
        {
            try 
            {
                String name = StuNameText.getText();
                String grade = GradeLevelText.getText();
                String sem = SemNumText.getText();

                double g1 = Double.parseDouble(Gr1Text.getText());
                double g2 = Double.parseDouble(Gr2Text.getText());
                double g3 = Double.parseDouble(Gr3Text.getText());
                double g4 = Double.parseDouble(Gr4Text.getText());

                double avg = (g1 + g2 + g3 + g4) / 4.0;

                AvgDisplay.setText(String.format("%.2f", avg));

                FileWriter writer = new FileWriter(FILE_PATH, true);

                writer.write(
                    "Name: " + name +
                    ", Grade: " + grade +
                    ", Semester: " + sem +
                    ", Grades: " + g1 + ", " + g2 + ", " + g3 + ", " + g4 +
                    ", Average: " + avg + "\n"
                );

                writer.close();

                JOptionPane.showMessageDialog(frame, "Data saved successfully!");
            } 
            catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(frame, "Error: enter numbers for grades.");
            }
        });

        // VIEW FILE
        Contents.addActionListener(e -> 
        {
            textArea.setText("");

            try 
            {
                File file = new File(FILE_PATH);
                Scanner reader = new Scanner(file);

                while (reader.hasNextLine()) 
                {
                    textArea.append(reader.nextLine() + "\n");
                }

                reader.close();
            } 
            catch (Exception ex) 
            {
                textArea.setText("No data found yet.");
            }
        });
    }
}
