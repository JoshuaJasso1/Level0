import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	static Robot josh = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		josh.sparkle();
		josh.setSpeed(100);
		josh.penDown();
		josh.setPenWidth(5);
		josh.setPenColor(255, 0, 0);
		josh.move(60);
		josh.turn(-90);
		josh.move(20);
		josh.turn(90);
		josh.move(15);
		josh.turn(90);
		josh.move(55);
		josh.turn(90);
		josh.move(15);
		josh.turn(90);
		josh.move(20);
		josh.turn(-90);
		josh.move(75);
		josh.turn(90);
		josh.move(45);
		josh.turn(90);
		josh.move(15);
		josh.turn(90);
		josh.move(30);
		josh.penUp();
		josh.move(100);
	}

}
