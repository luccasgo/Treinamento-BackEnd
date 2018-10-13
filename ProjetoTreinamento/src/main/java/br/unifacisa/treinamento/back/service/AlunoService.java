package br.unifacisa.treinamento.back.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.treinamento.back.domain.Aluno;
import br.unifacisa.treinamento.back.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno salvarAluno(Aluno aluno) {
		//regras de caso
		if(alunoRepository.existsByMatricula(aluno.getMatricula()) == false ) {
			alunoRepository.insert(aluno);
		}
		return aluno;
	}
	
	public Aluno atualizarAlunp(Aluno aluno) {
		if(alunoRepository.existsByMatricula(aluno.getMatricula()) == true) {
			
		}
		return aluno;
	}
}
