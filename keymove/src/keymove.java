import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

public class keymove extends JPanel implements ActionListener, KeyListener{
	
	private JFrame frame;
	 int x=0;
	 int y=0;	
	 int velx=0;
	 int vely=0;
	Timer tm = new Timer (5,this);
	
	
	

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(x,y,50,50);

		
	}		
	public keymove() {
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
	}

	public void actionPerformed(ActionEvent e) {
		x=x+velx;
		y=y+vely;
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					keymove t = new keymove();
					JFrame jframe =new JFrame("moving");
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
