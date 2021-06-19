package com.siemens.app.reposity;

import org.springframework.data.repository.CrudRepository;

import com.siemens.app.models.Asset;

public interface AssetRepository extends CrudRepository<Asset, String>{

}
