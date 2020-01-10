package Negozio;

import java.util.Random;

public class Cliente extends Utente {
	
	private String IdCliente = "UTENTE";
	
	Random rand = new Random();
	
	public Cliente(String Nome, String Cognome, String Indirizzo, String telefono, int età, String Username, String Password) {
		super(Nome, Cognome, Indirizzo, telefono, età, Username, Password);
		for(int i = 1; i<=12; i++) {
			IdCliente+=rand.nextInt(9);
		}
		this.IdCliente = IdCliente;
	}
	
	
	public String getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	
}
