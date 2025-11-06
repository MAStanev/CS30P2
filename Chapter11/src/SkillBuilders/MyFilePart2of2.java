

// For "Assignment" Skill Builder


package SkillBuilders;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
public class MyFilePart2of2 {
	
	
	private JFrame frame;
	
	private static final String FILE_PATH = "C:\\Users\\39046001\\git\\CS30P2\\Chapter11\\src\\SkillBuilders\\zzz.txt";
	private File textFile;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFilePart2of2 window = new MyFilePart2of2();
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
	public MyFilePart2of2() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	
	
	private void initialize()
	{
		
		textFile = new File(FILE_PATH);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 498, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		JLabel Disp = new JLabel("Do you want to download zzz.txt?");
		Disp.setBounds(152, 10, 300, 102);
		frame.getContentPane().add(Disp);
		
		
		JButton btnNewButton = new JButton("Download File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{
				if(textFile.exists())
				{
				    Disp.setText("The file already exists.");
				}
				else
				{
					try
					{
						if(textFile.createNewFile())
					{
						Disp.setText("The file has been created. ");
					}
						else
						{
							Disp.setText("The file could NOT be created. ");
						}
						
					}
					catch(IOException ex)
					{
						Disp.setText("Error: " + ex.getMessage());
						System.err.println("IOException: " + ex.getLocalizedMessage());
					}
					
					}
				
			}
		});
		
		btnNewButton.setBounds(39, 123, 115, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeleteFile = new JButton("Delete File");
		btnDeleteFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(textFile.delete())
				{
					Disp.setText("The file has been DELETED!");
				}
				else
				{
					Disp.setText("Failed to delete the file.");
				}
				
				
			}
		});
		btnDeleteFile.setBounds(327, 123, 115, 59);
		frame.getContentPane().add(btnDeleteFile);
	}
}

