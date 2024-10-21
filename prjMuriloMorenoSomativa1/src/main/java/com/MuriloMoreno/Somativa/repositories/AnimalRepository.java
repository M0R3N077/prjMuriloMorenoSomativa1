package com.MuriloMoreno.Somativa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MuriloMoreno.Somativa.entities.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {

	 
	
}
