package Negozio;


public class Acquisto {
	private Articolo articolo;
	private Integer quantità;
	private int Prezzo;
	
	public Acquisto(Articolo articolo, int Quantità, int Prezzo) {
		super();
		this.articolo = articolo;
		this.quantità = Quantità;
		this.Prezzo = Prezzo;
	}
	
	public Articolo getArticolo() {
		return articolo;
	}
	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}
	public Integer getQuantità() {
		return quantità;
	}
	public void setQuantità(Integer quantità) {
		quantità = quantità;
	}
	public int getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
	}


	public Integer getTotal() {
		return quantità*Prezzo;
	}
}