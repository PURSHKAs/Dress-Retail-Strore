package Negozio;

import java.util.ArrayList;

public class StoricoTransazioni {
	private String ID;
	private String Utente;
	private ArrayList<String> Articoli = new ArrayList<String>();
	private ArrayList<Integer> Prezzi = new ArrayList<Integer>();
	private ArrayList<Integer> Quantità = new ArrayList<Integer>();
	
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
	public ArrayList<Integer> getQuantità() {
		return Quantità;
	}
	public void setQuantità(ArrayList<Integer> quantità) {
		this.Quantità = quantità;
	}
	
	
	public void AggiungiArticoli(String articolo, int Prezzo, int quantità) {
		Articoli.add(articolo);
		Prezzi.add(Prezzo);
		Quantità.add(quantità);
	}
	
	public Integer getEntrate() {
		int totale = 0;
		for(int i = 0; i<Articoli.size(); i++) {
			totale+= Prezzi.get(i)*Quantità.get(i);
		}
		return totale;
	}
	
}
