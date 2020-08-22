package com.spring.atom.dto;

public class CommandeDto 
{
	int numero;	
	String montant;
	
	public CommandeDto(int numero, String montant) {
		super();
		this.numero = numero;
		this.montant = montant;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int Numero) {
		this.numero = Numero;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}
}
