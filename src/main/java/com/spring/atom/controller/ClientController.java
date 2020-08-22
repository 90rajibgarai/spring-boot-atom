package com.spring.atom.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.atom.data.Data;
import com.spring.atom.model.Client;
import com.spring.atom.transport.Entry;
import com.spring.atom.transport.Feed;

@RestController
@RequestMapping("/TPEte/rest/clients")
public class ClientController 
{	
	@GetMapping()
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Feed<Client> getClients()
	{		
		String baseURI ="http://localhost:8080/TPEte/rest/";		
		Data data = new Data();
		
		ArrayList<Client> clients = data.getClients();		
		Map<String,Client> result = new HashMap<>();
		
		for (Client client : clients) {			
			result.put(client.getNom(), new Client(client.getNom(), client.getPrenom()));
		}		
		return new Feed<Client>("clients",baseURI+"clients",result);
	}
	
	@GetMapping("/{nom}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Entry<Client> getClient(@PathVariable("nom") String nom)
	{
		String baseURI ="http://localhost:8080/TPEte/rest/";
		Data data = new Data();
		
		Client client = data.getClient(nom);
		
		if(client != null)
			client.setFactures(null);
				
		return new Entry<Client>("client"+nom,baseURI+"clients/"+nom,client, true);
	}
	
	
	@GetMapping("commandes/{id}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Entry<Client> getClient(@PathVariable("id") int id)
	{
		String baseURI ="http://localhost:8080/TPEte/rest/";
		Data data = new Data();

		Client client = data.getClient(id);
		
		if(client != null)
			client.setAdresses(null);
		
		return new Entry<Client>("client"+id,baseURI+"clients/commandes/"+id,client, true);
	}
	
	
}
