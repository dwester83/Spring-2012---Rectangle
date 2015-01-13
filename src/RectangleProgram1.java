// Java Rectangle Program Step 1
// Daniel Wester, Spencer Davis

import javax.swing.*;
import java.awt.*;

public class RectangleProgram1 extends JFrame {

	public RectangleProgram1() {
		setTitle("Area and Perimeter of a Rectangle");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		
	public static void main (String [] args) {
		new RectangleProgram1();
	}
}
