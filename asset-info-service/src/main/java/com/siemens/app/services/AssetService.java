package com.siemens.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.app.models.Asset;
import com.siemens.app.reposity.AssetRepository;

@Service
public class AssetService {

	
	@Autowired
	AssetRepository repository;
	
	public List<Asset> getAllAssets(){
		List<Asset> result = new ArrayList<Asset>();
		repository.findAll().forEach(result::add);
		return result;
	}
	
	public Asset getAsset(String id){		
		return repository.findById(id).get();
		
	}
	
	public Asset addAsset(Asset org){		
		return repository.save(org);
		
	}
	
	public Asset updateAsset(Asset org){		
		return repository.save(org);
		
	}
	public void deleteAsset(String id){		
		 repository.deleteById(id);
		
	}
}
