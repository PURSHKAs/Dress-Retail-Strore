package Negozio;

import java.util.ArrayList;



public class Transazione {
	private String idTrn;
	private ArrayList<Acquisto> Acquisti = new ArrayList<Acquisto>();
	private Utente utente;
	private String CodiceAutenticazione;
	private String IDUtente;
	
	public Transazione(String id, Utente utente, String CodiceAutenticazione, String IDUtente) {
		super();
		this.idTrn = id;
		this.utente = utente;
		this.CodiceAutenticazione = CodiceAutenticazione;
		this.IDUtente = IDUtente;
	}

	public Transazione(String trxID, Controller c) {
		// TODO Auto-generated constructor stub
	}

	public Transazione(String trxID, Controller c, String idCliente) {
		// TODO Auto-generated constructor stub
	}

	public Transazione(String trxID, Controller c, String idCliente, String cardNum, String approvalCode) {
		// TODO Auto-generated constructor stub
	}

	public Transazione(String trxID, Controller c, String cardNum, String approvalCode) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return idTrn;
	}
	public void setId(String id) {
		this.idTrn = id;
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
	
	public void addAcquisto(Acquisto acquisto) {
		Acquisti.add(acquisto);
	}
	public Integer getentrata() {
		Integer total = 0;
		for(Acquisto acquisto : Acquisti) {
			total+=acquisto.getTotal();
		}
		return total;
	}

}
