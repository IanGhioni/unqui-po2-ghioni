package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> listaDeProductos = new ArrayList<Producto>();
	private Cliente cliente;
	
	
	public void addProducto(Producto p) {
		listaDeProductos.add(p);
	}
	
	public void cobrarCliente() {
		this.notificar(cliente);
		this.actualizarStock();
	}
	
	private void actualizarStock() {
		listaDeProductos.stream().forEach(p -> p.reducirStock());
	}

	public double getMontoAPagar() {
		return listaDeProductos.stream().mapToDouble(s -> s.getPrecio()).sum();
		
	}
	
	public void notificar(Cliente cliente) {
		cliente.setMontoAPagar(this.getMontoAPagar());
	}
}
