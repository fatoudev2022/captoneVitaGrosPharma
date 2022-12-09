package com.saraya.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


import com.saraya.model.owners.copy.Owner;
import com.saraya.model.owners.copy.Pet;
import com.saraya.model.owners.copy.PetType;
import com.saraya.model.owners.copy.Visit;


@Service
public class PetService {
	
	static List<Pet> pets = new ArrayList<Pet>();
	public int count=5;
	
	
	static {
		pets.add(new Pet(1,"Leo",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null));
		pets.add(new Pet(2,"Besil",  LocalDate.of(2021, 12, 3), new PetType("Lion"), null));
		pets.add(new Pet(3,"Jevel RoSy",  LocalDate.of(2021, 12, 3), new PetType("Cat"), null));
		pets.add(new Pet(4, "Iggy",  LocalDate.of(2021, 12, 3), new PetType("Bird"), null));
		pets.add(new Pet(5, "George",  LocalDate.of(2021, 12, 3), new PetType("Hamster"), null));
		pets.add(new Pet(6, "Max Samantha",  LocalDate.of(2021, 12, 3), new PetType("Lizzards"), null));
		pets.add(new Pet(7, "Mulligan",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null));
		pets.add(new Pet(8, "Freddy",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null));
		pets.add(new Pet(9, "Lucky Sly",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null));
	}
	
	public List<Pet> getAllPets(){
		return pets;
	}
	
	
	public void addPet(String name, LocalDate dateOfBirth,PetType petTypes, Visit visit) {
		pets.add(new Pet(++count,name, dateOfBirth,petTypes,visit));
		
	}
	
	public void updatePet(Pet pet) {
		 pets.remove(pet);
		 pets.add(pet);
	}
	public Pet detailsPet(int petId) {
		Iterator <Pet>iterate= pets.iterator();
		while(iterate.hasNext()){
			Pet pet=iterate.next();
			if(pet.getPetId()==petId) {
				return pet;
			}
		}
		return null;
	}
			
			
			public void deletePet(int id) {
				Iterator <Pet>iterate= pets.iterator();
				while(iterate.hasNext()) {
					Pet  pet=iterate.next();
					if(pet.getPetId()==id) {
						iterate.remove();
						}
				}
			
		
	
		
	}
	

	
}
