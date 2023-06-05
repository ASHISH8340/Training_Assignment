package com.gl.assignment;

import java.time.LocalDate;

public class Guest {
	private String name;
	private LocalDate dob;
	private Country country;
	private Language language;
	private Hobby hobby;
	
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guest(String name, LocalDate dob, Country country, Language language, Hobby hobby) {
		super();
		this.name = name;
		this.dob = dob;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Country getCountry() {
		return country;
	}

	public Language getLanguage() {
		return language;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", dob=" + dob + ", country=" + country + ", language=" + language + ", hobby="
				+ hobby + "]";
	}
	
	
	
	

}
