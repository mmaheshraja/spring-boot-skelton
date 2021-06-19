package com.siemens.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.siemens.app.models.Asset;
import com.siemens.app.models.Employee;
import com.siemens.app.models.Organization;
import com.siemens.app.models.Relation;
import com.siemens.app.reposity.RelationRepository;

@Service
public class RelationService {
	
	@Value( "${siemens.employeeService}" )
	private String employeeService;
	
	@Value( "${siemens.organizationService}" )
	private String organizationService;
	
	@Value( "${siemens.assetService}" )
	private String assetService;

	@Autowired
    private RestTemplate restTemplate;
	
	@Autowired
	RelationRepository repository;
	
	public List<Relation> getAllRelations(){
		List<Relation> result = new ArrayList<Relation>();
		repository.findAll().forEach(result::add);
		return result;
	}
	public Relation addRelation(Relation rel){		
		return repository.save(rel);
		
	}
	
	public Relation updateRelation(Relation rel){		
		return repository.save(rel);
		
	}
	public void deleteRelation(Relation rel){		
		 repository.delete(rel);
		
	}
	public List<Relation> getByEmpId(Long id){
		return repository.findByEmpId(id); 

	}
	public List<Relation> getByOrgId(String id){		
		return repository.findByOrgId(id);

	}
	public List<Relation> getByAssetId(String id){		
		return repository.findByAssetId(id);

	}
	
	public List<Relation> getAllValues(Long id){
		Pageable firstPageWithTwoElements = PageRequest.of(0, 2); 
		return repository.findAllByEmpId(id,firstPageWithTwoElements);
	}
	
	@HystrixCommand(
			fallbackMethod = "getFallBackEmployee",
	        threadPoolKey = "getProductThreadPool",
	        commandKey = "getProductServiceCommand"
	)
	public Employee getEmployee (@PathVariable("empId") Long id) {
		return restTemplate.getForObject("http://"+employeeService+"/employees/" + id, Employee.class);
		
	}
	
	public Employee getFallBackEmployee (@PathVariable("empId") Long id) {
		return new Employee(id,"Employee Service is Down");
	}
	
	@HystrixCommand(
			fallbackMethod = "getFallBackOrganization",
			threadPoolKey = "getProductThreadPool",
	        commandKey = "getProductServiceCommand"
	)
	public Organization getOrganization (@PathVariable("orgId") String id) {
		return restTemplate.getForObject("http://"+organizationService+"/organizations/" + id, Organization.class);
		
	}
	
	public Organization getFallBackOrganization (@PathVariable("orgId") String id) {
		return new Organization(id,"Organization Service is Down");
	}
	
	@HystrixCommand(
			fallbackMethod = "getFallBackAsset",
			threadPoolKey = "getProductThreadPool",
	        commandKey = "getProductServiceCommand"
	)
	public Asset getAsset (@PathVariable("assetId") String id) {
		return restTemplate.getForObject("http://"+assetService+"/assets/" + id, Asset.class);
		
	}
	
	public Asset getFallBackAsset (@PathVariable("assetId") String id) {
		return new Asset(id,"Asset Service is Down");
	}
	
	
}
