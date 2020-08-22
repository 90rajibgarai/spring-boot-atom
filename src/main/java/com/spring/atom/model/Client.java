package com.spring.atom.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client
{	
	private String nom;
	private String prenom;	
	private ArrayList<Adresse> adresses;		
	private ArrayList<Facture> factures;
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		adresses = new ArrayList<>();
		factures = new ArrayList<>();
	}

	public Client() {}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String Prenom) {
		this.prenom = Prenom;
	}

	public ArrayList<Adresse> getAdresses() {
		return adresses;
	}

	public void addAdresse(Adresse adresse) {
		adresses.add(adresse);
	}
	
	public ArrayList<Facture> getFactures() {
		return factures;
	}

	public void addFacture(Facture facture) {
		factures.add(facture);
	}

	@Override
	public String toString() {
		return this.nom + " "+this.prenom ;
	}

	public void setAdresses(ArrayList<Adresse> adresses) {
		this.adresses = adresses;
	}

	public void setFactures(ArrayList<Facture> factures) {
		this.factures = factures;
	}
	
	
}
