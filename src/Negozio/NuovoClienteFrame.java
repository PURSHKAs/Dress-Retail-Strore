package Negozio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class NuovoClienteFrame extends JFrame {

	private JPanel contentPane;
	private Controller TheController;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public NuovoClienteFrame(Controller c) {
		TheController = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 549);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompilareIlSeguente = new JLabel("Compilare il seguente modulo ");
		lblCompilareIlSeguente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompilareIlSeguente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompilareIlSeguente.setBounds(98, 47, 240, 37);
		contentPane.add(lblCompilareIlSeguente);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(126, 121, 48, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(126, 146, 179, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIndirizzo.setBounds(126, 218, 48, 14);
		contentPane.add(lblIndirizzo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 242, 179, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(126, 307, 48, 14);
		contentPane.add(lblTelefono);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 332, 179, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAggiungiCliente = new JButton("Aggiungi Cliente");
		btnAggiungiCliente.setBounds(98, 410, 240, 37);
		contentPane.add(btnAggiungiCliente);
	}
}
