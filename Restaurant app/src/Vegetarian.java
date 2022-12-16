import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Vegetarian {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vegetarian window = new Vegetarian();
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
	public Vegetarian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to vegetarian menus");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(136, 11, 198, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Choose your preference:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(146, 63, 198, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Rattatouille");
		rdbtnNewRadioButton.setActionCommand("Rattatouille");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(102, 103, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Lettuce gourmet");
		rdbtnNewRadioButton_1.setActionCommand("Lettuce gourmet");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(235, 103, 134, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Quantity");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(46, 147, 81, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(153, 148, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Not Ordered");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(112, 177, 81, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Status:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(56, 181, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Final Price:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(46, 206, 91, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("0000");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(122, 210, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Prepare my order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
if(buttonGroup.getSelection().getActionCommand().equals("Rattatouille")) {
	 int a=0;
	int total;
	a= Integer.parseInt(textField.getText());
					
	total=a*20000;
	
	lblNewLabel_3.setText("Ordered");				
	lblNewLabel_6.setText("$"+total);
							
				}
if(buttonGroup.getSelection().getActionCommand().equals("Lettuce gourmet")) {
	 int a=0;
	int total;
	a= Integer.parseInt(textField.getText());
					
	total=a*15000;
	
	lblNewLabel_3.setText("Ordered");				
	lblNewLabel_6.setText("$"+total);
							
				}
				
			}
		});
		btnNewButton.setBounds(235, 188, 161, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
