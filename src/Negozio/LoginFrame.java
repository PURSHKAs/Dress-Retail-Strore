package Negozio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private Controller TheController;
	private JTextField textField;
	private JPasswordField passwordField;
	
	
	
	public LoginFrame(Controller c) {
		TheController = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 331);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/small.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(142, 11, 158, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(67, 107, 79, 30);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(156, 112, 125, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(67, 155, 79, 20);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 155, 125, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(118, 201, 204, 23);
		contentPane.add(btnLogin);
		
		AbstractAction actionLogin = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	String password = passwordField.getText();
				String username = textField.getText();
				UtenteFrame uf = new UtenteFrame(c);
				try {
				Utente loggedIn = UtenteDao.login(username, password);
				if(loggedIn instanceof Utente ) {
					uf.setVisible(true);
					setVisible(false);
				}
				else {
				JOptionPane.showMessageDialog(null, "invalid login", "Error Logging In!", JOptionPane.ERROR_MESSAGE);
				passwordField.setText(null);
				textField.setText(null);
				textField.requestFocus();
				}
			}
			catch(Exception args) {
				JOptionPane.showMessageDialog(null, "Contact IT Support (for geeks only :))", "Error !!!", JOptionPane.ERROR_MESSAGE);
				passwordField.setText(null);
				textField.setText(null);
			}
		    }	
		};
		
		btnLogin.addActionListener(actionLogin);
		//btnLogin.setBounds(47, 167, 357, 39);
		getContentPane().add(btnLogin);
		
		textField.addActionListener(actionLogin);
	}
}

