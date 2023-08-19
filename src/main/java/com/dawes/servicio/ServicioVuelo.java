package com.dawes.servicio;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dawes.modelo.VueloVO;


@Service
public interface ServicioVuelo {

	<S extends VueloVO> S save(S entity);

	<S extends VueloVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<VueloVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<VueloVO> findAll();

	Iterable<VueloVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(VueloVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends VueloVO> entities);

	void deleteAll();

}