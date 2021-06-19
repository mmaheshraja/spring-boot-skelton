package com.siemens.app.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.siemens.app.models.Relation;
import com.siemens.app.models.ResponseWrapper;
import com.siemens.app.services.RelationService;

@RestController
public class FrontController {

	@Autowired
	RelationService service;
	
	@RequestMapping("/relations")
	public List<Relation> getAllRelations(){		
		return service.getAllRelations();
	}
	
	@RequestMapping("/relations/{empId}")
	public List<Relation> getAllRelationsPageable(@PathVariable("empId") Long id){		
		return service.getAllValues(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value= "/relations")
	public Relation addAsset(@RequestBody Relation rel){		
		return service.addRelation(rel);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value= "/assets")
	public Relation updateAsset(@RequestBody Relation rel){		
		return service.updateRelation(rel);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value= "/assets")
	public void deleteAsset(@RequestBody Relation rel){		
		service.deleteRelation(rel);
		
	}
	
	@RequestMapping("/employees/{empId}")
	public List<ResponseWrapper> getByEmpId(@PathVariable("empId") Long id){		
		return getResponse(service.getByEmpId(id));		
		
	}
	
	@RequestMapping("/assets/{assetId}")
	public List<ResponseWrapper> getByAssetId(@PathVariable("assetId") String id){		
		return getResponse(service.getByAssetId(id));
		
	}
	
	@RequestMapping("/organizations/{orgId}")
	public List<ResponseWrapper> getByOrgId(@PathVariable("orgId") String id){		
		return getResponse(service.getByOrgId(id));
		
	}
	
	private List<ResponseWrapper> getResponse(List<Relation> relations){
		List<ResponseWrapper> returnList=new ArrayList<>();
		
		relations.stream().forEach(r->{
			ResponseWrapper response = new ResponseWrapper();
			response.setEmployee(service.getEmployee(r.getEmpId()));
			response.setOrganization(service.getOrganization(r.getOrgId()));
			response.setAsset(service.getAsset(r.getAssetId()));
			returnList.add(response);
		});
		
		return returnList;
	}
}
