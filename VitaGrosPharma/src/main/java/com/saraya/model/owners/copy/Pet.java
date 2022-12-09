package com.saraya.model.owners.copy;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



public class Pet {
	private int petId;
	@Size(min=2, message="enter at least 2 digits")
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	private PetType petTypes;
	
	private Visit visit;

	public Pet(int petId, String name, LocalDate dateOfBirth, PetType petTypes, Visit visit) {
		this.petId = petId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.petTypes = petTypes;
		this.visit = visit;
	}

	public Pet() {
		super();
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PetType getPetTypes() {
		return petTypes;
	}

	public void setPetType(PetType petType) {
		this.petTypes = petType;
	}

	public Visit getVisit() {
		return visit;
	}

	public void setVisit(Visit visit) {
		this.visit = visit;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", dateOfBirth=" + dateOfBirth + ", petType=" + petTypes + "]";
	}

}
