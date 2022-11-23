package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {

	//Atributos
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	private String nome;
	private String exigencia;
	
	//Construtor
	public Area(int cod, String nome, String exigencia) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.exigencia = exigencia;
	}

	//Gets and Sets
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExigencia() {
		return exigencia;
	}

	public void setExigencia(String exigencia) {
		this.exigencia = exigencia;
	}	

}
