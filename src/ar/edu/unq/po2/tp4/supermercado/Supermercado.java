package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> listaDeProductos = new ArrayList<Producto>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Producto> getListaDeProductos() {
		return listaDeProductos;
	}
	
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
	
	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}
	
	public double getPrecioTotal() {
		return this.listaDeProductos.stream().mapToDouble(s -> s.getPrecio()).sum();
	}
	
	public int getCantidadDeProductos() {
		return listaDeProductos.size();
	}
}
