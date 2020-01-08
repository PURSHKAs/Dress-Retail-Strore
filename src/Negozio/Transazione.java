package Negozio;

import java.util.ArrayList;

public class Transazione {
	private String id;
	private ArrayList<Acquisto> Acquisti = new ArrayList<Acquisto>();
	private Utente utente;
	private String NumCarta;
	private String CodiceAutenticazione;
	private String IDUtente;
	
	public Transazione(String id, Utente utente, String NumCarta, String CodiceAutenticazione, String IDUtente) {
		super();
		this.id = id;
		this.utente = utente;
		this.NumCarta = NumCarta;
		this.CodiceAutenticazione = CodiceAutenticazione;
		this.IDUtente = IDUtente;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Acquisto> getAcquisto() {
		return Acquisti;
	}
	public void setPurchases(ArrayList<Acquisto> Acquisti) {
		this.Acquisti = Acquisti;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public String getNumCarta() {
		return NumCarta;
	}
	public void setNumCarta(String numCarta) {
		NumCarta = numCarta;
	}
	public String getCodiceAutenticazione() {
		return CodiceAutenticazione;
	}
	public void setCodiceAutenticazione(String codiceAutenticazione) {
		CodiceAutenticazione = codiceAutenticazione;
	}
	public String getIDUtente() {
		return IDUtente;
	}
	public void setIDUtente(String iDUtente) {
		IDUtente = iDUtente;
	}

}
