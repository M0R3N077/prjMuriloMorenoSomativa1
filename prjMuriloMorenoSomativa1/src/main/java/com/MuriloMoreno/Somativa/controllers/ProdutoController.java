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

import com.MuriloMoreno.Somativa.entities.Produto;
import com.MuriloMoreno.Somativa.services.ProdutoServices;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	private final ProdutoServices produtoservices;
	
	@Autowired
	public ProdutoController(ProdutoServices produtoservices) {
		this.produtoservices=produtoservices;
	}
	
	@PostMapping
	public Produto produtoFornecedor(@RequestBody Produto produto) {
		return produtoservices.saveProduto(produto);
	}
	//traz todos os registros
	@GetMapping
	public List<Produto> getAllProduto(){
		return produtoservices.getAllProduto();
	}
	//traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable long id) {
		return produtoservices.getProdutoById(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deleteProduto(@PathVariable long id) {
		produtoservices.deleteProduto(id);
	}
}
