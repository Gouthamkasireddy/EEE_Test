package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ecom {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(283, 11, 183, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\on line\\Pictures\\w2.png"));
		lblNewLabel_1.setBounds(26, 87, 144, 175);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\on line\\Pictures\\W4.png"));
		lblNewLabel_2.setBounds(260, 87, 144, 175);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\on line\\Pictures\\w3.png"));
		lblNewLabel_3.setBounds(518, 87, 137, 175);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS:2500");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(75, 283, 67, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS:2400");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(321, 288, 67, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS:2800");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(575, 283, 80, 21);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("ADD TO CART  + ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton.setBounds(62, 368, 102, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART +");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1.setBounds(321, 368, 102, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD TO CART +");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_2.setBounds(551, 368, 104, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "smart watch", "mate black colour"}));
		comboBox.setBounds(62, 309, 90, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "noise watch", "baby pink colour"}));
		comboBox_1.setBounds(321, 315, 83, 16);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "apple watch", "gold colour"}));
		comboBox_2.setBounds(585, 315, 70, 16);
		frame.getContentPane().add(comboBox_2);
	}
}
