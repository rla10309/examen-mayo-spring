package com.dawes.servicioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.PasajeroVO;
import com.dawes.modelo.VueloPasajeroVO;
import com.dawes.repositorio.PasajeroRepository;
import com.dawes.servicio.ServicioPasajero;

@Service
public class ServicioPasajeroImpl implements ServicioPasajero {
	@Autowired
	PasajeroRepository pr;
	


	@Override
	public Optional<PasajeroVO> findByDni(String dni) {
		return pr.findByDni(dni);
	}

	@Override
	public <S extends PasajeroVO> S save(S entity) {
		return pr.save(entity);
	}

	@Override
	public <S extends PasajeroVO> Iterable<S> saveAll(Iterable<S> entities) {
		return pr.saveAll(entities);
	}

	@Override
	public Optional<PasajeroVO> findById(Integer id) {
		return pr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return pr.existsById(id);
	}

	@Override
	public Iterable<PasajeroVO> findAll() {
		return pr.findAll();
	}

	@Override
	public Iterable<PasajeroVO> findAllById(Iterable<Integer> ids) {
		return pr.findAllById(ids);
	}

	@Override
	public long count() {
		return pr.count();
	}

	@Override
	public void deleteById(Integer id) {
		pr.deleteById(id);
	}

	@Override
	public void delete(PasajeroVO entity) {
		pr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		pr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends PasajeroVO> entities) {
		pr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		pr.deleteAll();
	}
	
	

}
