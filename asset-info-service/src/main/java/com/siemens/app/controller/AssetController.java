package com.siemens.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.siemens.app.models.Asset;
import com.siemens.app.services.AssetService;

@RestController
public class AssetController {

	@Autowired
	AssetService service;
	
	@RequestMapping("/assets")
	public List<Asset> getAllAssets(){		
		return service.getAllAssets();
	}
	
	@RequestMapping("/assets/{assetId}")
	public Asset getAsset(@PathVariable("assetId") String id){		
		return service.getAsset(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value= "/assets")
	public Asset addAsset(@RequestBody Asset org){		
		return service.addAsset(org);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value= "/assets")
	public Asset updateAsset(@RequestBody Asset org){		
		return service.updateAsset(org);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value= "/assets/{assetId}")
	public void deleteAsset(@PathVariable("assetId") String id){		
		service.deleteAsset(id);
		
	}
}
