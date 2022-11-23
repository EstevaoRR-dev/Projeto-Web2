package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;


@Entity
public class Vaga {
	
	//atributos
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Area area;
	private int quantidade;
	private String perfilDesejado;
	
	//Construtor
	public Vaga(int id, Area area, int quantidade, String perfilDesejado) {
		super();
		this.area = area;
		this.quantidade = quantidade;
		this.perfilDesejado = perfilDesejado;
		this.id = id;
	}
	
	
	//gets and sets
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getPerfilDesejado() {
		return perfilDesejado;
	}

	public void setPerfilDesejado(String perfilDesejado) {
		this.perfilDesejado = perfilDesejado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
		
	

}
