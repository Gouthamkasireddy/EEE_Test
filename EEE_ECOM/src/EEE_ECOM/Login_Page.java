package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login_Page<string> {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField ps1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setBounds(100, 100, 495, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login_Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(147, 33, 178, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(45, 114, 107, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(45, 172, 107, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(239, 123, 122, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String un=tb1.getText();
				String ps=ps1.getText();
				if (un.equals("Mrec") && ps.equals("1234"))
				{
				JOptionPane.showMessageDialog(btnNewButton,"Login Done");
			}else
			{
				
			}
		}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(163, 258, 95, 30);
		frame.getContentPane().add(btnNewButton);
		
		ps1 = new JPasswordField();
		ps1.setBounds(239, 172, 122, 20);
		frame.getContentPane().add(ps1);
	}


	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}}
