package com.spring.atom.dto;

import java.util.ArrayList;

public class FactureDto 
{
	String numero;
	
	ArrayList<CommandeDto> commandes = new ArrayList<>();
	
	public FactureDto(String numero, ArrayList<CommandeDto> commandes) {
		super();
		this.numero = numero;
		this.commandes = commandes;
	}
	
	public FactureDto(String numero) {
		super();
		this.numero = numero;
	}
	
	public FactureDto(ArrayList<CommandeDto> commandes) {
		super();
		this.commandes = commandes;
	}

	public FactureDto() {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<CommandeDto> getCommandes() {
		return commandes;
	}

	public void addCommandes(CommandeDto commande) {
		commandes.add(commande);
	}
}
