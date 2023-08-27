package br.com.portariacore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.portariacore.repository.OperacaoRepository;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private OperacaoRepository er;
	
	@Test
	void contextLoads() {
		er.findAll().forEach(a -> System.out.println(a.toString()));			
	}
}


