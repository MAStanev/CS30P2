/*
Program: BreakAPlate.java
Last Date of this Revision: November 5, 2025 - Updated code to meet coding standards & added ChatGPT transcript
Purpose: This application simulates a game booth at a carnival
Author: Michael Stanev
School: CHHS
Course: Computer Science 30
*/

package MasteryProjects;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
import java.awt.Color;


public class BreakAPlate
{
    private JFrame frame;
    private JLabel platesLabel;
    private JLabel prizeLabel;
    private JButton playButton;

    // Dimensions of window
    private static final int WINDOW_X = 100;
    private static final int WINDOW_Y = 100;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;
    
    // Dimensions of plate
    private static final int PLATES_X = 0;
    private static final int PLATES_Y = -45;
    private static final int PLATES_WIDTH = 584;
    private static final int PLATES_HEIGHT = 227;
    
    // Dimensions of prize
    private static final int PRIZE_X = 239;
    private static final int PRIZE_Y = 217;
    private static final int PRIZE_WIDTH = 122;
    private static final int PRIZE_HEIGHT = 111;
    private static final int BUTTON_X = 239;
    
    // Dimensions of button
    private static final int BUTTON_Y = 152;
    private static final int BUTTON_WIDTH = 122;
    private static final int BUTTON_HEIGHT = 30;


    // Main method 
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    BreakAPlate window = new BreakAPlate();
                    window.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }


    public BreakAPlate()
    {
        initialize();
    }


    private void initialize()
    {
        // Create main window frame
        frame = new JFrame("Break A Plate Game");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Load images
        ImageIcon plates = new ImageIcon("../Chapter10/src/BreakAPlate_Images/plates.gif");
        ImageIcon platesTwoBroken = new ImageIcon("../Chapter10/src/BreakAPlate_Images/plates_two_broken.gif");
        ImageIcon platesAllBroken = new ImageIcon("../Chapter10/src/BreakAPlate_Images/plates_all_broken.gif");
        ImageIcon sticker = new ImageIcon("../Chapter10/src/BreakAPlate_Images/sticker.gif");
        ImageIcon tiger = new ImageIcon("../Chapter10/src/BreakAPlate_Images/tiger_plush.gif");

        // Create labels for platers and prize
        platesLabel = new JLabel(plates);
        platesLabel.setBounds(PLATES_X, PLATES_Y, PLATES_WIDTH, PLATES_HEIGHT);
        prizeLabel = new JLabel();
        prizeLabel.setBounds(PRIZE_X, PRIZE_Y, PRIZE_WIDTH, PRIZE_HEIGHT);
        playButton = new JButton("Play");
        playButton.setBounds(BUTTON_X, BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        // Add action listener for button clicks
        playButton.addActionListener(e ->
        {
            String currentText = playButton.getText();
            Random random = new Random();

            if (currentText.equals("Play"))
            {
            	// Randomly break plates and return prizes
                int result = random.nextInt(2);

                if (result == 0)
                {
                    platesLabel.setIcon(platesTwoBroken);
                    prizeLabel.setIcon(sticker);
                }
                else
                {
                    platesLabel.setIcon(platesAllBroken);
                    prizeLabel.setIcon(tiger);
                }

                playButton.setText("Play Again");
            }
            else
            {
                platesLabel.setIcon(plates);
                prizeLabel.setIcon(null);
                playButton.setText("Play");
            }
        });

        // Add components to frame
        frame.getContentPane().add(playButton);
        frame.getContentPane().add(platesLabel);
        frame.getContentPane().add(prizeLabel);
    }
}
