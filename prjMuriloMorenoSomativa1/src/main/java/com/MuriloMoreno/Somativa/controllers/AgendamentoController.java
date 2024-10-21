package com.MuriloMoreno.Somativa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MuriloMoreno.Somativa.entities.Agendamento;
import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.services.AgendamentoServices;
import com.MuriloMoreno.Somativa.services.ClienteServices;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	private final AgendamentoServices agendamentoservices;
	
	@Autowired
	public AgendamentoController(AgendamentoServices agendamentoservices) {
		this.agendamentoservices=agendamentoservices;
	}
	
	@PostMapping
	public Agendamento agendamentoFornecedor(@RequestBody Agendamento agendamento) {
		return agendamentoservices.saveAgendamento(agendamento);
	}
	//traz todos os registros
	@GetMapping
	public List<Agendamento> getAllAgendamento(){
		return agendamentoservices.getAllAgendamento();
	}
	//traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Agendamento getAgendamento(@PathVariable long id) {
		return agendamentoservices.getAgendamentoById(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deleteAgendamento(@PathVariable long id) {
		agendamentoservices.deleteAgendamento(id);
	}
}
