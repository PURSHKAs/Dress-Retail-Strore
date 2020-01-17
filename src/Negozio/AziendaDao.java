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
		    	String nome = rs.getString("Nome");
		    	String indirizzo = rs.getString("Indirizzo");
		    	String logo = rs.getString("Logo");
		    	String telefono = rs.getString("Telefono");
		    	return new AziendaDao(nome, indirizzo, logo, telefono);
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
