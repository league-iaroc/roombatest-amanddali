package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 500;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		goStraight(2100);
		turnLeft(450);
		goStraight(2000);
		turnRight(500);
		goStraight(2400);
		turnLeft(500);
		goStraight(2000);
		turnRight(500);
		goStraight(1000);
	}

	public void loop() {

	}

	void goStraight(int duration) {
		driveDirect(speed, speed);
		sleep(duration);
	}

	void turnRight(int duration) {
		driveDirect(500, 0);
		sleep(duration);
	}

	void turnLeft(int duration) {
		driveDirect(0, 500);
		sleep(duration);
	}
}
