package Negozio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ClienteDao {
	
	private static Connection con;
	
	public ClienteDao(Connection c) {
		con = c;
	}
	
	public static boolean isCliente(String idCliente){
		try {
		    
			Statement st = con.createStatement();
		    //query
		    String query = "SELECT * FROM Cliente WHERE idCliente = '"+idCliente+"'";
		    
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
	
	public static Cliente datiCliente(String IdCliente){
		try {
		    
		    //query
		    String query = "SELECT * FROM Cliente WHERE idCliente = '"+IdCliente+"'";
		    
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    
		    while (rs.next()) {
		    	String nome = rs.getString("Nome");
		    	String idC = rs.getString("idCliente");
		    	String indirizzo = rs.getString("Indirizzo");;
		    	String telefono = rs.getString("Telefono");
		    	return new Cliente(nome, idC, indirizzo, telefono);
		    }
		    return null;
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
		return null;
	}
	
	public static void NuovoCliente(Cliente cliente) {
		try {
		   
		    Statement st = con.createStatement();
		    
		    st.executeUpdate("INSERT INTO Cliente (idCliente,Nome,Indirizzo,Telefono) VALUES ('"+cliente.getIdCliente()+"','"+cliente.getNome()+"','"+cliente.getIndirizzo()+"','"+cliente.getTelefono()+"','"+"')");
		    
		    
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}
	
	public static void UpdateCliente() {
		try {
		     
		    Statement st = con.createStatement();
		    
		    for(Cliente cliente : ArrayDati.Clienti) {
		    	st.executeUpdate("UPDATE Cliente set idCliente = '"+cliente.getIdCliente()+"', Nome = '"+cliente.getNome()+"', Indirizzo = '"+cliente.getIndirizzo()+"', Telefono = '"+cliente.getTelefono()+"'"+"'WHERE idCliente = '"+cliente.getIdCliente()+"'");
		    }
		    		    
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}
	
	public static void addCliente() {
		try {
		   
		    //query
		    String query = "SELECT * FROM Cliente";
		    
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    
		    while (rs.next()) {
		    	String nome = rs.getString("Nome");
		    	String idC = rs.getString("idCliente");
		    	String indirizzo = rs.getString("Indirizzo");;
		    	String telefono = rs.getString("Telefono");
		    	ArrayDati.Clienti.add(new Cliente(nome, idC, indirizzo, telefono));
		    }
		} catch (Exception e) {
			System.err.println("Got an exception! ");
		    System.err.println(e.getMessage());
		}
	}
	
}
