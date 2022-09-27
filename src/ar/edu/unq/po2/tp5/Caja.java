package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> listaDeProductos = new ArrayList<Producto>();
	
	public void add(Producto p) {
		listaDeProductos.add(p);
	}
	
	public double getMontoAPagar() {
		return	listaDeProductos.stream().mapToDouble(s -> s.getPrecio()).sum();
		
	}
}
