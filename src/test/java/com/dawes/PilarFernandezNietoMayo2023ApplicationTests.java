package com.dawes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.modelo.VueloPasajeroVO;
import com.dawes.servicio.ServicioPasajero;
import com.dawes.servicio.ServicioVuelo;
import com.dawes.servicio.ServicioVueloPasajero;

@SpringBootTest
class PilarFernandezNietoMayo2023ApplicationTests {

	@Autowired
	ServicioVuelo sv;
	@Autowired
	ServicioPasajero sp;
	@Autowired
	ServicioVueloPasajero svp;
	
	@Test
	public void test01() {
		List<VueloPasajeroVO> vuelos = svp.findByPasajeroDni("222").get();
		
		
		assertEquals(2, vuelos.size());
	}
	
	

}
