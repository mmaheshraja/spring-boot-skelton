package com.siemens.app.models;


public class ResponseWrapper {
	
	
	
	private Asset asset;
	private Employee employee;
	private Organization organization;
	
	public ResponseWrapper() {
		
	}
	
	public ResponseWrapper(Asset asset, Employee employee, Organization organization) {
		super();
		this.asset = asset;
		this.employee = employee;
		this.organization = organization;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	
}
