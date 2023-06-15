package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecomers {

	private JFrame frame;
	int i=0;
	int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecomers window = new ecomers();
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
	public ecomers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 759, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(279, 29, 143, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\on line\\Pictures\\w2.png"));
		lblNewLabel_1.setBounds(57, 109, 115, 157);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\on line\\Pictures\\w3.png"));
		lblNewLabel_2.setBounds(307, 109, 115, 157);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\on line\\Pictures\\W4.png"));
		lblNewLabel_3.setBounds(577, 109, 121, 157);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS:1200");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(new Color(204, 0, 0));
		lblNewLabel_4.setBounds(93, 288, 74, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS:1600");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setForeground(new Color(204, 0, 0));
		lblNewLabel_5.setBounds(348, 288, 74, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS:1800");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(204, 0, 0));
		lblNewLabel_6.setBounds(631, 288, 69, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "noise", "black color"}));
		comboBox.setBounds(103, 313, 64, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "noise", "gold colour"}));
		comboBox_1.setBounds(347, 313, 64, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb.setBounds(597, 11, 85, 22);
		frame.getContentPane().add(lb);
		JLabel lb2 = new JLabel("Bill : 0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb2.setBounds(597, 42, 102, 20);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+1200;
				lb2.setText("Bill : "+b);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton.setBounds(83, 346, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+1600;
				lb2.setText("Bill : "+b);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1.setBounds(333, 346, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+1800;
				lb2.setText("Bill : "+b);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_2.setBounds(609, 346, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "noise ", "rose pink colour"}));
		comboBox_2.setBounds(618, 313, 64, 22);
		frame.getContentPane().add(comboBox_2);
		
		
	}
}
