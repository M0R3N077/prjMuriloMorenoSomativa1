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
import com.MuriloMoreno.Somativa.entities.Servico;
import com.MuriloMoreno.Somativa.services.ClienteServices;
import com.MuriloMoreno.Somativa.services.ServicoServices;

@RestController
@RequestMapping("/servico")
public class ServicoController {
	
	private final ServicoServices servicoservices;
	
	@Autowired
	public ServicoController(ServicoServices servicoservices) {
		this.servicoservices=servicoservices;
	}
	
	@PostMapping
	public Servico servicoFornecedor(@RequestBody Servico servico) {
		return servicoservices.saveServico(servico);
	}
	//traz todos os registros
	@GetMapping
	public List<Servico> getAllServico(){
		return servicoservices.getAllServico();
	}
	//traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Servico getServico(@PathVariable long id) {
		return servicoservices.getServicoById(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deleteServico(@PathVariable long id) {
		servicoservices.deleteServico(id);
	}
}
