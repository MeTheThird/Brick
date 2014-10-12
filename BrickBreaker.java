package BrickBreaker;

import java.util.ArrayList;

import zen.core.Zen;

public class BrickBreaker {

	public static void main(String[] args) {
		Zen.create(500, 800);

		
		//setup steps
		Paddle p = new Paddle();
		Ball b = new Ball();
		ArrayList<Brick> bricks = new ArrayList<Brick>();
		
		int brickX1 = 50;
		while (brickX1 < 500) {
			RedBrick Rbr = new RedBrick(brickX1, 200);
			bricks.add(Rbr);
			brickX1 = brickX1 + 50;
		}
		 int brickX = 50;
		while (brickX < 500) {
			Brick br = new Brick(brickX, 300);
			bricks.add(br);
			brickX = brickX + 50;
		}
		brickX = 50;
		while (brickX < 500) {
			Brick br = new Brick(brickX, 400);
			bricks.add(br);
			brickX = brickX + 50;
		}

		
		while(true) {
			drawBackground();
			
			// Draw/move paddle and ball
			p.draw();
			b.draw();
			p.move();
			b.move();
			
			// Draw every brick.
			for (Brick br : bricks) {
				br.draw();
			}
			//go to every brick and check it
			for (int i = 0; i < bricks.size(); i++) {
				
				if (bricks.get(i).isTouching(b) && bricks.get(i).health <= 0) {
					
					bricks.remove(i);
					
					b.dy = -b.dy;
					
					//go back one step to cover all cases
					i--;
				}
				else {
					bricks.get(i).draw();
					bricks.get(i).move();
				}
			}
			
			if (b.isTouching(p)) {
				b.dy = -b.dy;
			}
			
			
			
			
			Zen.buffer(33);
		}
	}

	private static void drawBackground() {
		Zen.setBackground("yellow");
	}

}
