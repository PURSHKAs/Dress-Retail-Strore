package Negozio;

import java.sql.*;



public class ArticoloDao {
	
	private static Connection con;
	
	public ArticoloDao(Connection c) {
		con = c;
	}
	
	public static void addArticolo() {
		try {
		    
		    //query
		    String query = "SELECT * FROM articolo ";
		    
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    while(rs.next()) {
		    	String codice = rs.getString("Codice");
		    	String nome = rs.getString("Capo");
		    	Integer prezzo = rs.getInt("Prezzo");
		    	Integer scorta = rs.getInt("Scorta");
		    	ArrayDati.Articoli.add(new Articolo(codice, nome, prezzo, scorta));
//		    	System.out.println(name);
		    }
		    
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}
	
	public static void UpdateArticoloDB() {
		try {
		    
		    Statement st = con.createStatement();
		    
		    for(Articolo articolo : ArrayDati.Articoli) {
		    	st.executeUpdate("UPDATE articolo set Scorta = '"+articolo.getScorta()+"', Capo = '"+articolo.getCapo()+"', Prezzo = '"+articolo.getPrezzo()+"' WHERE Codice = '"+articolo.getCodice()+"'");
		    }
		    
		    
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}
	
	public static void InsertArticoloDB(String codice, String nome, Integer prezzo, Integer scorta) {
		try {
		       
		    
		    Statement st = con.createStatement();
		    
		    st.executeUpdate("INSERT INTO articolo (Codice,Capo,Prezzo,Scorta) VALUES ('"+codice+"','"+nome+"','"+prezzo+"','"+scorta+"')");
		    
		    
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}
	
	public static String getCapoFromDB(String codice) {
		try {
		    
			Statement st = con.createStatement();
		    //query
		    String query = "SELECT nome FROM articolo WHERE Codice = '"+codice+"'";
		    
		    ResultSet rs = st.executeQuery(query);
		    while (rs.next()) {
		    	return rs.getString("Nome");
		    }
		    return null;
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return null;
	}
	
	

}
