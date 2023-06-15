package EEE_ECOM;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FriendshipCalculator {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FriendshipCalculator window = new FriendshipCalculator();
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
	public FriendshipCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(191, 205, 219));
		frame.setBounds(100, 100, 644, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Friendship%");
		lb1.setForeground(new Color(0, 0, 0));
		lb1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lb1.setBounds(257, 28, 254, 51);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Name");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb2.setBounds(30, 123, 129, 34);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Friends's Name");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb3.setBounds(30, 213, 145, 34);
		frame.getContentPane().add(lb3);
		
		tb1 = new JTextField();
		tb1.setBounds(276, 133, 167, 24);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(276, 223, 167, 24);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lb.setBounds(193, 286, 129, 51);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r=new Random();
				int n=r.nextInt(1,100);
				lb.setText(n+"%");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(235, 368, 120, 34);
		frame.getContentPane().add(btnNewButton);
	}
}
