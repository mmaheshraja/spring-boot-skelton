package com.siemens.app.reposity;

import org.springframework.data.repository.CrudRepository;

import com.siemens.app.models.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String>{

}
