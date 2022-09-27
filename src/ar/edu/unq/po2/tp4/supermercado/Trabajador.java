package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<TipoDeIngreso> ingresosPercibidosPorAño = new ArrayList<TipoDeIngreso>();
	
	public void addIngreso(TipoDeIngreso x) {
		ingresosPercibidosPorAño.add(x);
	}
	
	public int getTotalPercibido() {
		return ingresosPercibidosPorAño.stream().mapToInt(s -> s.getMonto()).sum();
	}
	
	public int getMontoImponible() {
		return ingresosPercibidosPorAño.stream().mapToInt(s -> s.getMontoImponible()).sum();
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
