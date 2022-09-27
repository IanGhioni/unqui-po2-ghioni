package ar.edu.unq.po2.tp4.supermercado;

import java.time.LocalDate;

public class Ingreso implements TipoDeIngreso {
	private int monto;
	private LocalDate fecha;
	private String concepto;
	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getMonto() {
		return monto;
	}
	
	public int getMontoImponible() {
		return monto;
	}
	
	Ingreso(int monto, String concepto, LocalDate fecha) {
		this.setConcepto(concepto);
		this.setFecha(fecha);
		this.setMonto(monto);
	}
}
