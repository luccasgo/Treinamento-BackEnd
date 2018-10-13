package br.unifacisa.treinamento.back.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.treinamento.back.domain.Sala;

@Repository
public interface SalaRepository extends MongoRepository<Sala, String> {
	
}
