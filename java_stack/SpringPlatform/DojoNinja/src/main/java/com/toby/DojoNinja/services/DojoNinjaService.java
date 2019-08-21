package com.toby.DojoNinja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.toby.DojoNinja.models.Dojo;
import com.toby.DojoNinja.models.Ninja;
import com.toby.DojoNinja.repositories.DojoRepository;
import com.toby.DojoNinja.repositories.NinjaRepository;


@Service 
public class DojoNinjaService {
	//adding dojo repository as dependency
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
    public DojoNinjaService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
        this.dojoRepository = dojoRepository;
        this.ninjaRepository = ninjaRepository;
    }
    // creates a dojo
    public Dojo createDojo(Dojo dojo) {
    	System.out.println("in  create dojo service");
        return dojoRepository.save(dojo);
    }
    // creates a dojo
    public Ninja createNinja(Ninja ninja) {
    	System.out.println("in  create ninja service");
        return ninjaRepository.save(ninja);
    }
    // returns all the dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    public Dojo findNinjas(Long id) {
        Optional<Dojo> optionalNinjas = dojoRepository.findById(id);
        if(optionalNinjas.isPresent()) {
            return optionalNinjas.get();
        } else {
            return null;
        }
    }

}

