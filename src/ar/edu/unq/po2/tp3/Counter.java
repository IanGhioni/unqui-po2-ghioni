package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> lista;
	
	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}
	
	public ArrayList<Integer> getLista() {
		return this.lista;
	}
	
	public int cantidadDePares() {
		int Contador = 0;
		
		for (int number: lista) {
			Contador = Contador + (this.devolver1SiEsPar(number));
		}
		return Contador;
	}
		
	public int devolver1SiEsPar(Integer x) {
		
		if (esPar(x)) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean esPar(int hola) {
		int x;
		x = hola;
		return ((x % 2) == 0);
	}
}

	