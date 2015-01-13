// Java Rectangle Program Step 2
// Daniel Wester, Spencer Davis

import javax.swing.*;
import java.awt.*;

public class RectangleProgram2 extends JFrame {

	JLabel lengthLabelField, widthLabelField, areaLabelField, perimeterLabelField;

	public RectangleProgram2() {
	
		lengthLabelField = new JLabel("Enter the length: ", SwingConstants.RIGHT);
		widthLabelField = new JLabel("Enter the width: ", SwingConstants.RIGHT);
		areaLabelField = new JLabel("Area: ", SwingConstants.RIGHT);
		perimeterLabelField = new JLabel("Perimeter: ", SwingConstants.RIGHT);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout (4,1));
		pane.add(lengthLabelField);
		pane.add(widthLabelField);
		pane.add(areaLabelField);
		pane.add(perimeterLabelField);
		
		setTitle("Area and Perimeter of a Rectangle");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);


	}

	//Main
	public static void main (String [] args) {
		new RectangleProgram2();
	}
}
