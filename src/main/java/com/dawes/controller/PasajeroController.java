package com.dawes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.VueloPasajeroVO;
import com.dawes.servicio.ServicioPasajero;
import com.dawes.servicio.ServicioVuelo;
import com.dawes.servicio.ServicioVueloPasajero;

@Controller
@RequestMapping("/pasajero")
public class PasajeroController {
	
	@Autowired
	ServicioPasajero sp;
	@Autowired
	ServicioVuelo sv;
	@Autowired
	ServicioVueloPasajero svp;
	
	@RequestMapping("/buscarinformacion")
	public String buscarinfo(@RequestParam String dni, Model modelo) {
		List<VueloPasajeroVO> vuelospasajero = svp.findByPasajeroDni(dni).get();
		modelo.addAttribute("vuelospasajero", vuelospasajero);
		modelo.addAttribute("vuelos", sv.findAll());
		return "pasajero/listadovuelos";
	}
	@RequestMapping("/formmodificar")
	public String form(@RequestParam int idvuelopasajero, Model modelo) {
		VueloPasajeroVO vp = svp.findById(idvuelopasajero).get();
		modelo.addAttribute("vp", vp);
		modelo.addAttribute("vuelos", sv.findAll());
		modelo.addAttribute("pasajeros", sp.findAll());
		return "pasajero/formmodificar";
	}
	@RequestMapping("/modificar")
	public String moficicar(@ModelAttribute VueloPasajeroVO vp, Model modelo) {
		try {
			svp.save(vp);
			List<VueloPasajeroVO> vuelospasajero = svp.findByPasajeroDni(vp.getPasajero().getDni()).get();
			modelo.addAttribute("vuelospasajero", vuelospasajero);
		} catch (Exception e) {
			modelo.addAttribute("error " +e.getMessage(), "Hay un error en la modificación" );
			return "redirect:/pasajero/formmodificar";
		}
		return "pasajero/listadovuelos";
		
	}
	
	

}
