package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 500;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		goStraight(3000);
		driveDirect(0, 500);
		sleep(550);
		goStraight(5000);
		driveDirect(500, 0);
		sleep(600);
		goStraight(6000);

	}

	public void loop() {

	}

	void goStraight(int duration) {
		driveDirect(speed, speed);
		sleep(duration);
	}
}
