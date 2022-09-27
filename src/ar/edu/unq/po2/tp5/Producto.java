package ar.edu.unq.po2.tp5;

public abstract class Producto {
	protected double precio;
	protected String nombre;
	
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	abstract double getPrecio();
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
