package Negozio;

public class Utente {
	private String Nome;
	private String Cognome;
	private String Indirizzo;
	private String Telefono;
	private int Età;
	private String Username;
	private String Password;
	private Integer Stato;

	public Utente (String Nome, String Cognome, String Indirizzo, String Telefono, int Età, Integer Stato,  String Username, String Password) {
		super();
		this.Nome = Nome;
		this.Cognome = Cognome;
		this.Indirizzo = Indirizzo;
		this.Telefono= Telefono;
		this.Età = Età;
		this.Username = Username;
		this.Password = Password;
		this.Stato = Stato;
	}



	public Integer getStato() {
		return Stato;
	}



	public void setStato(Integer stato) {
		Stato = stato;
	}



	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public int getEtà() {
		return Età;
	}

	public void setEtà(int età) {
		Età = età;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
