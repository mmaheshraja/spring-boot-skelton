package com.siemens.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.app.models.Organization;
import com.siemens.app.reposity.OrganizationRepository;

@Service
public class OrganizationService {

	
	@Autowired
	OrganizationRepository repository;
	
	public List<Organization> getAllOrganizations(){
		List<Organization> result = new ArrayList<Organization>();
		repository.findAll().forEach(result::add);
		return result;
	}
	
	public Organization getOrganization(String id){		
		return repository.findById(id).get();
		
	}
	
	public Organization addOrganization(Organization org){		
		return repository.save(org);
		
	}
	
	public Organization updateOrganization(Organization org){		
		return repository.save(org);
		
	}
	public void deleteOrganization(String id){		
		 repository.deleteById(id);
		
	}
}
