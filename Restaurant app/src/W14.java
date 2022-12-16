import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class W14 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					W14 window = new W14();
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
	public W14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to my Restaurant!");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(120, 25, 246, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Which menu do you prefer?");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(145, 64, 178, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Click me Veggie!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					
					
					frame.show(false);
					Vegetarian.main(null);
					
				
				
				
				
			}
		});
		btnNewButton.setBounds(10, 133, 150, 77);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Click me, \r\nnobody is watching");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.show(false);
				nonveg.main(null);
				
			}
		});
		btnNewButton_1.setBounds(203, 133, 221, 77);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vegetarian");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(65, 236, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No Vegetarian");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(247, 236, 119, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
