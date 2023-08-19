package com.dawes.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VueloDTO {
	private int idvuelopasajero;
	private String descripcion;
	private LocalDate fecha;
	private LocalTime horallegada;
	private LocalTime horasalida;
	private String identificador;
	private int embarquepioritario;
	private int maleta10;
	private int maleta20;
	private String tarjetaembarque;
	private int idpasajero;
	private int idvuelo;
	private String dnipasajero;
	private String nombre;
	
	
	
	
	

}
