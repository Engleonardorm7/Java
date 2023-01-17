import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class w15 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JLabel letter_1;
	private JLabel letter_2;
	private JLabel letter_3;
	private JLabel letter_4;
	int lives=6;
	int counter=0;
	private JFrame log;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w15 window = new w15();
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
	public w15() {
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
		
		JLabel lblNewLabel = new JLabel("Hangman Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(154, 30, 121, 36);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Word to guess");
		lblNewLabel_2.setBounds(154, 140, 94, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Letter");
		lblNewLabel_3.setBounds(36, 188, 75, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(103, 186, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Lives left:");
		lblNewLabel_4.setBounds(36, 216, 86, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("6");
		lblNewLabel_5.setBounds(99, 220, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		letter_1 = new JLabel("_");
		letter_1.setBounds(120, 102, 46, 14);
		frame.getContentPane().add(letter_1);
		
		 letter_2 = new JLabel("_");
		letter_2.setBounds(165, 103, 46, 14);
		frame.getContentPane().add(letter_2);
		
		 letter_3 = new JLabel("_");
		letter_3.setBounds(210, 103, 46, 14);
		frame.getContentPane().add(letter_3);
		
		 letter_4 = new JLabel("_");
		letter_4.setBounds(262, 102, 46, 14);
		frame.getContentPane().add(letter_4);
		
		JButton btnNewButton = new JButton("Submit letter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							
				String guess[]= {"t","r","e","e"}; 
				
				String userTry = textField.getText(); 
				
				
				if(userTry.equals(guess[0])||userTry.equals(guess[1])||userTry.equals(guess[2])||userTry.equals(guess[3])){
					lblNewLabel_2.setText("Correct");
									
						if(userTry.equals(guess[0])){
						letter_1.setText(guess[0]);
						counter=counter+1;
					}
						if(userTry.equals(guess[1])){
							letter_2.setText(guess[1]);
							counter=counter+1;							
						}
						if(userTry.equals(guess[2])){
							letter_3.setText(guess[2]);
							counter=counter+1;							
						}
						if(userTry.equals(guess[3])){
							letter_4.setText(guess[3]);
							counter=counter+1;						
						}
				
					
				}else {
					lblNewLabel_2.setText("Incorrect");
					lives=lives-1;
										
					lblNewLabel_5.setText(""+lives);
				}
				if((counter)==4) {
					log = new JFrame("Congratulations!");
					if(JOptionPane.showConfirmDialog(log, "Exit", "Congratulations",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				
				}
				if((lives)==0) {
					log = new JFrame("Congratulations!");
					if(JOptionPane.showConfirmDialog(log, "Exit", "You Lost",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				
				}
				//if(userTry.equals(guess[0])||userTry.equals(guess[1])||userTry.equals(guess[2])||userTry.equals(guess[3])){
					//lblNewLabel_2.setText("Correct");	
					//if(userTry.equals(guess[0])) {
					//	letter_1.setText(guess[0]);
					//}
					
				//}
				
				
				
				//for ( int x = 0 ; x < guess.length ; x++ ) { // The cycle begins from the first position in the hidden word array (0) and ends in the last position (guess.length - 1), jumping one by one
				//if ( userTry.equals ( guess [ x ] ) ){				//Process done if the letter entered by the user is found in any of the letters of the hidden word.
				//	lblNewLabel_2.setText("Correct");	
				
				//}else {
					//lblNewLabel_2.setText("Incorrect");	
					//lives=lives-1;
					//lblNewLabel_5.setText(""+lives);	
				//}
				//}
				
				
				
			}
		});
	
		btnNewButton.setBounds(247, 216, 132, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
