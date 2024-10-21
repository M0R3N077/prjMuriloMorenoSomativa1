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

import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private final ClienteServices clienteservices;
	
	@Autowired
	public ClienteController(ClienteServices clienteservices) {
		this.clienteservices=clienteservices;
	}
	
	@PostMapping
	public Cliente clienteFornecedor(@RequestBody Cliente cliente) {
		return clienteservices.saveCliente(cliente);
	}
	//traz todos os registros
	@GetMapping
	public List<Cliente> getAllCliente(){
		return clienteservices.getAllCliente();
	}
	//traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable long id) {
		return clienteservices.getClienteById(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deleteCliente(@PathVariable long id) {
		clienteservices.deleteCliente(id);
	}
}
