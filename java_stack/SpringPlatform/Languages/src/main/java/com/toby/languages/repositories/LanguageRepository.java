package com.toby.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.toby.languages.models.ModelLanguage;

@Repository
public interface LanguageRepository extends CrudRepository <ModelLanguage,Long> {
	List<ModelLanguage>findAll();

}
