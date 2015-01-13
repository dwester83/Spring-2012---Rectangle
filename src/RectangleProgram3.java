// Java Rectangle Program Step 3
// Daniel Wester, Spencer Davis

import javax.swing.*;
import java.awt.*;

public class RectangleProgram3 extends JFrame {

	JLabel lengthLabelField, widthLabelField, areaLabelField, perimeterLabelField;
	JTextField lengthTextField, widthTextField, areaTextField, perimeterTextField;

	public RectangleProgram3() {
		
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
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout (4,2));
		pane.add(lengthLabelField);
		pane.add(lengthTextField);
		pane.add(widthLabelField);
		pane.add(widthTextField);
		pane.add(areaLabelField);
		pane.add(areaTextField);
		pane.add(perimeterLabelField);
		pane.add(perimeterTextField);
		
		setTitle("Area and Perimeter of a Rectangle");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	//Main
	public static void main (String [] args) {
		new RectangleProgram3();
	}
}
