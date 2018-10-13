package br.unifacisa.treinamento.back.domain;
import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma {
	@Id
	private String id;
	@DBRef
	private Sala sala;
	@DBRef	
	private ArrayList <Aluno> alunos = new ArrayList <Aluno>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Short getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Short periodo) {
		this.periodo = periodo;
	}
	private Short periodo;
}