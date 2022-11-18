import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class G11 {

	private JFrame frame;
	public int score=0;
	private JLabel LabScore;
	private JLabel lblNewLabel_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JFrame log;
	int Q=1; //variable to know the number of the question

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					G11 window = new G11();
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
	public G11() {
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
		
		JLabel lblNewLabel = new JLabel("Quiz Game!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(77, 24, 152, 34);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("what is the height of mt Everest?");
		lblNewLabel_1.setBounds(77, 69, 247, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SCORE");
		lblNewLabel_2.setBounds(286, 185, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		rdbtnNewRadioButton=new JRadioButton("8849");
		rdbtnNewRadioButton.setActionCommand("right");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(77, 115, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("9848");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(77, 140, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("10848");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(77, 166, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("11848");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(77, 192, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		LabScore = new JLabel("New label");
		LabScore.setBounds(223, 210, 165, 24);
		frame.getContentPane().add(LabScore);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//-----------------------------------------------Question 1
				
				if((buttonGroup.getSelection().getActionCommand().equals("right"))&&Q==1) {
					
					score=score+100;
					Q=2;//go to question 2
					
					rdbtnNewRadioButton.setActionCommand("false");//this button will no longer contain the correct answer
										
				}
				
				//-----------------------------------------------Question 2
				if(Q==2) {
					LabScore.setText("Score is: "+ String.valueOf(score) );
					lblNewLabel_1.setText("what is the capital of egypt");//2 question
					//---------------------------------------------------------- Options
					rdbtnNewRadioButton.setText("Aswan");
					rdbtnNewRadioButton_1.setText("Alexandria");
					rdbtnNewRadioButton_2.setText("Luxor");
					rdbtnNewRadioButton_3.setText("Cairo");
					
					rdbtnNewRadioButton_3.setActionCommand("right");//the fourth option is correct
					
			
				
				if((buttonGroup.getSelection().getActionCommand().equals("right"))) {// If you select the correct option, it shows you the following question

					
					score=score+100;
					rdbtnNewRadioButton_3.setActionCommand("false");
					LabScore.setText("Score is: "+ String.valueOf(score) );
					Q=3;//go to question 3
					
				}
				}
				//-----------------------------------------------Question 3
				if(Q==3) {
					lblNewLabel_1.setText("in what year did the second world war end?\r\n");
					//---------------------------------------------------------- Options
					rdbtnNewRadioButton.setText("1990");
					rdbtnNewRadioButton_1.setText("1860");
					rdbtnNewRadioButton_2.setText("1945");
					rdbtnNewRadioButton_3.setText("1845");
					
					rdbtnNewRadioButton_2.setActionCommand("right");//the 3th option is correct
							
				
					if((buttonGroup.getSelection().getActionCommand().equals("right"))) {// If you select the correct option, it shows you the following question

						
						score=score+100;
						LabScore.setText("Score is: "+ String.valueOf(score) );
						rdbtnNewRadioButton_2.setActionCommand("false");
						
						Q=4;//go to question 4
						
					
						
					}
							
				}
				//-----------------------------------------------Question 4
				if(Q==4) {
					
					
					log = new JFrame("Congratulations!");
					if(JOptionPane.showConfirmDialog(log, "Congratulations!\n"+"Score: "+score+"\nExit?", "Congratulations!",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
					
					
				}
				
			}
		});
		btnNewButton.setBounds(53, 222, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
