package Negozio;

public class Azienda {
	private String Nome;
	private String Indirizzo;
	private String Logo;
	private String Telefono;
	
	public Azienda() {
		super();
		this.Nome = Nome;
		this.Indirizzo = Indirizzo;
		this.Logo = Logo;
		this.Telefono = Telefono;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getIndirizzo() {
		return Indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}
	public String getLogo() {
		return Logo;
	}
	public void setLogo(String logo) {
		Logo = logo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}
