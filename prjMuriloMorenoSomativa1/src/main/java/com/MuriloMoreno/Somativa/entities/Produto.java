package com.MuriloMoreno.Somativa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")// define o nome da tabela 
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // primary key
	private Long id;
	private String nome;
	private String preco;
	
	
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
	
	
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
		this.preco=preco;
	}
	
	
}
