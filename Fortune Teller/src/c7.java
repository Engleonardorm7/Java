import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class c7 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					c7 window = new c7();
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
	public c7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fortune Teller");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel.setBounds(160, 44, 173, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String a = textField.getText();
				int random=1+(int)( Math.random()*3);	

				if(a.equals("")==false) {
					
					if(random==1) {
						lblNewLabel_1.setText("Yes");
					}else if(random==2) {
						lblNewLabel_1.setText("Not");
					}else {
						lblNewLabel_1.setText("Maybe");
					}
					
				}else {
					lblNewLabel_1.setText("Ask a question");
				}
						
						
				
				
				
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(180, 100, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(180, 135, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(195, 170, 138, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
