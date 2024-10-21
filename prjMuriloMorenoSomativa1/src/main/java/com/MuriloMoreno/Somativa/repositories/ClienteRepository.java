package com.MuriloMoreno.Somativa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.services.ClienteServices;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	 
	

}
