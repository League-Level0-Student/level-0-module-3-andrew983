package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {

	static Robot harry = new Robot();
	
	
	static void drawSquare() {
	
	harry.setSpeed(200);
	harry.penDown();
	harry.move(90);
	harry.turn(90);
	harry.move(90);
	harry.turn(90);
	harry.move(90);
	harry.turn(90);
	harry.move(90);
	harry.turn(90);
}
	static void drawTriangle() {
		harry.setSpeed(200);
		harry.penDown();
		harry.move(90);
		harry.turn(120);
		harry.move(90);
		harry.turn(120);
		harry.move(90);
		harry.turn(120);
	
	}
	
	static void drawCircle(){
	harry.penDown();
		harry.setSpeed(400);	
		for(int i=0;i<360;i++) {
	
			
			harry.move(1);
	harry.turn(1);
	
	
		}
		
		harry.move(40);
		harry.turn(30);
	}
	
	
	
	public static void main(String[] args) {
	/*		for(int i=0;i<360;i++) {
		drawCircle();
		}
		harry.penUp();
		harry.move(45);
		*/

	String color = JOptionPane.showInputDialog("what cOLOR?(red green blue)");
	
	
	if(color.equals ("red")) {
		
		harry.setPenColor(255, 0, 0);

		}
	else if(color.equals ("green")) {
		
		harry.setPenColor(0, 255, 0);
	
		}
	else if(color.equals( "blue")) {
		
		harry.setPenColor(0, 0, 255);
		
		}
		String shape = JOptionPane.showInputDialog("Square, Triangle, or Circle?");
	if(shape.equals ("Square")){
	
	drawSquare();
	}
	else if(shape.equals("Triangle")) {
		drawTriangle();
	}
	else if(shape.equals( "Circle")) {
	drawCircle();
	}
	
	
	
	
}
}
