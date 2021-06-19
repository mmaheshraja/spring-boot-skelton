package com.siemens.app.models;

import java.io.Serializable;

public class RelationId implements Serializable {

    private static final long serialVersionUID = 1L;
	private Long empId;
	private String orgId;
	private String assetId;
	
	public RelationId() {
		
	}
	
	public RelationId(Long empId, String orgId, String assetId) {
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
