package com.MuriloMoreno.Somativa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agendamneto")// define o nome da tabela 
public class Agendamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // primary key
	private Long id;
	private String data;
	private String hora;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data=data;
	}
	
	
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora=hora;
	}
	
	
}
