package com.dawes.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dawes.modelo.PasajeroVO;
import com.dawes.modelo.VueloPasajeroVO;

@Service
public interface ServicioPasajero {
	


	Optional<PasajeroVO> findByDni(String dni);

	<S extends PasajeroVO> S save(S entity);

	<S extends PasajeroVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<PasajeroVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<PasajeroVO> findAll();

	Iterable<PasajeroVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(PasajeroVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends PasajeroVO> entities);

	void deleteAll();

}