package com.toby.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.toby.languages.models.ModelLanguage;
import com.toby.languages.repositories.LanguageRepository;



@Service
public class LanguageService {
    // adding the language repository as a dependency
    private final LanguageRepository languageRepository;
    
    
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    // returns all the languages
    public List<ModelLanguage> allLanguages() {
        return languageRepository.findAll();
    }
    // creates a language
    public ModelLanguage createLanguage(ModelLanguage l) {
    	System.out.println("in service");
        return languageRepository.save(l);
    }
    //deletes a language
    public void deleteLanguage(Long id) {
    	System.out.println("in service");
    	languageRepository.deleteById(id);
    }
   
    // updates a language
    public ModelLanguage updateLanguage(ModelLanguage updateLanguage) {
 	   return languageRepository.save(updateLanguage);
 	   
    }
    //updates a language
    public ModelLanguage updateLanguage(Long id,  String title,  String creator, String currentVersion) {
    	ModelLanguage updateLanguage= languageRepository.findById(id).get();
    	updateLanguage.setTitle(title);
    	updateLanguage.setCreator(creator);
    	updateLanguage.setCurrentVersion(currentVersion);
    	return languageRepository.save(updateLanguage);
    	
    }
    // retrieves a language
    public ModelLanguage findLanguage(Long id) {
        Optional<ModelLanguage> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
}
