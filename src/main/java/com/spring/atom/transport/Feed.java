package com.spring.atom.transport;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="feed")
public class Feed<BusinessClass> extends AtomConstruct{
	
	@XmlElement
	String author ="Philippe"; 
	@XmlElement(name="entry")
	ArrayList<Entry<BusinessClass>> entries = new ArrayList<Entry<BusinessClass>>();
	
	public Feed(){}
	//feedTitle : the title of the feed (usually the last segment if the feedUrl)
	//feedURL = url of the feed (i.e. the collection, using the plural form)
	//bcl : hashtable whose keys are the ids of the business objects in the database and values are the business object
	public Feed(String feedTitle, String feedUrl, Map<Integer,BusinessClass> bcl, int start){

		setId(feedUrl);
		setTitle(feedTitle);
		setUpdated(Calendar.getInstance().getTime().toString());
		addLink(new AtomLink("self",feedUrl,MediaType.APPLICATION_XML));
		
		for(Integer id : bcl.keySet()){
			BusinessClass o = bcl.get(id);
			String className = o.getClass().getSimpleName().toLowerCase();
			String titre = className + " " + id;
			String url = feedUrl+"/"+id;
			entries.add(new Entry<BusinessClass>(titre,url,o,false));
		}
	}
	
	public Feed(String feedTitle, String feedUrl, Map<String,BusinessClass> bcl)
	{
		setId(feedUrl);
		setTitle(feedTitle);
		setUpdated(Calendar.getInstance().getTime().toString());
		addLink(new AtomLink("self",feedUrl,MediaType.APPLICATION_XML));
		
		for(String id : bcl.keySet()){
			BusinessClass o = bcl.get(id);
			String className = o.getClass().getSimpleName().toLowerCase();
			String titre = className + " " + id;
			String url = feedUrl+"/"+id;
			entries.add(new Entry<BusinessClass>(titre,url,o,false));
		}
	}
		
	public ArrayList<Entry<BusinessClass>> getEntries() {
		return entries;
	}
}

