package com.siemens.app.reposity;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.siemens.app.models.Relation;

public interface RelationRepository extends PagingAndSortingRepository<Relation, String>{
	public List<Relation> findByEmpId(Long id);
	public List<Relation> findByOrgId(String id);
	public List<Relation> findByAssetId(String id);
	public List<Relation> findAllByEmpId(Long Id, Pageable pageable);
}
