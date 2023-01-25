import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class W16 {

	private JFrame frame;
	private JTextField textField;
	private JTextField FIXIES;
	private JTextField PIXIES;
	private JLabel lblNewLabel_4;
	private JFrame log; // you win/you lost window

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					W16 window = new W16();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public W16() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PIXIES AND FIXIES");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel.setBounds(128, 30, 158, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Try to guess my 4 digit number");
		lblNewLabel_1.setBounds(116, 75, 184, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(147, 123, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FIXIES");
		lblNewLabel_2.setBounds(86, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PIXIES ");
		lblNewLabel_3.setBounds(302, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		FIXIES = new JTextField();
		FIXIES.setBounds(62, 187, 86, 20);
		frame.getContentPane().add(FIXIES);
		FIXIES.setColumns(10);
		
		PIXIES = new JTextField();
		PIXIES.setBounds(271, 187, 86, 20);
		frame.getContentPane().add(PIXIES);
		PIXIES.setColumns(10);
		
		 lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(147, 225, 201, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String userTry = textField.getText();//To read the information of the textField
			int userTryint =Integer.parseInt(userTry);//to convert the data to integers
			int a=userTryint/10;
			int b=userTryint/100;
			int c=userTryint/1000;
			int numb[]= {8,5,3,1}; //secret number
			int fixies=0;
			int pixies=0;	
			
			int guess[]= {userTryint/1000 ,(userTryint-c*1000)/100 ,(userTryint-b*100)/10 ,userTryint-a*10 };
			//we create the array with the numbers entered by the player

			

			for(int i=0;i<4;i++) {
				if(guess[i]==numb[i]) {
					fixies=fixies+1;
					
				}
				
			}
			for(int i=0;i<4;i++) {
				if(numb[0]==guess[i]&&numb[0]!=guess[0]) {
					pixies=pixies+1;
					
				}
				if(numb[1]==guess[i]&&numb[1]!=guess[1]) {
					pixies=pixies+1;
					
				}
				if(numb[2]==guess[i]&&numb[2]!=guess[2]) {
					pixies=pixies+1;
					
				}
				if(numb[3]==guess[i]&&numb[3]!=guess[3]) {
					pixies=pixies+1;
					
				}
				
			}

			FIXIES.setText("" + fixies);
			PIXIES.setText("" + pixies);
			
			if((fixies)==4) {
				log = new JFrame("Congratulations!");
				if(JOptionPane.showConfirmDialog(log, "Exit", "Congratulations",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
			if((pixies)==0) {
				log = new JFrame("Keep Trying");
				if(JOptionPane.showConfirmDialog(log, "Exit", "You Lost",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
				
			}
		});
		btnNewButton.setBounds(259, 122, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
