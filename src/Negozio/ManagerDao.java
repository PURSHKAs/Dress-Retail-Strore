package Negozio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;


public class ManagerDao {
	private static Connection con;
	
	public ManagerDao(Connection c) {
		con = c;
	}
	
	public static boolean isMNG(String idManager, String password){
		try {
			//String encrypted = md5(password);
		    		    
		    //query
		    String query = "SELECT * FROM utente WHERE id = '"+idManager+"' AND Password = '"+password+"'AND Stato = 2";
		    
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    while (rs.next()) {
		    	return true;
		    }
		    return false;
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return false;
	}
	

}
