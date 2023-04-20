import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

public class snake extends JPanel implements ActionListener, KeyListener{
	private JFrame frame;
	private JFrame log;

int px=100; //Horizontal position of the target object
int py=100; //Vertical position of the target object
int x;
int y;
int velx;
int vely;
int d=40;//Diameter of the circle
int r=d/2; //Radius of the circle
int l=10; //Length of the target rectangle
int l2=l/2; //Half of the length of the target 
int score = 0;
int n=1; //Speed mutiplier

Timer tm = new Timer (5,this);


public void paint(Graphics g){
	super.paint(g);
	g.setColor(Color.BLUE);
	g.fillOval(x,y,d,d);
	
	g.setColor(Color.RED);
	g.fillRect(px,py,7,7);
	
	



	if((px+l2>=x && px+l2<=x+d && py+l2>=y && py+l2<=y+d)) {
		px=(int)(Math.random()*getWidth()-100)+100;
		py=(int)(Math.random()*getHeight()-100)+100;
		score=score+1;
		n=n+1;

	
	}
	if((x>=getWidth()-d||x<0)||(y>=getHeight()-d||y<0)) {
	tm.stop();
	
	log = new JFrame("GAME OVER");
	if(JOptionPane.showConfirmDialog(log, "Score: "+score+"\n"+" Exit", "GAME OVER",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
		System.exit(0);
	}
	}
	

	
	
}
public snake() {
	initialize();
	tm.start();
	addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
}
private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
}
public void actionPerformed(ActionEvent e) {
x=x+n*velx;
y=y+n*vely;
	repaint();
}

public void keyPressed(KeyEvent e) {
	int c=e.getKeyCode();
	
	if(c==KeyEvent.VK_LEFT){
		velx=-1;
		vely=0;
		
	}
	if(c==KeyEvent.VK_RIGHT){
		velx= 1;
		vely=0;
		
	}
	if(c==KeyEvent.VK_UP){
		velx=0;
		vely=-1;
		
	}
	if(c==KeyEvent.VK_DOWN){
		velx=0;
		vely=1;
		
	}
}

public void keyReleased(KeyEvent e) {
	velx=0;
	vely=0;
}

public void keyTyped(KeyEvent e) {



}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					snake t = new snake();
					JFrame jframe =new JFrame("snake");
					jframe.setSize(400,400);
					jframe.setVisible(true);
					jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					jframe.add(t);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

}
