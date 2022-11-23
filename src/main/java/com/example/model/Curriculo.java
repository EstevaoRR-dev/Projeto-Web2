package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Curriculo {
	
	//atributos
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String perfilProf;
	private String experiencia;
	private String educacao;
	private Double pretencaoSalarial;
	private String informacoesComple;
	
	//Construtor
	public Curriculo(int id, String perfilProf, String experiencia, String educacao, Double pretencaoSalarial,
			String informacoesComple) {
		super();
		this.perfilProf = perfilProf;
		this.experiencia = experiencia;
		this.educacao = educacao;
		this.pretencaoSalarial = pretencaoSalarial;
		this.informacoesComple = informacoesComple;
	}

	//gets and sets
	public String getPerfilProf() {
		return perfilProf;
	}

	public void setPerfilProf(String perfilProf) {
		this.perfilProf = perfilProf;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public Double getPretencaoSalarial() {
		return pretencaoSalarial;
	}

	public void setPretencaoSalarial(Double pretencaoSalarial) {
		this.pretencaoSalarial = pretencaoSalarial;
	}

	public String getInformacoesComple() {
		return informacoesComple;
	}

	public void setInformacoesComple(String informacoesComple) {
		this.informacoesComple = informacoesComple;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	
	
	
}
