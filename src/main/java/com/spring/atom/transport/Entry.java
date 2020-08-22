package com.spring.atom.transport;

import java.util.Calendar;
import javax.xml.bind.annotation.*;

import com.spring.atom.model.Adresse;
import com.spring.atom.model.Client;
import com.spring.atom.model.Commande;
import com.spring.atom.model.Facture;

import javax.ws.rs.core.*;

@XmlRootElement(name="entry")
@XmlSeeAlso({ Adresse.class, Client.class, Commande.class, Facture.class, Object.class })
@XmlAccessorType(XmlAccessType.NONE)
public class Entry<BusinessClass> extends AtomConstruct{
	
	@XmlElement(name="content")
	BusinessClass content;
	
	
	public Entry(){}
	//entryTitle : the title of the entry
	//url : full URL of the entry
	//o : business object to encapsulate in the entry
	//fullEntry: if true, the contents will be added, if false only include the alternate link
	public Entry(String entryTitle,String url,BusinessClass o,boolean fullEntry){
		setId(url);
		setTitle(entryTitle);
		setUpdated(Calendar.getInstance().getTime().toString());
		
		if(fullEntry) this.content = o;
		else addLink(new AtomLink("alternate",url,MediaType.APPLICATION_ATOM_XML));
	}
	
	public String toString(){
		if (content != null) return content.toString();
		else return getTitle() + " " + getLink("alternate").getHref();
	}
	public BusinessClass getContents(){
		return content;
	}
}


