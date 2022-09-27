package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}
		
	EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		this.setNombre(nombre);
		this.setIntegrantes(integrantes);
	}
	
	public int promedioDeEdadDeIntegrantes() {
		int promedio;
		
		promedio = this.integrantes.stream().mapToInt(s -> s.getEdad()).sum();
		promedio = promedio / this.integrantes.size();
		
		return(promedio);
	}
	
	public void printPromedioDeEdad() {
		System.out.println(this.promedioDeEdadDeIntegrantes());
	}
}
