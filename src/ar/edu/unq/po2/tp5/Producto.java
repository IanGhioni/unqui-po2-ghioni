package ar.edu.unq.po2.tp5;

public abstract class Producto {
	protected double precio;
	protected String nombre;
	protected double stock;
	
	public Producto(String nombre, double precio, double stock) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(stock);
	}
	
	private void setStock(double stock) {
		this.stock = stock;
	}

	public abstract double getPrecio();
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void reducirStock() {
		stock = stock - 1;
	}
	
}
