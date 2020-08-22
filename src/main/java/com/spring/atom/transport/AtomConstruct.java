package com.spring.atom.transport;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

public abstract class AtomConstruct {
	
	@XmlElement
	private String id;
	@XmlElement
	 private String title;
	@XmlElement
	private String updated;
	@XmlElement(name="link")
	private ArrayList<AtomLink> links = new ArrayList<AtomLink>();

	protected void addLink(AtomLink l){links.add(l);}
	protected AtomLink getLink(String rel){
		for(AtomLink al: links)
			if(al.getRel().equals(rel)) return al;
		return null;
	}
	protected void setId(String id) {this.id = id;}
	protected String getId() {return id;}
	protected void setTitle(String title) {this.title = title;}
	protected String getTitle() {return title;}
	protected void setUpdated(String updated) {this.updated = updated;}
	protected String getUpdated() { return updated;}
}

