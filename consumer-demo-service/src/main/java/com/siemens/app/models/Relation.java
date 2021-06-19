package com.siemens.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RelationId.class)
public class Relation {
	
	@Id
	private Long empId;
	@Id
	private String orgId;
	@Id
	private String assetId;
	
	public Relation() {
		
	}
	
	public Relation(Long empId, String orgId, String assetId) {
		super();
		this.empId = empId;
		this.orgId = orgId;
		this.assetId = assetId;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	
}
