package com.dawes.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.dto.VueloDTO;
import com.dawes.modelo.VueloPasajeroVO;
import com.dawes.servicio.ServicioPasajero;
import com.dawes.servicio.ServicioVuelo;
import com.dawes.servicio.ServicioVueloPasajero;

@RestController
public class MainContrllerWS {
	@Autowired
	ServicioVuelo sv;
	@Autowired
	ServicioPasajero sp;
	@Autowired
	ServicioVueloPasajero svp;
	
	@GetMapping("/vuelos/{dni}")
	public ResponseEntity<?> findByDni(@PathVariable String dni){
		List<VueloDTO> vuelos = new ArrayList<VueloDTO>();
		List<VueloPasajeroVO> vp = svp.findByPasajeroDni(dni).get();
		
		vp.forEach(v -> vuelos.add(new VueloDTO(v.getIdvuelopasajero(), v.getVuelo().getDescripcion(),
				v.getVuelo().getFecha(), v.getVuelo().getHorallegada(), v.getVuelo().getHorasalida(),
				v.getVuelo().getIdentificador(), v.getEmbarqueprioritario(), v.getMaleta10(), v.getMaleta20(),
				v.getTarjetaembarque(), v.getPasajero().getIdpasajero(), v.getVuelo().getIdvuelo(), v.getPasajero().getDni(),
				v.getPasajero().getNombre())));
		
		return new ResponseEntity<>(vuelos, HttpStatus.OK);
	}
	
	@PutMapping("/vuelos/{tarjetaembarque}")
	public ResponseEntity<?> modificaTarjeta(@PathVariable String tarjetaembarque, @RequestBody VueloDTO vuelo){
		VueloPasajeroVO vp = svp.findById(vuelo.getIdvuelopasajero()).get();
		vp.setTarjetaembarque(tarjetaembarque);
		svp.save(vp);
		VueloDTO nuevo = new VueloDTO(vp.getIdvuelopasajero(), vp.getVuelo().getDescripcion(), vp.getVuelo().getFecha(),
				vp.getVuelo().getHorallegada(), vp.getVuelo().getHorasalida(), vp.getVuelo().getIdentificador(), 
				vp.getEmbarqueprioritario(), vp.getMaleta10(), vp.getMaleta20(), vp.getTarjetaembarque(),vp.getPasajero().getIdpasajero(), 
				vp.getVuelo().getIdvuelo(), vp.getPasajero().getDni(), vp.getPasajero().getNombre());
		
		return new ResponseEntity<>(nuevo, HttpStatus.OK);
		
		
		
		
		
	}

}
