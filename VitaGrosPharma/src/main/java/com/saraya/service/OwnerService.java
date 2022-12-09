package com.saraya.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.saraya.model.owners.copy.Owner;
import com.saraya.model.owners.copy.Pet;
import com.saraya.model.owners.copy.PetType;

@Service
public class OwnerService {
	public static List<Owner>owners=new ArrayList<Owner>();
	private int count =7;
	
	static {
		owners.add(new Owner(1,"Gorge", "Franclin", "110W.Liberty St","Madison","608028890294",new Pet(1, "Leo", LocalDate.of(2021, 12, 3),new PetType("Dog"), null)));
		owners.add(new Owner(2,"Betti", "Davis", "638 Cardinal Ave","Sun Prairie","6087685793",new Pet(2, "Baisil",  LocalDate.of(2021, 12, 3), new PetType("Lion"), null)));
		owners.add(new Owner(3,"Eduardo", "Rodriquez", "2693 Commerce St","McFerland","60005488500",new Pet(3, "Jevel Rosy",  LocalDate.of(2021, 12, 3), new PetType("Cat"), null)));
		owners.add(new Owner(4,"Harol", "Davis", "563 Friendly St","Winsor","6080288902891",new Pet(4, "Iggy",  LocalDate.of(2021, 12, 3), new PetType("	Bird"), null)));
		owners.add(new Owner(5,"Peter", "McTavish", "2387 S.Fair Way","Madison","608028895494",new Pet(5, "George",  LocalDate.of(2021, 12, 3), new PetType("Hamster"), null)));
		owners.add(new Owner(6,"Jean", "Coleman", "105 N.Lake St.","Monona","608028894500",new Pet(6, "Max Samanta",  LocalDate.of(2021, 12, 3), new PetType("Lizzards"), null)));
		owners.add(new Owner(7,"Jeff", "Black", "1450 Oak Blvd","M0nako","6080288902589",new Pet(7, "Lucky",  LocalDate.of(2021, 12, 3), new PetType("Lizzards"), null)));
		owners.add(new Owner(8,"Maria", "Escobito", "35 Maple St","Madison","6080288902945",new Pet(8, "Muliguan",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null)));
		owners.add(new Owner(9,"David", "Schroeder", "2749 Blackhwk Trail","Madison","608028895494",new Pet(9, "Freddy",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null)));
		owners.add(new Owner(10,"Carlos", "Estaban", "2335Independence La","Waunaki","608028895494",new Pet(10, "Lucky Sly",  LocalDate.of(2021, 12, 3), new PetType("Dog"), null)));
	}
	public List <Owner> getAllOwners() {
		return owners;
	}
	public void addOwner(String firstName, String lastName,String address, String city, String telephone) {
		owners.add(new Owner(++count,firstName, lastName,address,city,telephone,null));
		
	}
	
	public void updateOwner(Owner owner) {
		 owners.remove(owner);
		 owners.add(owner);
	}
	
	public void deleteOwner(int id) {
		Iterator <Owner>iterate= owners.iterator();
		while(iterate.hasNext()) {
			Owner  owner=iterate.next();
			if(owner.getId()==id) {
				iterate.remove();
				}
		}
	}
	
	public Owner detailsOwner(int id) {
		Iterator <Owner>iterate= owners.iterator();
		while(iterate.hasNext()){
			Owner owner=iterate.next();
			if(owner.getId()==id) {
				return owner;
			}
			
		}
		return null;
		
	}

}
