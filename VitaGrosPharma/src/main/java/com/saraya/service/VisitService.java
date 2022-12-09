package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.owners.copy.Visit;
@Service
public class VisitService {
	public static List<Visit>visits = new ArrayList<>();
	static {
		visits.add(new Visit(LocalDate.now(),"Dog:Although dogs look very different from people, they share many of our body’s characteristics. They have a heart and circulatory system to transport blood, lungs to take in oxygen and rid the body of carbon dioxide, a digestive tract to absorb nutrients from food, and so on."));
		visits.add(new Visit(LocalDate.now(),"Cat:There are many different breeds of cats, including Abyssinian, Himalayan, Maine Coon, Manx, Persian, Scottish Fold, and Siamese, to name a few. The Cat Fanciers’ Association, which is the world’s largest registry of pedigreed cats, recognizes about 40 distinct breeds."));
		visits.add(new Visit(LocalDate.now(),"Lion:The lion (Panthera leo) is a large cat of the genus Panthera native to Africa and India. It has a muscular, broad-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions are larger than females and have a prominent mane."));
		
	}

	public List <Visit> showVisit(){
		return visits;
	}
}
