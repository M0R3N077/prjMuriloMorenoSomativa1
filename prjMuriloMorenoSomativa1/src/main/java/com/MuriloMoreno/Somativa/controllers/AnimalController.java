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

import com.MuriloMoreno.Somativa.entities.Animal;
import com.MuriloMoreno.Somativa.services.AnimalServices;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
	private final AnimalServices animalservices;
	
	@Autowired
	public AnimalController(AnimalServices animalservices) {
		this.animalservices=animalservices;
	}
	
	@PostMapping
	public Animal animalFornecedor(@RequestBody Animal animal) {
		return animalservices.saveAnimal(animal);
	}
	//traz todos os registros
	@GetMapping
	public List<Animal> getAllAnimal(){
		return animalservices.getAllAnimal();
	}
	//traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Animal getAnimal(@PathVariable long id) {
		return animalservices.getAnimalById(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deleteAnimal(@PathVariable long id) {
		animalservices.deleteAnimal(id);
	}
}
