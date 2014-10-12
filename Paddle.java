package BrickBreaker;

import zen.core.Zen;

public class Paddle {
	
	int x;
	int y;
	
	public Paddle() {
		y = 750;
		x = 250;
	}

	public void draw() {
		Zen.setColor("red");
		Zen.fillRect(x - 35, y, 70, 20);
	}

	public void move() {
		if (Zen.isKeyPressed("right")) {
			x = x + 5;
		}
		if (Zen.isKeyPressed("left")) {
			x = x - 5;
		}
		if (x > 465) {
			x = 465;
		}
		if (x < 35) {
			x = 35;
		}
	}

}
