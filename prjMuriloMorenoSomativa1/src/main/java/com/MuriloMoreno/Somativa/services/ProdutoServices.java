package com.MuriloMoreno.Somativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MuriloMoreno.Somativa.entities.Cliente;
import com.MuriloMoreno.Somativa.entities.Produto;
import com.MuriloMoreno.Somativa.repositories.ClienteRepository;
import com.MuriloMoreno.Somativa.repositories.ProdutoRepository;

@Service
public class ProdutoServices {
	
	private final ProdutoRepository produtorepository;
	
	@Autowired
	public ProdutoServices(ProdutoRepository produtorepository) {
		this.produtorepository = produtorepository;
	}
	
	//criação do colaborador
	public Produto saveProduto(Produto produto) {
		return produtorepository.save(produto);
	}
	public Produto getProdutoById(Long id) {
		return produtorepository.findById(id).orElse(null);
	}
	public List<Produto> getAllProduto(){
		return produtorepository.findAll();
	}
	public void deleteProduto(Long id) {
		produtorepository.deleteById(id);
	}

}


