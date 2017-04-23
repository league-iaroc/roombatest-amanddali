package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 500;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * complete the MAZE Hint: use bump sensors
	 */

	public void initialize() {
		goStraight();
	}

	public void loop() {
		if (leftBump) {
			resetBumps();
			turnRight(500);
			goStraight();
		}
		if (rightBump) {
			resetBumps();
			turnLeft(500);
			goStraight();
		}
	}

	void goStraight() {
		driveDirect(speed, speed);
	}

	void turnRight(int duration) {
		driveDirect(500, 0);
		sleep(duration);
	}

	void turnLeft(int duration) {
		driveDirect(0, 500);
		sleep(duration);
	}

	void resetBumps() {
		leftBump = false;
		rightBump = false;
	}
}
