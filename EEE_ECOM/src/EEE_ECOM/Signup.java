package EEE_ECOM;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup {

	protected static final String JOptionpane = null;
	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 769, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(28, 92, 84, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(28, 150, 108, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(28, 216, 84, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Programming");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(28, 274, 124, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb = new JTextField();
		tb.setBounds(277, 100, 115, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setBackground(new Color(240, 240, 240));
		r1.setFont(new Font("Tahoma", Font.BOLD, 14));
		r1.setBounds(277, 139, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 14));
		r2.setBounds(413, 139, 109, 23);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "EEE", "ECE", "MECH", "CIVIL", "CSE", "IT"}));
		c1.setBounds(277, 207, 115, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb1.setBackground(new Color(240, 240, 240));
		cb1.setBounds(277, 262, 97, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Python");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb2.setBounds(382, 264, 97, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("C++");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb3.setBounds(493, 264, 97, 23);
		frame.getContentPane().add(cb3);
		
		JLabel lblNewLabel_4 = new JLabel("Sign up");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(293, 24, 131, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String n=tb.getText();
			String g;
			
			if(r1.isSelected())
			{
				g="Female";
			}
			else if(r2.isSelected())
			{
				g="Male";
			}
			else
			
			{
				g="Invalid";
			}
			String b=(String) c1.getSelectedItem();
			String p;
			if(cb1.isSelected())
			{
				p="Java";
			}
			else if(cb2.isSelected())
			{
				p="python";
			}
			else
			{
			p="c++";
				
			}
			JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+" \n gender :"+g+" \n Branch"+b+" \n programming"+p);
				
			}	
				
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(240, 340, 146, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
