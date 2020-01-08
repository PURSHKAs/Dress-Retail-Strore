package Negozio;

public class Articolo {
	private String Codice;
	private String Capo;
	private Integer Prezzo;
	private Integer Scorta;
	
	public Articolo(String Codice, String Capo, int Prezzo, int Scorta) {
		super();
		this.Codice = Codice;
		this.Capo = Capo;
		this.Prezzo = Prezzo;
		this.Scorta = Scorta;
	}
	
	public String getCodice() {
		return Codice;
	}
	public void setCodice(String codice) {
		Codice = codice;
	}
	public String getCapo() {
		return Capo;
	}
	public void setCapo(String capo) {
		Capo = capo;
	}
	public Integer getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(Integer prezzo) {
		Prezzo = prezzo;
	}
	public Integer getScorta() {
		return Scorta;
	}
	public void setScorta(Integer scorta) {
		Scorta = scorta;
	}

}
