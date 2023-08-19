package com.dawes.servicioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.VueloPasajeroVO;
import com.dawes.repositorio.VueloPasajeroRepository;
import com.dawes.servicio.ServicioVueloPasajero;

@Service
public class ServicioVueloPasajeroImpl implements ServicioVueloPasajero {
	
	@Autowired
	VueloPasajeroRepository vpr;
	
	

	public Optional<List<VueloPasajeroVO>> findByPasajeroDni(String dni) {
		return vpr.findByPasajeroDni(dni);
	}

	@Override
	public <S extends VueloPasajeroVO> S save(S entity) {
		return vpr.save(entity);
	}

	@Override
	public <S extends VueloPasajeroVO> Iterable<S> saveAll(Iterable<S> entities) {
		return vpr.saveAll(entities);
	}

	@Override
	public Optional<VueloPasajeroVO> findById(Integer id) {
		return vpr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return vpr.existsById(id);
	}

	@Override
	public Iterable<VueloPasajeroVO> findAll() {
		return vpr.findAll();
	}

	@Override
	public Iterable<VueloPasajeroVO> findAllById(Iterable<Integer> ids) {
		return vpr.findAllById(ids);
	}

	@Override
	public long count() {
		return vpr.count();
	}

	@Override
	public void deleteById(Integer id) {
		vpr.deleteById(id);
	}

	@Override
	public void delete(VueloPasajeroVO entity) {
		vpr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		vpr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends VueloPasajeroVO> entities) {
		vpr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		vpr.deleteAll();
	}
	
	

}
