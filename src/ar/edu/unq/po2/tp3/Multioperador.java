package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> lista;
	
	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}
	
	public int sumarElementos() {
		int Contador = 0;
		
		for (int number: lista) {
			Contador = Contador + number;
		}
		
		return Contador;
	}
	
	public int multiplicarElementos() {
		int Contador = 1;
		
		for (int number: lista) {
			Contador = Contador * number;
		}
		
		return Contador;
	}
	
	public int restarElementos() {
		int Contador = 0;
		
		for (int number: lista) {
			Contador = number - Contador;
		}
		
		return Contador;
	}
}
