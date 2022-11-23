package com.example.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.OneToOne;


@Entity
public class Candidato extends Pessoa {

	//atributos
	@OneToOne(cascade = CascadeType.ALL)
	private Curriculo curriculo;
	@OneToOne(cascade = CascadeType.ALL)
	private Area areaInteressada;
	
	//construtor
	public Candidato(String nome, String sobrenome, String endereco, String cpf, String telefone, Timestamp data,
			String sexo, Curriculo curriculo, Area areaInteressada) {
		super(nome, sobrenome, endereco, cpf, telefone, data, sexo);
		this.curriculo = curriculo;
		this.areaInteressada = areaInteressada;
	}

	//Gets and Sets


	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	public Area getAreaInteressada() {
		return areaInteressada;
	}

	public void setAreaInteressada(Area areaInteressada) {
		this.areaInteressada = areaInteressada;
	}	

}
