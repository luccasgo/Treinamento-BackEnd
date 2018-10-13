package br.unifacisa.treinamento.back.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.treinamento.back.domain.Turma;

@Repository
public interface TurmaRepository extends MongoRepository <Turma, String> {

}
