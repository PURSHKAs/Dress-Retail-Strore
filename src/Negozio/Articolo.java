package Negozio;

public class Articolo {
	private String Codice;
	private String Nome;
	private Integer Prezzo;
	private String Taglia;
	private String Colore;
	private Integer Scorta;
	
	public Articolo(String Codice, String Nome, int Prezzo, int Scorta, String Taglia, String Colore) {
		super();
		this.Codice = Codice;
		this.Nome = Nome;
		this.Prezzo = Prezzo;
		this.Scorta = Scorta;
		this.Colore = Colore;
		this.Taglia = Taglia;
	}
	
	public String getCodice() {
		return Codice;
	}
	public void setCodice(String codice) {
		Codice = codice;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
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
	public String getTaglia() {
		return Taglia;
	}

	public void setTaglia(String taglia) {
		Taglia = taglia;
	}

	public String getColore() {
		return Colore;
	}

	public void setColore(String colore) {
		Colore = colore;
	}
}
