package com.dawes.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pasajeros", uniqueConstraints = @UniqueConstraint(columnNames = "dni"))
public class PasajeroVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpasajero;
	private String dni;
	private String nombre;
	
	@OneToMany(mappedBy = "pasajero")
	private List<VueloPasajeroVO> vuelos;

	@Override
	public String toString() {
		return "PasajeroVO [idpasajero=" + idpasajero + ", dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	
	
	
	

}
