package SkillBuilders;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentData extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField scoreField;

	/**
	 * Create the panel.
	 */
	public studentData() {
		setToolTipText("Hee");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 199, 0};
		gridBagLayout.rowHeights = new int[]{31, 31, 47, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		nameField = new JTextField();
		nameField.setText("Enter Student Name:");
		GridBagConstraints gbc_nameField = new GridBagConstraints();
		gbc_nameField.fill = GridBagConstraints.BOTH;
		gbc_nameField.insets = new Insets(0, 0, 5, 0);
		gbc_nameField.gridx = 1;
		gbc_nameField.gridy = 0;
		add(nameField, gbc_nameField);
		nameField.setColumns(10);
		
		scoreField = new JTextField();
		scoreField.setText("Enter Student Score:");
		scoreField.setColumns(10);
		GridBagConstraints gbc_scoreField = new GridBagConstraints();
		gbc_scoreField.fill = GridBagConstraints.BOTH;
		gbc_scoreField.insets = new Insets(0, 0, 5, 0);
		gbc_scoreField.gridx = 1;
		gbc_scoreField.gridy = 1;
		add(scoreField, gbc_scoreField);

	}

	public JTextField getNameField() {
		return nameField;
	}
	public JTextField getScoreField() {
		return scoreField;
	}
}
