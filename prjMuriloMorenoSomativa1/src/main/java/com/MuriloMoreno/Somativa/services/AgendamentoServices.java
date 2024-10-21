package com.MuriloMoreno.Somativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MuriloMoreno.Somativa.entities.Agendamento;
import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.repositories.AgendamentoRepository;
import com.MuriloMoreno.Somativa.repositories.ClienteRepository;

@Service
public class AgendamentoServices {
	
	private final AgendamentoRepository agendamentorepository;
	
	@Autowired
	public AgendamentoServices(AgendamentoRepository agendamentorepository) {
		this.agendamentorepository = agendamentorepository;
	}
	
	//criação do colaborador
	public Agendamento saveAgendamento(Agendamento agendamento) {
		return agendamentorepository.save(agendamento);
	}
	public Agendamento getAgendamentoById(Long id) {
		return agendamentorepository.findById(id).orElse(null);
	}
	public List<Agendamento> getAllAgendamento(){
		return agendamentorepository.findAll();
	}
	public void deleteAgendamento(Long id) {
		agendamentorepository.deleteById(id);
	}

}


