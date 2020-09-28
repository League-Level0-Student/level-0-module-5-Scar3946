package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedientrobot {

	
	public static void main(String[] args) {
		
		
	
			
		
		
		
		
		drawSquare();
		
	}
		
		
		
		
	static Robot Nightstroke = new Robot () ;
	
		
		
		
	

	private static void drawSquare() {
		for(int i = 0; i<3 ; i++) {
	Nightstroke.penDown();
	Nightstroke.move(70);
	Nightstroke.turn(90);
		}
		Nightstroke.move(90);
		
	}
}
