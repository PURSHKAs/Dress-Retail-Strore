package Negozio;

import java.util.ArrayList;

public class StoricoTransazioni {
	private String ID;
	private String Utente;
	private ArrayList<String> Articoli = new ArrayList<String>();
	private ArrayList<Integer> Prezzi = new ArrayList<Integer>();
	private ArrayList<Integer> Quantit� = new ArrayList<Integer>();
	
	public StoricoTransazioni(String id, String Utente) {
		super();
		ID = id;
		this.Utente = Utente;
	}

	public String getId() {
		return ID;
	}
	public void setId(String id) {
		this.ID = id;
	}
	public String getUtente() {
		return Utente;
	}
	public void setUtente(String utente) {
		Utente = utente;
	}
	public ArrayList<String> getArticoli() {
		return Articoli;
	}
	public void setArticoli(ArrayList<String> articoli) {
		this.Articoli = articoli;
	}
	public ArrayList<Integer> getPrezzi() {
		return Prezzi;
	}
	public void setPrezzi(ArrayList<Integer> prezzi) {
		this.Prezzi = prezzi;
	}
	public ArrayList<Integer> getQuantit�() {
		return Quantit�;
	}
	public void setQuantit�(ArrayList<Integer> quantit�) {
		this.Quantit� = quantit�;
	}
	
	
	public void AggiungiArticoli(String articolo, int Prezzo, int quantit�) {
		Articoli.add(articolo);
		Prezzi.add(Prezzo);
		Quantit�.add(quantit�);
	}
	
	public Integer getEntrate() {
		int totale = 0;
		for(int i = 0; i<Articoli.size(); i++) {
			totale+= Prezzi.get(i)*Quantit�.get(i);
		}
		return totale;
	}
	
}
