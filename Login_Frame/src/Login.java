import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JFrame log;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				
				
			}
		});
		btnNewButton.setBounds(185, 186, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			log = new JFrame("exit");
			if(JOptionPane.showConfirmDialog(log, "Sure???", "Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
			}
		});
		btnNewButton_1.setBounds(297, 186, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String user = textField.getText();
				String password = textField_1.getText();
				
				if(password.equals("1234") && user.equals("Admin")) {
					
					textField.setText(null);
					textField_1.setText(null);
					
					frame.show(false);
					Profile.main(null);
					
				}else {
					JOptionPane.showMessageDialog(null, "INVALID","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					textField_1.setText(null);
				}
								
				
			}
		});
		btnNewButton_2.setBounds(73, 186, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(188, 65, 124, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 109, 124, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(116, 68, 62, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(116, 112, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
