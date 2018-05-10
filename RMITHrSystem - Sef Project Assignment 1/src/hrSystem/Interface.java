package hrSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.Cursor;
import javax.swing.UIManager;

public class Interface {

	private JFrame frame;
	private JTextField txtRMITNumber;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(200, 200, 542, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RMIT Log-in");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel.setBounds(297, 37, 147, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRMITNumber = new JLabel("RMIT Number:");
		lblRMITNumber.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRMITNumber.setForeground(Color.WHITE);
		lblRMITNumber.setBounds(64, 152, 124, 14);
		frame.getContentPane().add(lblRMITNumber);
		
		JLabel lblRMITPassword = new JLabel("Password:");
		lblRMITPassword.setForeground(Color.WHITE);
		lblRMITPassword.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRMITPassword.setBounds(101, 250, 87, 26);
		frame.getContentPane().add(lblRMITPassword);
		
		txtRMITNumber = new JTextField();
		txtRMITNumber.setFont(new Font("Calibri", Font.BOLD, 12));
		txtRMITNumber.setForeground(Color.WHITE);
		txtRMITNumber.setBackground(Color.DARK_GRAY);
		txtRMITNumber.setBounds(211, 148, 147, 26);
		frame.getContentPane().add(txtRMITNumber);
		txtRMITNumber.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Calibri", Font.BOLD, 12));
		passwordField.setBackground(Color.DARK_GRAY);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBounds(211, 252, 147, 26);
		frame.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(211, 178, 147, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(211, 283, 147, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\maz\\Pictures\\images for project SEF\\logo-white.png"));
		lblNewLabel_1.setBounds(10, 11, 279, 94);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 116, 496, 8);
		frame.getContentPane().add(separator_2);
		
		Button buttonLogIn = new Button("Log-in");
		buttonLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = passwordField.getText();
				String username = txtRMITNumber.getText();
				
				if (password.contains("RMIT") && username.contains("RMIT"))
				{
					txtRMITNumber.setText(null);
					passwordField.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid RMIT Login Details","RMIT Login Error", JOptionPane.ERROR_MESSAGE);
					txtRMITNumber.setText(null);
					passwordField.setText(null);
				}
			}
		});
		buttonLogIn.setFont(new Font("Calibri", Font.PLAIN, 18));
		buttonLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLogIn.setForeground(Color.WHITE);
		buttonLogIn.setBackground(Color.LIGHT_GRAY);
		buttonLogIn.setBounds(30, 393, 124, 45);
		frame.getContentPane().add(buttonLogIn);
		
		Button buttonReset = new Button("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRMITNumber.setText(null);
				passwordField.setText(null);
			}
		});
		buttonReset.setFont(new Font("Calibri", Font.PLAIN, 18));
		buttonReset.setForeground(Color.WHITE);
		buttonReset.setBackground(Color.LIGHT_GRAY);
		buttonReset.setBounds(211, 393, 124, 45);
		frame.getContentPane().add(buttonReset);
		
		Button buttonExit = new Button("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Your RMIT Log-in", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		buttonExit.setFont(new Font("Calibri", Font.PLAIN, 18));
		buttonExit.setForeground(Color.WHITE);
		buttonExit.setBackground(Color.LIGHT_GRAY);
		buttonExit.setBounds(392, 393, 124, 45);
		frame.getContentPane().add(buttonExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 355, 496, 14);
		frame.getContentPane().add(separator_3);
	}
}
