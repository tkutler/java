package com.toby.DojoNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.toby.DojoNinja.models.Dojo;
import com.toby.DojoNinja.models.Ninja;


public interface DojoRepository extends CrudRepository<Dojo, Long> {
	
	List<Dojo>findAll();

	
	

}
