package com.dawes.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="vuelos")
public class VueloVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idvuelo;
	private String descripcion;
	private LocalDate fecha;
	private LocalTime horallegada;
	private LocalTime horasalida;
	private String identificador;
	

}
