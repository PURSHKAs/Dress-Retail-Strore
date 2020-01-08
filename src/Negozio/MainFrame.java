package Negozio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Controller TheController;
	
	public MainFrame(Controller c) {
		TheController = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/output-onlinepngtools.png")));		
		
		lblNewLabel.setBounds(151, 27, 148, 70);
		getContentPane().add(lblNewLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(103, 145, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(234, 145, 89, 23);
		contentPane.add(btnRegister);
	}
}
