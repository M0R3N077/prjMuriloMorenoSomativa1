package com.MuriloMoreno.Somativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.repositories.ClienteRepository;

@Service
public class ClienteServices {
	
	private final ClienteRepository clienterepository;
	
	@Autowired
	public ClienteServices(ClienteRepository clienterepository) {
		this.clienterepository = clienterepository;
	}
	
	//criação do colaborador
	public Cliente saveCliente(Cliente cliente) {
		return clienterepository.save(cliente);
	}
	public Cliente getClienteById(Long id) {
		return clienterepository.findById(id).orElse(null);
	}
	public List<Cliente> getAllCliente(){
		return clienterepository.findAll();
	}
	public void deleteCliente(Long id) {
		clienterepository.deleteById(id);
	}

}


