package com.spring.atom.dto;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClientDto 
{
	private String nom;
	
	private String prenom;
	
	private ArrayList<AdresseDto> adresses = new ArrayList<>();
	
	private ArrayList<FactureDto> factures = new ArrayList<>();

	public ClientDto() {}
		
	public ClientDto(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public ClientDto(String nom, String prenom, ArrayList<AdresseDto> adresses, ArrayList<FactureDto> factures) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
		this.factures = factures;
	}
	
	public ClientDto(String nom, String prenom, ArrayList<FactureDto> factures) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.factures = factures;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "ClientDto [nom=" + nom + ", prenom=" + prenom + ", adresses=" + adresses + ", factures=" + factures
				+ "]";
	}
	
	
}
