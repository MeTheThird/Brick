package BrickBreaker;

import zen.core.Zen;

public class Ball {
	
	int x;
	int y;
	int dx;
	int dy;
	
	public Ball() {
		x = 250;
		y = 700;
		dx = Zen.getRandomNumber(-5, 5);
		dy = Zen.getRandomNumber(-10, -8);
	}

	public void draw() {
		Zen.setColor("blue");
		Zen.fillOval(x, y, 20, 20);
	}

	public void move() {
		x = x + dx;
		y = y + dy;
		if (x > 490) {
			x = 490;
			dx = -dx;
		}
		if (x < 10) {
			x = 10;
			dx = -dx;
		}
		if (y < 10) {
			y = 10;
			dy = -dy;
		}
	}

	public boolean isTouching(Paddle p) {
		if (Math.abs(p.x - x) < 35 && Math.abs(p.y - y) < 20) {
			return true;
		}
		return false;
	}


}
