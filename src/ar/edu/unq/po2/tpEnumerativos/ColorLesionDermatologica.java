package ar.edu.unq.po2.tpEnumerativos;

public enum ColorLesionDermatologica {
	
	Rojo("El color rojo puede ser resultado de la vasodilatación o hiperemia producida por la inflamación.","Bajo"),
	Gris("El color gris es por el incremento de la melanina o de la hemosiderina en la piel", "Medio"),
	Amarillo("La coloración amarillenta se aprecia en las lesiones que contienen lípidos", "Medio"),
	Miel("No encontre descripcion", "Nulo")
	;
	
	private String descripcion;
	private String nivelDeRiesgo;
	
	ColorLesionDermatologica(String descripcion, String nivelDeRiesgo) {
		this.setDescripcion(descripcion);
		this.setNivelDeRiesgo(nivelDeRiesgo);
		;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public String getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setNivelDeRiesgo(String nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
}