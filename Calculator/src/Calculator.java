import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculator {

	private JFrame frame;
	private float number = 0;
	private float number2 = 0;
	private int operation = 0;
	private String option = "";
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
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
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				option = option + 2;
				lblNewLabel.setText(option);
			
			}
			
		});
		btnNewButton.setBounds(99, 105, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 1;
				lblNewLabel.setText(option);
				
			}

			
		});
		btnNewButton_1.setBounds(10, 105, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 3;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_2.setBounds(192, 105, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 4;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_3.setBounds(10, 139, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 5;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_4.setBounds(99, 139, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 6;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_5.setBounds(192, 139, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 7;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_6.setBounds(10, 173, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				option = option + 8;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_7.setBounds(99, 173, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				option = option + 9;
				lblNewLabel.setText(option);
				
			}
		});
		btnNewButton_8.setBounds(192, 173, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				option = option + 0;
				lblNewLabel.setText(option);
			
			}
		});
		btnNewButton_9.setBounds(99, 207, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		lblNewLabel = new JLabel("Label1");
		lblNewLabel.setBounds(10, 52, 258, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operators:");
		lblNewLabel_1.setBounds(331, 66, 93, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("+");
				option="";
				operation = 1;
						
				
				
			}
		});
		btnNewButton_10.setBounds(316, 105, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("-");
				option="";
				operation = 2;
							
				
				
				
			}
		});
		btnNewButton_11.setBounds(316, 139, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("*");
				option="";
				operation = 3;
						
			
			
			}
		});
		btnNewButton_12.setBounds(316, 173, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("/");
				option="";
				operation = 4;
						
				
				
			}
		});
		btnNewButton_13.setBounds(316, 207, 89, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number2=Integer.parseInt(lblNewLabel.getText());
				
				switch(operation) {
				
				case 1:
					lblNewLabel.setText(String.valueOf(number+number2));
					break;
					
				case 2:
					lblNewLabel.setText(String.valueOf(number-number2));
					break;
				
				case 3:
					lblNewLabel.setText(String.valueOf(number*number2));
					break;
					
				case 4:
					lblNewLabel.setText(String.valueOf(number/number2));
					break;
					
				default:
					break;
				}
				option = "";
				number=0;
				number =0;
			}
		});
		btnNewButton_14.setBounds(202, 207, 104, 43);
		frame.getContentPane().add(btnNewButton_14);
	}
}
