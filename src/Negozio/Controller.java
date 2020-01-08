package Negozio;

import java.sql.*;

public class Controller {
	
	public static void main (String[] args) {
		Controller c = new Controller();
	}
	
	MainFrame mainFrame;
	UtenteDao UDAO;
	
	public Controller () {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lulilac?useSSL=false","root","");
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		UDAO = new UtenteDao(con);
		mainFrame = new MainFrame(this);
		mainFrame.setVisible(true);
	}
}
