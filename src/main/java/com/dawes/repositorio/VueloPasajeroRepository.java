package com.dawes.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.VueloPasajeroVO;

public interface VueloPasajeroRepository extends CrudRepository<VueloPasajeroVO, Integer> {
	
	//@Query("select vp from VueloPasajeroVO vp where vp.pasajero.dni = ?1")
	Optional<List<VueloPasajeroVO>> findByPasajeroDni(String dni);

}
