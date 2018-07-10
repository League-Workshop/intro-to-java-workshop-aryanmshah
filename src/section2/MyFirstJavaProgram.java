package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot jarvis = new Robot();	
jarvis.setPenColor(Color.BLUE);
jarvis.penDown();	
jarvis.setSpeed(200);	
	

for (int i= 0 ; i < 4; i++ ) {
	jarvis.move(150);
	jarvis.turn(90);
	
}
	
	}
}
