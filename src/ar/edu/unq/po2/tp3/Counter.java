package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> lista = new ArrayList<Integer>();

	public void addNumber(int x) {
		lista.add(x);
	}
	
	//EJERCICIO 1
	
	// Punto a)
	public int cantidadDePares() {
		int Contador = 0;
		
		for (int number: lista) {
			Contador = Contador + (this.devolver1SiEsPar(number));
		}
		return Contador;
	}
		
	public int devolver1SiEsPar(int x) {
		
		if (esPar(x)) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean esPar(int x) {
		return ((x % 2) == 0);
	}
	
	// Punto b)
	public int cantidadDeImpares() {
		int Contador = 0;
		
		for (int number: lista) {
			Contador = Contador + (this.devolver1SiEsImpar(number));
		}
		return Contador;
	}
	
	public int devolver1SiEsImpar(int x) {
		if (esImpar(x)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public boolean esImpar(int x) {
		return ((x % 2)==1);
	}
	
	// Punto c)
	public int cantidadDeMultiplos(int x) {
		int Counter = 0;
		
		for (int number: lista) {
			Counter += this.devolver1SiEsMultiploDe(number , x);
		}
		return Counter;
	}
	
	public int devolver1SiEsMultiploDe(int number,int x) {
		if (esMultiplo(number,x)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public boolean esMultiplo(int number,int x) {
		return ((number % x) == 0);
	}
	
}