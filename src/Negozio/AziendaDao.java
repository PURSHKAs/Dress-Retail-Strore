package Negozio;

import java.sql.*;


public class AziendaDao {
	
	private static Connection con;
	
	public AziendaDao(String name, String address, String logo, String phone) {
		// TODO Auto-generated constructor stub
	}
	
	public AziendaDao(Connection c) {
		con = c;
	}

	public static AziendaDao LetturaDato(){
		try {

			ResultSet rs;
		    
		    //query
		    String query = "SELECT * FROM Azienda";
		    
		    PreparedStatement pst = con.prepareStatement(query);
		    rs = pst.executeQuery();
		    while (rs.next()) {
		    	String nome = rs.getString("name");
		    	String indirizzo = rs.getString("address");
		    	String logo = rs.getString("logo");
		    	String telefono = rs.getString("phone");
		    	return new AziendaDao(nome, indirizzo, logo, telefono);
		    }
		    return null;
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return null;
	}

}
