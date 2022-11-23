package com.example.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.OneToOne;

@Entity
public class Funcionario extends Pessoa {
	
	//atributos
	private int cod;
	private String ramal;
	private double salario;
	@OneToOne(cascade = CascadeType.ALL)
	private Cargo cargo;
	
	//Construtor
	public Funcionario(String nome, String sobrenome, String endereco, String cpf, String telefone, Timestamp data,
			String sexo, int cod, String ramal, double salario, Cargo cargo) {
		super(nome, sobrenome, endereco, cpf, telefone, data, sexo);
		this.cod = cod;
		this.ramal = ramal;
		this.salario = salario;
		this.cargo = cargo;
	}

	//gets and sets
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
		

}
