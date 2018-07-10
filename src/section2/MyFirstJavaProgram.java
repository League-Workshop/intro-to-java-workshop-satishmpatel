package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot ronak = new Robot();
		ronak.setSpeed(200);
		ronak.penDown();
		ronak.setPenColor(Color.BLACK);

		for (int i = 0; i < 4; i++) {
			ronak.move(100);
			ronak.turn(90);
		}
	}
}
