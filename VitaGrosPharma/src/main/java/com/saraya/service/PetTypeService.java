package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.owners.copy.PetType;


@Service
public class PetTypeService {
	public static List<PetType>types=new ArrayList<>();
static {
	types.add(new PetType("Dog"));
	types.add(new PetType("Cat"));
	types.add(new PetType("Bird"));
	types.add(new PetType("Hamster"));
	types.add(new PetType("Lizard"));
}
public List<PetType> getAllPetType(){
	return types;
}
}
