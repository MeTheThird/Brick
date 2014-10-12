package BrickBreaker;

import zen.core.Zen;

public class RedBrick extends Brick {
	
	
	public RedBrick(int newX, int newY) {
		super(newX, newY);
		health = 2;
	}

	public void draw() {
		Zen.setColor("red");
		Zen.fillRect(x - 20, y - 10, 40, 20);
	}

}
