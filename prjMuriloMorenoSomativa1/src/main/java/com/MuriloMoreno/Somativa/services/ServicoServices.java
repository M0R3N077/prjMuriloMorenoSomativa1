package com.MuriloMoreno.Somativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.entities.Servico;
import com.MuriloMoreno.Somativa.repositories.ClienteRepository;
import com.MuriloMoreno.Somativa.repositories.ServicoRepository;

@Service
public class ServicoServices {
	
	private final ServicoRepository servicorepository;
	
	@Autowired
	public ServicoServices(ServicoRepository servicorepository) {
		this.servicorepository = servicorepository;
	}
	
	//criação do colaborador
	public Servico saveServico(Servico servico) {
		return servicorepository.save(servico);
	}
	public Servico getServicoById(Long id) {
		return servicorepository.findById(id).orElse(null);
	}
	public List<Servico> getAllServico(){
		return servicorepository.findAll();
	}
	public void deleteServico(Long id) {
		servicorepository.deleteById(id);
	}

}


