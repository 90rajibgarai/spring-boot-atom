package com.spring.atom.transport;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
public class AtomLink {
	@XmlAttribute
	private String rel;
	@XmlAttribute
	private String href;
	@XmlAttribute
	private String type;

	AtomLink(){}
	AtomLink(String rel, String href, String type){
		this.rel = rel;
		this.href=href;
		this.type=type;
	}
	public String getRel() {return rel;}
	public String getHref() {return href;}
	public String getType() {return type;}
	
}

