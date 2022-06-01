package br.com.portariacore.modelTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.portariacore.model.TabEmpresa;
import br.com.portariacore.model.TabOperacao;
import br.com.portariacore.model.TabPessoa;
import br.com.portariacore.model.TabTransporte;
import br.com.portariacore.model.Usuario;
import br.com.portariacore.model.WRegistro;
import br.com.portariacore.repository.EmpresaRepository;
import br.com.portariacore.repository.OperacaoRepository;
import br.com.portariacore.repository.PessoaRepository;
import br.com.portariacore.repository.RegistroRepository;
import br.com.portariacore.repository.TransporteRepository;
import br.com.portariacore.repository.UsuarioRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private PessoaRepository pr;

	@Autowired
	private EmpresaRepository er;

	@Autowired
	private OperacaoRepository or;

	@Autowired
	private TransporteRepository tr;

	@Autowired
	private RegistroRepository rr;

	@Autowired
	private UsuarioRepository ur;

	@Test
	public void create() {
		TabEmpresa em = new TabEmpresa(null, "12345678911", "EmpresaTest1");
		TabEmpresa em1 = new TabEmpresa(null, "12345678912", "EmpresaTest2");
		TabEmpresa em2 = new TabEmpresa(null, "12345678913", "EmpresaTest3");
		er.save(em);
		er.save(em1);
		er.save(em2);

		TabOperacao op = new TabOperacao(null, "Coleta", LocalDate.now());
		TabOperacao op1 = new TabOperacao(null, "Entrega", LocalDate.now());
		TabOperacao op2 = new TabOperacao(null, "Devolução", LocalDate.now());
		or.save(op);
		or.save(op1);
		or.save(op2);

		TabTransporte tt = new TabTransporte(null, "Modelo Teste", "aaaaa-1111");
		TabTransporte tt1 = new TabTransporte(null, "Modelo Teste", "aaaaa-2222");
		TabTransporte tt2 = new TabTransporte(null, "Modelo Teste", "aaaaa-3333");
		tr.save(tt);
		tr.save(tt1);
		tr.save(tt2);
//
//		TabPessoa tp = new TabPessoa(null, "A", "33024955870", em, op, tt);
//		TabPessoa tp1 = new TabPessoa(null, "B", "33024955871", em1, op2, tt1);
//		TabPessoa tp2 = new TabPessoa(null, "C", "33024955872", em2, op1, tt2);
//		TabPessoa tp3 = new TabPessoa(null, "D", "33024955873", em1, op, tt2);
//		TabPessoa tp4 = new TabPessoa(null, "E", "33024955874", em2, op2, tt1);
//		TabPessoa tp5 = new TabPessoa(null, "F", "33024955875", em, op1, tt);
//		pr.save(tp);
//		pr.save(tp1);
//		pr.save(tp2);
//		pr.save(tp3);
//		pr.save(tp4);
//		pr.save(tp5);

		Usuario us = new Usuario(null, "Admin",  "Admin", "1324", false, LocalDateTime.now());
		Usuario us1 = new Usuario(null, "Teste1","Teste1", "1478",true, LocalDateTime.of(2022, 10, 10, 14, 10));
		Usuario us2 = new Usuario(null, "Teste2","Teste2", "7896", true, LocalDateTime.of(2021, 12, 5, 14, 10));
		Usuario us3 = new Usuario(null, "Teste3", "Teste3", "7415", true, LocalDateTime.of(2020, 02, 10, 14, 10));

		ur.save(us);
		ur.save(us1);
		ur.save(us2);
		ur.save(us3);
//
//		WRegistro re = new WRegistro(null, LocalDateTime.now(), us, tp);
//		WRegistro re1 = new WRegistro(null, LocalDateTime.now(), us1, tp1);
//		WRegistro re2 = new WRegistro(null, LocalDateTime.now(), us2, tp2);
//		WRegistro re3 = new WRegistro(null, LocalDateTime.now(), us3, tp3);
//		WRegistro re4 = new WRegistro(null, LocalDateTime.now(), us1, tp4);
//		WRegistro re5 = new WRegistro(null, LocalDateTime.now(), us2, tp5);
//		WRegistro re6 = new WRegistro(null, LocalDateTime.now(), us, tp);
//		WRegistro re7 = new WRegistro(null, LocalDateTime.now(), us1, tp1);
//		WRegistro re8 = new WRegistro(null, LocalDateTime.now(), us2, tp2);
//		WRegistro re9 = new WRegistro(null, LocalDateTime.now(), us3, tp3);
//		WRegistro re10 = new WRegistro(null, LocalDateTime.now(), us1, tp4);
//		WRegistro re11 = new WRegistro(null, LocalDateTime.now(), us2, tp5);
//		rr.save(re);
//		rr.save(re1);
//		rr.save(re2);
//		rr.save(re3);
//		rr.save(re4);
//		rr.save(re5);
//		rr.save(re6);
//		rr.save(re7);
//		rr.save(re8);
//		rr.save(re9);
//		rr.save(re10);
//		rr.save(re11);
		
//		List<TabOperacao> list = or.findAll();
//		
//		TabOperacao operacao = new TabOperacao();
//		String nome = "coleta";
//		for (TabOperacao tabOperacao : list) {
//			if(tabOperacao.getName().equalsIgnoreCase(nome)) {
//				operacao = tabOperacao;
//			};
//		}
//		
//		System.out.println(operacao);

	}

}
