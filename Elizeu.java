package tecProg;
import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Elizeu extends AdvancedRobot{

	public void run() {
		setColors(Color.BLUE, Color.RED, Color.BLACK);

		while (true) {
			setAhead(25);
			setTurnLeft(25);
			setTurnGunLeft(50);
			turnRadarLeft(180);
			turnRadarRight(3);
			setTurnRight(50);
			setAhead(70);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		double angulo = e.getBearing();
		double distancia = e.getDistance();

		if (distancia > 50) {
			turnGunRight(angulo);
			fire(2);
		}

		if (distancia <= 50) {
			turnGunRight(angulo);
			fire(3);
		}

	}

	public void onHitWall(HitWallEvent event) {
		back(100);
		turnLeft(180);
		turnRadarLeft(180);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		setAhead(100);

	}
}
