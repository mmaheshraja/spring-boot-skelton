package com.siemens.app.models;



public class Organization {
	

	private String id;
	private String name;
	
	public Organization() {
		
	}

	public Organization(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
