package com.dawes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="vuelopasajero")
public class VueloPasajeroVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvuelopasajero;
	private int embarqueprioritario;
	private int maleta20;
	private int maleta10;
	private String tarjetaembarque;
	
	@ManyToOne
	@JoinColumn(name="idvuelo")
	private VueloVO vuelo;
	@ManyToOne
	@JoinColumn(name="idpasajero")
	private PasajeroVO pasajero;

}
