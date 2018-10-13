package br.unifacisa.treinamento.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.treinamento.back.domain.Sala;
import br.unifacisa.treinamento.back.repository.SalaRepository;

@Service
public class SalaService {
	@Autowired
	private SalaRepository salaRepository;
	
	public Sala salvarSala(Sala sala) {
		//regras de caso
		
		
		return sala;
	}	
}
