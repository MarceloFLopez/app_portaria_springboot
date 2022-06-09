package br.com.portariacore;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.portariacore.model.WRegistro;
import br.com.portariacore.repository.RegistroRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private RegistroRepository rr;
	
	@Test
	void contextLoads() {
		Optional<WRegistro> registro = Optional.of(new WRegistro());
		registro = rr.findById(1l);
		
		System.out.println(registro);
		
		
	}

}
