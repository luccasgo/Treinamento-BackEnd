package br.unifacisa.treinamento.back.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.treinamento.back.domain.Aluno;

@Repository
public interface AlunoRepository extends MongoRepository<Aluno, String>{
	boolean existsByMatricula (Long matricula);

}
