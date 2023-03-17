package Movingball;

//import java.awt.Graphics;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Movingball extends JPanel{
	
	static int vel = 50;
	int x;
	int y;
	int d=30;
	
	//@Override
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.RED);
		g.fillRect(50,100,100,10);
		
		g.setColor(Color.BLACK);
		g.fillOval(200,300,100,200);

		
		g.setColor(Color.BLUE);
	//	g.fillOval(x,y,d,d);
		//g.fillRect(vel,0,50,50);
		g.fillOval(vel,0,100,50);
		
		
	}
	public void moveright() {
		
			vel=vel+1;

		}
	
	
	public void moveleft() {
		vel=vel-1;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//public static JFrame frame;
Movingball drawing = new Movingball ();
JFrame jframe =new JFrame("Movingball");
jframe.setSize(400,400);
jframe.setVisible(true);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


jframe.add(drawing);

while(true) {
	int e=0;
	
	while(e==0) {
		drawing.repaint();
		drawing.moveright();
		Thread.sleep(10);
	if(vel==300) {
	e=1;
	}
	while(e==1){
		drawing.repaint();
		drawing.moveleft();
		Thread.sleep(10);
		if(vel==0) {
			
			e=0;
			}
	}
	}
	
}


	}

}
