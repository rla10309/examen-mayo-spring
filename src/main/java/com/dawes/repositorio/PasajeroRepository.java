package com.dawes.repositorio;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.PasajeroVO;


public interface PasajeroRepository extends CrudRepository<PasajeroVO, Integer> {
	
	Optional<PasajeroVO> findByDni(String dni);
	
	

}
