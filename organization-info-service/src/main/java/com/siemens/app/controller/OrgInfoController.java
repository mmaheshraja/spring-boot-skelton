package com.siemens.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.siemens.app.models.Organization;
import com.siemens.app.services.OrganizationService;

@RestController
public class OrgInfoController {

	@Autowired
	OrganizationService service;
	
	@RequestMapping("/organizations")
	public List<Organization> getAllOrganizations(){		
		return service.getAllOrganizations();
	}
	
	@RequestMapping("/organizations/{orgId}")
	public Organization getOrganization(@PathVariable("orgId") String id){		
		return service.getOrganization(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value= "/organizations")
	public Organization addOrganization(@RequestBody Organization org){		
		return service.addOrganization(org);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value= "/organizations")
	public Organization updateOrganization(@RequestBody Organization org){		
		return service.updateOrganization(org);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value= "/organizations/{orgId}")
	public void deleteOrganization(@PathVariable("orgId") String id){		
		service.deleteOrganization(id);
		
	}
}
