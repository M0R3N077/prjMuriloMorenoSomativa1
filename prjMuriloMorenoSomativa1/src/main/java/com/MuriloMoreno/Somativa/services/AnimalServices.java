package com.MuriloMoreno.Somativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MuriloMoreno.Somativa.entities.Animal;
import com.MuriloMoreno.Somativa.repositories.AnimalRepository;

@Service
public class AnimalServices {
	
	private final AnimalRepository animalrepository;
	
	@Autowired
	public AnimalServices(AnimalRepository animalrepository) {
		this.animalrepository = animalrepository;
	}
	
	//criação do colaborador
	public Animal saveAnimal(Animal animal) {
		return animalrepository.save(animal);
	}
	public Animal getAnimalById(Long id) {
		return animalrepository.findById(id).orElse(null);
	}
	public List<Animal> getAllAnimal(){
		return animalrepository.findAll();
	}
	public void deleteAnimal(Long id) {
		animalrepository.deleteById(id);
	}

}


