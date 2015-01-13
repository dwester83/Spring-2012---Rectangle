// Java Rectangle Program Step 4
// Daniel Wester, Spencer Davis

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleProgram4 extends JFrame {

	JLabel lengthLabelField, widthLabelField, areaLabelField, perimeterLabelField;
	JTextField lengthTextField, widthTextField, areaTextField, perimeterTextField;
	JButton calculateButton, exitButton;

	public RectangleProgram4() {

		lengthLabelField = new JLabel("Enter the length: ", SwingConstants.RIGHT);
		widthLabelField = new JLabel("Enter the width: ", SwingConstants.RIGHT);
		areaLabelField = new JLabel("Area: ", SwingConstants.RIGHT);
		perimeterLabelField = new JLabel("Perimeter: ", SwingConstants.RIGHT);

		lengthTextField = new JTextField("", SwingConstants.LEFT);
		widthTextField = new JTextField("", SwingConstants.LEFT);
		areaTextField = new JTextField("", SwingConstants.LEFT);
		areaTextField.setEditable(false);
		perimeterTextField = new JTextField("", SwingConstants.LEFT);
		perimeterTextField.setEditable(false);

		calculateButton = new JButton ("Calculate");
		exitButton = new JButton ("Exit");
		calculateButton.addActionListener(new CalculateButtonHandler());
		exitButton.addActionListener(new ExitButtonHandler());

		Container pane = getContentPane();
		pane.setLayout(new GridLayout (5,2));
		pane.add(lengthLabelField);
		pane.add(lengthTextField);
		pane.add(widthLabelField);
		pane.add(widthTextField);
		pane.add(areaLabelField);
		pane.add(areaTextField);
		pane.add(perimeterLabelField);
		pane.add(perimeterTextField);
		pane.add(calculateButton);
		pane.add(exitButton);
		
		setTitle("Area and Perimeter of a Rectangle");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		
	}	
	
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			System.exit(0);
		}
	}
	
	private class CalculateButtonHandler implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			double lengthInput = Double.parseDouble(lengthTextField.getText());
			double widthInput = Double.parseDouble(widthTextField.getText());
			String areaOutput = String.format("" + (lengthInput * widthInput));
			String perimeterOutput = String.format("" + (2 * (lengthInput + widthInput)));
			areaTextField.setText(areaOutput);
			perimeterTextField.setText(perimeterOutput);
		}
	}
	
	
	//Main
	public static void main (String [] args) {
		new RectangleProgram4();
	}
}
