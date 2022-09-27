package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int getEdad() {
		return(LocalDate.now().compareTo(this.fechaDeNacimiento));
	}
	
	public boolean menorQue(Persona persona) {
		return(this.getEdad() < persona.getEdad());
	}
	
	Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}
}
