package com.MuriloMoreno.Somativa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")// define o nome da tabela 
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // primary key
	private Long id;
	private String nome;
	private String telefone;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}
	
	
}