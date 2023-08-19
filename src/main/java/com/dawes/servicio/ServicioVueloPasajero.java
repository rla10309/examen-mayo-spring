package com.dawes.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dawes.modelo.VueloPasajeroVO;


@Service
public interface ServicioVueloPasajero {
	
	Optional<List<VueloPasajeroVO>> findByPasajeroDni(String dni);

	<S extends VueloPasajeroVO> S save(S entity);

	<S extends VueloPasajeroVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<VueloPasajeroVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<VueloPasajeroVO> findAll();

	Iterable<VueloPasajeroVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(VueloPasajeroVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends VueloPasajeroVO> entities);

	void deleteAll();

}