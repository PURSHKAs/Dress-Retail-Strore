package Negozio;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UtenteDao {
	
	private static Connection con;
	
	public UtenteDao(Connection c) {
		con = c;
	}
	
	public static Utente login(String username, String password) {
		
		ResultSet rs;
	    //query
	    String query = "SELECT * FROM Utente WHERE Username = ? AND Password = ?";
		try {
		    
		    PreparedStatement pst = con.prepareStatement(query);
		    pst.setString(1, username);
		    pst.setString(2, password);
		    rs = pst.executeQuery();
		    while (rs.next()) {
		    	String nome = rs.getString("Nome");
		    	String cognome = rs.getString("Cognome");
		    	String user_name = rs.getString("Username");
		    	String pass_word = rs.getString("Password");
		    	String indirizzo = rs.getString("Indirizzo");
		    	String telefono = rs.getString("telefono");
		    	Integer eta = rs.getInt("Eta");
		    	Integer stato =rs.getInt("Stato");
		    	if(stato == 1) return new Utente(nome, cognome, indirizzo, telefono, eta, stato, user_name, pass_word);
		    	else if (stato==2) return new Manager (nome, cognome, indirizzo, telefono, eta, stato, user_name, pass_word);
		    }
		    return null;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return null;
	}
	
	
}
