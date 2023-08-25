package br.com.portariacore.modelTest;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

//	@Autowired
//	private PessoaRepository pr;
//
//	@Autowired
//	private OperacaoRepository or;
//
//	@Autowired
//	private EmpresaRepository er;
//
//	@Autowired
//	private TransporteRepository tr;
//
//	@Autowired
//	private RegistroRepository rr;
//
//	@Autowired
//	private UsuarioRepository ur;
//	
//	@Autowired
//	private CadastroRepository cr;
//
//	@Test
//	public void create() {
//		
//		
//		TabOperacao tt = new TabOperacao(null, "Teste", LocalDateTime.now());
//		or.save(tt);
		
//		TabEmpresa em = new TabEmpresa(null, "12345678911", "EmpresaTest1");
//		TabEmpresa em1 = new TabEmpresa(null, "12345678912", "EmpresaTest2");
//		TabEmpresa em2 = new TabEmpresa(null, "12345678913", "EmpresaTest3");
//		er.save(em);
//		er.save(em1);
//		er.save(em2);
//		
//		TabOperacao op = new TabOperacao(null, "Coleta", LocalDate.now());
//		TabOperacao op1 = new TabOperacao(null, "Entrega", LocalDate.now());
//		TabOperacao op2 = new TabOperacao(null, "Devolução", LocalDate.now());
//		or.save(op);
//		or.save(op1);
//		or.save(op2);
//		
//		TabTransporte tt = new TabTransporte(null, "Modelo Teste1", "aaaa1-1111");
//		TabTransporte tt1 = new TabTransporte(null, "Modelo Teste2", "bbb2-2222");
//		TabTransporte tt2 = new TabTransporte(null, "Modelo Teste3", "ccc3-3333");
//		TabTransporte tt3 = new TabTransporte(null, "Modelo Teste4", "ddd4-1111");
//		TabTransporte tt4 = new TabTransporte(null, "Modelo Teste5", "eee5-2222");
//		TabTransporte tt5 = new TabTransporte(null, "Modelo Teste6", "fff6-3333");
//		TabTransporte tt6= new TabTransporte(null, "Modelo Teste7", "ggg7-1111");
//		TabTransporte tt7 = new TabTransporte(null, "Modelo Teste8", "hhh8-2222");
//		TabTransporte tt8 = new TabTransporte(null, "Modelo Teste9", "iii9-3333");
//		TabTransporte tt9= new TabTransporte(null, "Modelo Teste10", "jj10-1111");
//		TabTransporte tt10 = new TabTransporte(null, "Modelo Teste11", "kk11-2222");
//		TabTransporte tt11 = new TabTransporte(null, "Modelo Teste12", "ll12-3333");
//		TabTransporte tt12 = new TabTransporte(null, "Modelo Teste13", "mm13-1111");
//		TabTransporte tt13 = new TabTransporte(null, "Modelo Teste14", "nn14-2222");	
//		TabTransporte tt14 = new TabTransporte(null, "Modelo Teste15", "oo15-2222");
//		tr.save(tt);
//		tr.save(tt1);
//		tr.save(tt2);
//		tr.save(tt3);
//		tr.save(tt4);
//		tr.save(tt5);
//		tr.save(tt6);
//		tr.save(tt7);
//		tr.save(tt8);
//		tr.save(tt9);
//		tr.save(tt10);
//		tr.save(tt11);
//		tr.save(tt12);
//		tr.save(tt13);
//		tr.save(tt14);
//
//		TabPessoa tp   = new TabPessoa(null, "A", "33024955870");
//		TabPessoa tp1  = new TabPessoa(null, "B", "33024955871");
//		TabPessoa tp2  = new TabPessoa(null, "C", "33024955872");
//		TabPessoa tp3  = new TabPessoa(null, "D", "33024955873");
//		TabPessoa tp4  = new TabPessoa(null, "E", "33024955874");
//		TabPessoa tp5  = new TabPessoa(null, "F", "33024955875");
//		TabPessoa tp6  = new TabPessoa(null, "g", "33024955876");
//		TabPessoa tp7  = new TabPessoa(null, "H", "33024955877");
//		TabPessoa tp8  = new TabPessoa(null, "I", "33024955878");
//		TabPessoa tp9  = new TabPessoa(null, "J", "33024955879");
//		TabPessoa tp10 = new TabPessoa(null, "K", "33024955880");
//		TabPessoa tp11 = new TabPessoa(null, "L", "33024955881");
//		TabPessoa tp12 = new TabPessoa(null, "M", "33024955882");
//		TabPessoa tp13 = new TabPessoa(null, "N", "33024955883");
//		TabPessoa tp14 = new TabPessoa(null, "P", "33024955884");	
//		pr.save(tp);
//		pr.save(tp1);
//		pr.save(tp2);
//		pr.save(tp3);
//		pr.save(tp4);
//		pr.save(tp5);
//		pr.save(tp6);
//		pr.save(tp7);
//		pr.save(tp8);
//		pr.save(tp9);
//		pr.save(tp10);
//		pr.save(tp11);
//		pr.save(tp12);
//		pr.save(tp13);
//		pr.save(tp14);
//		
//		TabCadastro cad = new TabCadastro(null, em, op1, tt1, tp1);
//		TabCadastro cad1 = new TabCadastro(null, em1, op2, tt2, tp);
//		TabCadastro cad2 = new TabCadastro(null, em2, op, tt3, tp3);
//		TabCadastro cad3 = new TabCadastro(null, em, op1, tt4, tp4);
//		TabCadastro cad4 = new TabCadastro(null, em1, op1, tt5, tp5);
//		TabCadastro cad5= new TabCadastro(null, em2, op2, tt6, tp6);
//		TabCadastro cad6 = new TabCadastro(null, em, op1, tt7, tp7);
//		TabCadastro cad7 = new TabCadastro(null, em1, op2, tt8, tp8);
//		TabCadastro cad8 = new TabCadastro(null, em2, op1, tt9, tp9);
//		TabCadastro cad9 = new TabCadastro(null, em, op1, tt10, tp10);
//		TabCadastro cad10 = new TabCadastro(null, em1, op1, tt11, tp11);
//		TabCadastro cad11 = new TabCadastro(null, em2, op1, tt12, tp12);
//		TabCadastro cad12 = new TabCadastro(null, em, op2, tt13, tp13);
//		TabCadastro cad13 = new TabCadastro(null, em1, op2, tt14, tp14);
//		cr.save(cad);
//		cr.save(cad1);
//		cr.save(cad2);
//		cr.save(cad3);
//		cr.save(cad4);
//		cr.save(cad5);
//		cr.save(cad6);
//		cr.save(cad7);
//		cr.save(cad8);
//		cr.save(cad9);
//		cr.save(cad10);
//		cr.save(cad11);
//		cr.save(cad12);
//		cr.save(cad13);
//
//		Usuario us = new Usuario(null, "Admin" ,"Admin", "1234", true, LocalDateTime.now());
//		Usuario us1 = new Usuario(null,"NomeTeste1" ,"Porteiro 1", "1478", true, LocalDateTime.of(2022, 10, 10, 14, 10));
//		Usuario us2 = new Usuario(null,"NomeTeste2" ,"Porteiro 2", "7896", true, LocalDateTime.of(2021, 12, 5, 14, 10));
//		Usuario us3 = new Usuario(null,"NomeTeste3" ,"Porteiro 3", "7415", true, LocalDateTime.of(2020, 02, 10, 14, 10));
//		Usuario us4 = new Usuario(null,"NomeTeste4" ,"Porteiro 4", "7415", true, LocalDateTime.of(2020, 02, 10, 14, 10));
//		ur.save(us);
//		ur.save(us1);
//		ur.save(us2);
//		ur.save(us3);
//		ur.save(us4);
//		
//		WRegistro re = new WRegistro(null, LocalDateTime.now(), us, cad);
//		WRegistro re1 = new WRegistro(null, LocalDateTime.now(), us1,cad1);
//		WRegistro re2 = new WRegistro(null, LocalDateTime.now(), us2,cad2);
//		WRegistro re3 = new WRegistro(null, LocalDateTime.now(), us3,cad3);
//		WRegistro re4 = new WRegistro(null, LocalDateTime.now(), us1,cad4);
//		WRegistro re5 = new WRegistro(null, LocalDateTime.now(), us2,cad5);
//		WRegistro re6 = new WRegistro(null, LocalDateTime.now(), us,cad6);
//		WRegistro re7 = new WRegistro(null, LocalDateTime.now(), us1,cad7);
//		WRegistro re8 = new WRegistro(null, LocalDateTime.now(), us2,cad8);
//		WRegistro re9 = new WRegistro(null, LocalDateTime.now(), us3,cad9);
//		WRegistro re10 = new WRegistro(null, LocalDateTime.now(), us1,cad10);
//		WRegistro re11 = new WRegistro(null, LocalDateTime.now(), us2,cad11);
//		WRegistro re12 = new WRegistro(null, LocalDateTime.now(), us1,cad12);
//		WRegistro re13 = new WRegistro(null, LocalDateTime.now(), us1,cad13);
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
//		rr.save(re12);
//		rr.save(re13);
//
//}

}
