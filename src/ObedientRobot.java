import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Josh = new Robot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = JOptionPane.showInputDialog("What color shape would you like, red, green, blue?");
		if (color.toLowerCase().equals("red")) {
			Josh.setPenColor(255,0,0);
		}else if (color.toLowerCase().equals("blue")) {
			Josh.setPenColor(0,0,255);
		}else if (color.toLowerCase().equals("green")) {
			Josh.setPenColor(0,255,0);
		}else {
			JOptionPane.showMessageDialog(null, "I don't have that color yet");
		}
		
		String answer = JOptionPane
				.showInputDialog("What shape would you like for me to draw, a square, a triangle, or a circle?");
		Josh.penDown();
		Josh.setSpeed(1000);
		if (answer.toLowerCase().equals("a square")) {

			drawSquare();
		} else if (answer.toLowerCase().equals("a triangle")) {
			drawTriangle();
		} else if (answer.toLowerCase().equals("a circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "Sorry I can't draw that yet");
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Josh.move(200);
			Josh.turn(90);
		}

	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Josh.turn(120);
			Josh.move(200);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Josh.turn(1);
			Josh.move(2);
		}
	}
}
