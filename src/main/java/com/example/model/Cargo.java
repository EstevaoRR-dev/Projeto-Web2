package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo {
	
	//atributos
	private String nome;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	private int nivelAcess;
	
	@OneToOne(mappedBy = "cargo")
	private Funcionario funcionario;
	
	//construtor
	public Cargo(String nome, int cod, int nivelAcess) {
		super();
		this.nome = nome;
		this.cod = cod;
		this.nivelAcess = nivelAcess;
	}
	

	//Gets and sets
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

	public int getNivelAcess() {
		return nivelAcess;
	}

	public void setNivelAcess(int nivelAcess) {
		this.nivelAcess = nivelAcess;
	}
	
	
	

}
