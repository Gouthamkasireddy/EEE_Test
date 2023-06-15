package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_page {

	private JFrame frame;
	private JTextField txtKgoutham;
	private JTextField txtGouthamkasireddygmailcom;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_page window = new Registration_page();
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
	public Registration_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBackground(new Color(153, 153, 255));
		frame.setBounds(100, 100, 504, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setBounds(127, 24, 276, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(43, 159, 85, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKgoutham = new JTextField();
		txtKgoutham.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtKgoutham.setBounds(234, 167, 180, 20);
		frame.getContentPane().add(txtKgoutham);
		txtKgoutham.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(43, 216, 56, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ph No");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(43, 270, 56, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtGouthamkasireddygmailcom = new JTextField();
		txtGouthamkasireddygmailcom.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtGouthamkasireddygmailcom.setBounds(238, 219, 176, 20);
		frame.getContentPane().add(txtGouthamkasireddygmailcom);
		txtGouthamkasireddygmailcom.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(238, 273, 176, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Login_Page<Object> l=new Login_Page<Object>();
			    l.setVisible(true);
			    frame.setVisible(false);
			}});
				
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnNewButton.setBounds(183, 343, 117, 36);
		frame.getContentPane().add(btnNewButton);
	}
}
