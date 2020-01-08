package Negozio;


public class Acquisto {
	private Articolo articolo;
	private Integer quantit�;
	private int Prezzo;
	
	public Acquisto(Articolo articolo, int Quantit�, int Prezzo) {
		super();
		this.articolo = articolo;
		this.quantit� = Quantit�;
		this.Prezzo = Prezzo;
	}
	
	public Articolo getArticolo() {
		return articolo;
	}
	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}
	public Integer getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(Integer quantit�) {
		quantit� = quantit�;
	}
	public int getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
	}


	public Integer getTotal() {
		return quantit�*Prezzo;
	}
}