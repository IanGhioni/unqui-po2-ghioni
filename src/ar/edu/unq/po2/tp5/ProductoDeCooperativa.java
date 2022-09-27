package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {
	
	public ProductoDeCooperativa(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public double getPrecio() {
		return precio - (precio * this.porcentajeDeIva(0.10));
	}

	private double porcentajeDeIva(double i) {
		return i;
	}
}
