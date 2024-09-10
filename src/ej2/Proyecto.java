package ej2;

import java.time.LocalDate;

public class Proyecto {

	
	private String nombre;
	private String cliente;
	private String ubicacion;
	private LocalDate fechaInicio;
	
	public Proyecto ( String nombre, String cliente , String ubicacion, LocalDate fechaInicio) {
		
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.cliente=cliente;
		this.fechaInicio=fechaInicio;
	}
}
