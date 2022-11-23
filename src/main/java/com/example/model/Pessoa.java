package com.example.model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa {
	
	//atributos
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String cpf;
	private String telefone;
	private Timestamp Data;
	private String sexo;
	
	//Construtor
	public Pessoa(String nome, String sobrenome, String endereco, String cpf, String telefone, Timestamp data,
			String sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		Data = data;
		this.sexo = sexo;
	}

	
	//gets and sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Timestamp getData() {
		return Data;
	}

	public void setData(Timestamp data) {
		Data = data;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
