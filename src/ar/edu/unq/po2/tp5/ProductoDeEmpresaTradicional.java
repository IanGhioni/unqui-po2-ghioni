package ar.edu.unq.po2.tp5;

public class ProductoDeEmpresaTradicional extends Producto {
	
	public ProductoDeEmpresaTradicional(String nombre, double precio, double stock) {
		super(nombre, precio, stock);
	}

	@Override
	public double getPrecio() {
		return precio;
	}

}
