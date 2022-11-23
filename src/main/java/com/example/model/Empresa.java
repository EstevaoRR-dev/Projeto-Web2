package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empresa {
	
	//atributos
	private String nome;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	private String cnpj;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Vaga> vagas;
	
	//construtor
	public Empresa(String nome, int cod, String cnpj, List<Vaga> vagas) {
		super();
		this.nome = nome;
		this.cod = cod;
		this.cnpj = cnpj;
		this.vagas = vagas;
	}

	//gets and sets	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}	

}
