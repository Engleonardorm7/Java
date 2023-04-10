package bouncingFigures;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Canvas;

public class bouncingFigures extends JPanel{

	static int x=0;
	static int y=0;
	static int x2=200;
	static int y2=0;
	boolean moveRight = true;
	boolean moveDown = true;
	boolean moveRight2 = true;
	boolean moveDown2 = true;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillOval(x,y,50,50);
		g.setColor(Color.RED);
	//	g.fillRect(x2,y2,50,50);
		
		g.setColor(Color.BLACK);
		g.fillRect(100,200,200,70);

	}
	
	public void move() {
		if(x==(getWidth()-50)) {
			moveRight= false;
		}else if(y==(getHeight()-50)) {
		moveDown = false;
	}
		if(x==0) {
			moveRight= true;
		}else if(y==0) {
		moveDown = true;
	}
		if (moveDown == true) {
			y++;
			}else {
				y--;
			}
		if(moveRight==true) {
			x++;
			}else {
				x--;
			}
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		bouncingFigures ball = new bouncingFigures ();
		JFrame jframe =new JFrame("bouncingFigures");
		jframe.setSize(400,400);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jframe.add(ball);
	
		while(true) {
			ball.repaint();
			ball.move();
			Thread.sleep(10);
		}
		
	}

}
