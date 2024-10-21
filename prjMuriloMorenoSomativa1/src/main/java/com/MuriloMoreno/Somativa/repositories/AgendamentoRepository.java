package com.MuriloMoreno.Somativa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MuriloMoreno.Somativa.entities.Agendamento;
import com.MuriloMoreno.Somativa.services.AgendamentoServices;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

	 
	

}
