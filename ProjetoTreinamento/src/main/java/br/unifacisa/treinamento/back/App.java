package br.unifacisa.treinamento.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.unifacisa.treinamento.back.domain.Aluno;
import br.unifacisa.treinamento.back.service.AlunoService;

@SpringBootApplication
@EnableAutoConfiguration
public class App implements CommandLineRunner {
	
	@Autowired
	AlunoService alunoService;
	
	public static void main (String [] args) {
		SpringApplication.run(App.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.setId("132k1231kaols");
		aluno.setMatricula(12039105910L);
		aluno.setNome("Luccas");
		
		alunoService.salvarAluno(aluno);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getId());
	}
	
	
}
