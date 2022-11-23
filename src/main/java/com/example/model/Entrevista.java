package com.example.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class Entrevista {
	
	//atributos
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Timestamp data;
	@OneToOne(cascade = CascadeType.ALL)
	private Empresa empresa;
	@OneToOne(cascade = CascadeType.ALL)
	private Candidato candidato;
	@OneToOne(cascade = CascadeType.ALL)
	private Vaga vaga;
	private String estado;
	
	//construtor
	public Entrevista(int id, Timestamp data, Empresa empresa, Candidato candidato, Vaga vaga, String estado) {
		super();
		this.data = data;
		this.empresa = empresa;
		this.candidato = candidato;
		this.vaga = vaga;
		this.estado = estado;
	}

	//gets and sets
	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	
	
}
