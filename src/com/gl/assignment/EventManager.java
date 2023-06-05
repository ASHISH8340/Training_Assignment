package com.gl.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EventManager {
	 public static void main(String[] args) {
	        List<Guest> guests = populateGuests();
	        filterGuest(guests);
	    }
	 
	 
	  public static List<Guest> populateGuests() {
	        List<Guest> guests = new ArrayList<>();
	        guests.add(new Guest("John", LocalDate.of(1990, 5, 10), Country.USA, Language.English, Hobby.Travel));
	        guests.add(new Guest("Frank", LocalDate.of(1985, 8, 15), Country.Spain, Language.Spanish, Hobby.Dance));
	        guests.add(new Guest("Ab De Villiers", LocalDate.of(1984, 2, 17), Country.France, Language.French, Hobby.WaterSports));
	        guests.add(new Guest("Mahendra Singh Dhoni", LocalDate.of(1981, 07, 7), Country.China, Language.Chinese, Hobby.Read));
	        guests.add(new Guest("Sachin", LocalDate.of(1988, 12, 31), Country.Germany, Language.German, Hobby.Music));
	        guests.add(new Guest("Amith", LocalDate.of(1978, 6, 5), Country.France, Language.French, Hobby.Travel));
	        guests.add(new Guest("Vipin", LocalDate.of(1960, 9, 25), Country.Spain, Language.Spanish, Hobby.Drink));
	        guests.add(new Guest("Raina", LocalDate.of(1945, 7, 12), Country.China, Language.Chinese, Hobby.Read));
	        guests.add(new Guest("Kartika", LocalDate.of(1982, 2, 18), Country.USA, Language.English, Hobby.Music));
	        guests.add(new Guest("Abhishek", LocalDate.of(1952, 11, 2), Country.Germany, Language.German, Hobby.Eat));
	        return guests;
	    }
	  
	  
	  public static void filterGuest(List<Guest> guests) {
		  System.out.println("List of guests from Spain who love music and dance:");
	        Predicate<Guest> spanishMusicAndDance = guest -> Country.Spain.equals(guest.getCountry())
	                && (Hobby.Music.equals(guest.getHobby()) || Hobby.Dance.equals(guest.getHobby()));
	        guests.stream().filter(spanishMusicAndDance).forEach(System.out::println);
	        
	        System.out.println("\nList of guests who love to drink and are above 18 years old:");
	        Predicate<Guest> drinkersAbove18 = guest -> Hobby.Drink.equals(guest.getHobby())
	                && LocalDate.now().getYear() - guest.getDob().getYear() > 18;
	        guests.stream().filter(drinkersAbove18).forEach(System.out::println);
	        
	        System.out.println("\nList of guests from France who love playing sports:");
	        Predicate<Guest> frenchSportsLovers = guest -> Country.France.equals(guest.getCountry())
	                && Hobby.WaterSports.equals(guest.getHobby());
	        guests.stream().filter(frenchSportsLovers).forEach(System.out::println);

	        System.out.println("\nNumber of guests above 70 years old:");
	        Predicate<Guest> above70YearsOld = guest -> LocalDate.now().getYear() - guest.getDob().getYear() > 70;
	        long count = guests.stream().filter(above70YearsOld).count();
	        System.out.println("Number of guests: " + count);

	        System.out.println("\nList of guests who speak Chinese and love to read:");
	        Predicate<Guest> chineseReaders = guest -> Language.Chinese.equals(guest.getLanguage())
	                && Hobby.Read.equals(guest.getHobby());
	        guests.stream().filter(chineseReaders).forEach(System.out::println);
	    

		  
	  }

}
