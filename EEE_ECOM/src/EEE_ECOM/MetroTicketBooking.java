package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MetroTicketBooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicketBooking window = new MetroTicketBooking();
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
	public MetroTicketBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 204));
		frame.setBounds(100, 100, 817, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Metro Train Ticket Booking");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(218, 32, 427, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(124, 113, 121, 35);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(267, 123, 121, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(125, 176, 61, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Myiapur", "Jntu", "Kphb", "Kukatpally", "Balnagar", "Moosapet", "Erragadda", "Sr nagar"}));
		c1.setBounds(267, 188, 121, 22);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(124, 252, 46, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Ameerpet", "MG bus stand", "Paradise", "Parade ground", "Uppal", "Stadium", "Lb nagar", "Raidurga", "Madhapur", "Hitex city"}));
		c2.setBounds(267, 254, 121, 22);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(124, 306, 75, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c3.setBounds(267, 304, 121, 22);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=tb1.getText();
				String fr=(String) c1.getSelectedItem(); 
				String to=(String) c2.getSelectedItem();
				String tickets=(String) c3.getSelectedItem();
				int t=Integer.parseInt(tickets);
				int bill=t*40;
				JOptionPane.showMessageDialog(btnNewButton,"Hello "+pn+"\n From :"+fr+"\n To :"+to+"\n Tickets :"+t+"\n Bill :"+bill );

		}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(239, 370, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\hhhh.png"));
		lblNewLabel_5.setBounds(402, 216, 364, 104);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
