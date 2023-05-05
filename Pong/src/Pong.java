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

public class Pong extends JPanel implements ActionListener, KeyListener{
	private JFrame frame;
	private JFrame log;

int px=100; //Horizontal position of the target object
int py=100; //Vertical position of the target object
int x=150;
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
	g.setColor(Color.RED);
	g.fillOval(px,py,7,7);//ball
	
	g.setColor(Color.BLUE);
	g.fillRect(x,300,100,2);
	


	if(py>=293 && (px>=x && px<=(x+100))) {
		py--;
		px-=3;
	
	}
	if(px>=(getWidth()-7)) { // 
		py--;
		px-=3;
	}
	if(px<=0) {
		py++;
		px+=3;
	}
		
	if(py>=getHeight()) {
		tm.stop();
		
		log = new JFrame("GAME OVER");
		if(JOptionPane.showConfirmDialog(log, "Score: "+score+"\n"+" Exit", "GAME OVER",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}
}
public Pong() {
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
					Pong t = new Pong();
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
