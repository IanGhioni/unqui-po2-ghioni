package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad {
	private String name;
	private Double precio;
	private boolean esPrecioCuidado;
	private Double porcentajeDeDescuento;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}


	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Double getPrecio() {
		return precio*(1 - (porcentajeDeDescuento/100));
	}
	
	public Double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}


	public void setPorcentajeDeDescuento(Double porcentajeDeDescuento) {
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}
	
	public ProductoPrimeraNecesidad(String name, Double precio, boolean precioCuidado, Double porcentaje) {
		this.setPrecio(precio);
		this.setEsPrecioCuidado(precioCuidado);
		this.setName(name);
		this.setPorcentajeDeDescuento(porcentaje);
	}


	
}
