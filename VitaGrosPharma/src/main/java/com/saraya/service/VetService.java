package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Specialty;
import com.saraya.model.Vet;
@Service
public class VetService {
public static List<Vet>vets=new ArrayList<Vet>();
public int account =3;

static {
	vets.add(new Vet("James","Carter",new Specialty("none")));
	vets.add(new Vet("Linda","Douglas",new Specialty("dentistry surgery")));
	vets.add(new Vet("Sharon","Jankins",new Specialty("none")));
	vets.add(new Vet("Helen","Leary",new Specialty("radiology")));
	vets.add(new Vet("Rafael","Ortega",new Specialty("surgery")));
	vets.add(new Vet("Henry","Stevens",new Specialty("radiology")));
}
public List<Vet> getAllVet() {
	return vets;
}
}
