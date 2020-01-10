package Negozio;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UtenteDao {
	
	private static Connection con;
	private Utente u;
	
	public UtenteDao(Connection c) {
		con = c;
	}
	
	public static Utente login(String username, String password) {
		
		ResultSet rs;
	    //query
	    String query = "SELECT * FROM Utente where ? = '"+username+"' and ? = '"+password+"'";
		try {
		    
		    PreparedStatement pst = con.prepareStatement(query);
		    pst.setString(1, username);
		    pst.setString(2, password);
		    rs = pst.executeQuery();
		    while (rs.next()) {
		    	String fname = rs.getString("Nome");
		    	String lname = rs.getString("Cognome");
		    	String user_name = rs.getString("Username");
		    	String pass_word = rs.getString("Password");
		    	String address = rs.getString("Indirizzo");
		    	String phone = rs.getString("telefono");
		    	Integer age = rs.getInt("Età");
		    	Integer stato =rs.getInt("Stato");
		    	if(stato == 1) return new Utente(fname, lname, address, phone, age, stato, user_name, pass_word);
		    	else if (stato==2) return new Manager (fname, lname, address, phone, age, stato, user_name, pass_word);
		    }
		    return null;
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return null;
	}
}
