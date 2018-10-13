package br.unifacisa.treinamento.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.treinamento.back.domain.Turma;
import br.unifacisa.treinamento.back.repository.TurmaRepository;

@Service
public class TurmaService {
	@Autowired
	private TurmaRepository turmaRepository;
	
	public Turma salvarTurma(Turma turma) {
		//regras de caso
		return turmaRepository.insert(turma);
	}
}
