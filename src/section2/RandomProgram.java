package section2;

import org.jointheleague.graphical.robot.Robot;

public class RandomProgram {
	public static void main(String[] args) {
		Robot c3po = new Robot("mini");
		c3po.setSpeed(100);
		c3po.penDown();
		c3po.setPenWidth(10000);
		for (int i = 0; i <300; i++) {
			
	c3po.setRandomPenColor();
	c3po.move(360/5);
	c3po.turn(90);
	c3po.move(100);
	
		
		}	
	}

}
