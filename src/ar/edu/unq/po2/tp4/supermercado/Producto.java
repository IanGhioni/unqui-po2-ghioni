package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	private String name;
	private Double precio;
	private boolean esPrecioCuidado;
	
	public String getNombre() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public void aumentarPrecio(double x) {
		precio = precio + x;
	}
	
	public Producto(String name, Double precio) {
		this.setName(name);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
	}
	
	public Producto(String name, Double precio, boolean precioCuidado) {
		this.setName(name);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(precioCuidado);
	}
}

