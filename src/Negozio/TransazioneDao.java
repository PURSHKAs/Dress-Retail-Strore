package Negozio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TransazioneDao {
	
	private static Connection con;
	
	public TransazioneDao(Connection c) {
		con = c;
	}
	
	public static void UpdateTrnDB( boolean Cliente, boolean isMember) { // boolena is member non dovrebbe starci 
		try {
		    
		    Statement st = con.createStatement();
		    
		    for(Transazione Transazione : ArrayDati.Transazioni) {
		    	String idAcquisto = "";
		    	String qtyAcquisto = "";
		    	String costoAcquisto = "";
		    	for(Acquisto acquisto : Transazione.getAcquisto()) {
		    		idAcquisto = idAcquisto + acquisto.getArticolo().getCodice()+"#";
		    		qtyAcquisto = qtyAcquisto + acquisto.getQty()+"#";
		    		costoAcquisto = costoAcquisto + acquisto.getArticolo().getPrezzo()+"#";
		    	}
		    	if(Cliente) {
		    		st.executeUpdate("INSERT INTO Transazione (idTrn, idArticolo, QtyArt, PrezzoArticolo, Cliente, CodAutenticaz) VALUES "
			    			+ "('"+Transazione.getIDUtente()+"','"+idAcquisto+"','"+qtyAcquisto+"','"+costoAcquisto+"','"+"','"+Transazione.getIDUtente()+"','"+Transazione.getCodiceAutenticazione()+"')");
		    	}
		    	else{
		    		st.executeUpdate("INSERT INTO Transazione (trnID, articoloID, itemQTY, itemPRICE, sales) VALUES "
			    			+ "('"+Transazione.getIDUtente()+"','"+idAcquisto+"','"+qtyAcquisto+"','"+costoAcquisto+"','"+Transazione.getCassiere().getUsername()+"')");
		    	}
		    }
		    
		    
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}

}
