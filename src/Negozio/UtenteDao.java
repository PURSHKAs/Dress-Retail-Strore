package Negozio;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UtenteDao {
	
	private static Connection con;
	private Utente s;
	
	public UtenteDao(Connection c) {
		con = c;
	}
	
	public static Utente login(String username, String password) {
		
		ResultSet rs;
	    //query
	    String query = "SELECT * FROM users where username = '"+username+"' and password = '"+password+"'";
		try {
		    
		    PreparedStatement pst = con.prepareStatement(query);
		    pst.setString(1, username);
		    pst.setString(2, password);
		    rs = pst.executeQuery();
		    while (rs.next()) {
		    	String fname = rs.getString("fname");
		    	String lname = rs.getString("lname");
		    	String user_name = rs.getString("username");
		    	String pass_word = rs.getString("password");
		    	String address = rs.getString("address");
		    	String phone = rs.getString("phone");
		    	Integer age = rs.getInt("age");
		    	Integer status = rs.getInt("status");
		    	return new Utente(fname, lname, address, phone, age, status, user_name, pass_word);
		    }
		    return null;
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return null;
	}
}
