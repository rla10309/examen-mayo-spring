package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.VueloVO;
import com.dawes.repositorio.VueloRepository;
import com.dawes.servicio.ServicioVuelo;

@Service
public class ServicioVueloImpl implements ServicioVuelo {
	@Autowired
	VueloRepository vr;

	@Override
	public <S extends VueloVO> S save(S entity) {
		return vr.save(entity);
	}

	@Override
	public <S extends VueloVO> Iterable<S> saveAll(Iterable<S> entities) {
		return vr.saveAll(entities);
	}

	@Override
	public Optional<VueloVO> findById(Integer id) {
		return vr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return vr.existsById(id);
	}

	@Override
	public Iterable<VueloVO> findAll() {
		return vr.findAll();
	}

	@Override
	public Iterable<VueloVO> findAllById(Iterable<Integer> ids) {
		return vr.findAllById(ids);
	}

	@Override
	public long count() {
		return vr.count();
	}

	@Override
	public void deleteById(Integer id) {
		vr.deleteById(id);
	}

	@Override
	public void delete(VueloVO entity) {
		vr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		vr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends VueloVO> entities) {
		vr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		vr.deleteAll();
	}
	
	

}
