package com.spring.atom.dto;

public class AdresseDto 
{
	String rue;
	
	String NPA;
	
	public AdresseDto( String rue, String nPA) {
		super();
		this.rue = rue;
		NPA = nPA;
	}

	public AdresseDto() {		
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getNPA() {
		return NPA;
	}

	public void setNPA(String nPA) {
		NPA = nPA;
	}
}
