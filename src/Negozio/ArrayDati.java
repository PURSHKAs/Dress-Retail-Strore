package Negozio;

import java.util.ArrayList;

public class ArrayDati {
	public static ArrayList<Transazione> Transazioni = new ArrayList<Transazione>();
	public static ArrayList<Articolo> Articoli = new ArrayList<Articolo>();
	public static ArrayList<StoricoTransazioni> StoricoTransazioni = new ArrayList<StoricoTransazioni>();
	public static ArrayList<Cliente> Clienti = new ArrayList<Cliente>();
	
	public ArrayDati() {
		// TODO Auto-generated constructor stub
	}
	
	public static void Clear() {
		Transazioni.clear();
		Articoli.clear();
		StoricoTransazioni.clear();
		Clienti.clear();
	}

}
