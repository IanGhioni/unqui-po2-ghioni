package ar.edu.unq.po2.tp4.supermercado;

import java.time.LocalDate;

public class IngresoPorHorasExtra implements TipoDeIngreso { 
	private int monto;
	private LocalDate fecha;
	private String concepto;
	private int horasExtras;
	
	public int getMonto() {
		return monto+horasExtras;
	}
	
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public int getMontoImponible() {
		return monto;
	}
	
	IngresoPorHorasExtra(int monto, String concepto, LocalDate fecha, int horasExtras) {
		this.setConcepto(concepto);
		this.setFecha(fecha);
		this.setHorasExtras(horasExtras);
		this.setMonto(monto);
	}
}
