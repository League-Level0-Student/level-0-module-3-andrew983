//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot SnaEK = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 293203; i++) {
		

	String color = JOptionPane.showInputDialog("What color?");
			if (color.equals("red")) {

				SnaEK.setPenColor(255, 0, 0);

			}
			else if (color.equals("green")) {

				SnaEK.setPenColor(0, 255, 0);

			}
			else if (color.equals("blue")) {

				SnaEK.setPenColor(0, 0, 255);

			}
			// 5. Use an if/else statement to set the pen color that the user requested
			else if (color.equals("")) {

				SnaEK.setRandomPenColor();

			}
			SnaEK.setPenWidth(10);
			SnaEK.setSpeed(200);// 6. If the user doesn’t enter anything, choose a random color
	SnaEK.penDown();
	SnaEK.move(75);
	SnaEK.turn(95);
	SnaEK.move(75);
	SnaEK.turn(95);
	SnaEK.move(75);
	SnaEK.turn(95);
	SnaEK.move(75);

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10

			// 2. Make the robot draw a shape (this will take more than one line of code)
		}

	}
}
