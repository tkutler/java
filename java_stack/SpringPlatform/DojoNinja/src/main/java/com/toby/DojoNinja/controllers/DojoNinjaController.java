package com.toby.DojoNinja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toby.DojoNinja.models.Dojo;
import com.toby.DojoNinja.models.Ninja;
import com.toby.DojoNinja.services.DojoNinjaService;



@Controller
public class DojoNinjaController {
    private final DojoNinjaService dojoninjaService;
	
    //initializes services
    public DojoNinjaController(DojoNinjaService dojoninjaService) {
        this.dojoninjaService = dojoninjaService;
    }
    //to new dojo page
    @RequestMapping("/dojo/new")
    public String newDojo(@ModelAttribute("dojos") Dojo dojo) {
        return "/DojoNinja/newdojo.jsp";
    }
    //adds new dojo
    @RequestMapping(value="/newdojo", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojos") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/DojoNinja/newdojo.jsp";
        } else
        	System.out.println(dojo);
            dojoninjaService.createDojo(dojo);
            return "redirect:/dojo/new";
        }
    //to new ninjas page
    @RequestMapping("/ninjas/new")
    public String index(Model model, @ModelAttribute("ninjas") Ninja ninja) {
        List<Dojo> dojo = dojoninjaService.allDojos();
        model.addAttribute("dojos", dojo);
        return "/DojoNinja/newninja.jsp";
    }
    //to dojo info page 
    @RequestMapping(value="/dojos/{id}", method=RequestMethod.GET)
    public String show(Model model, @PathVariable(value="id") Long id) {
    	Dojo dojo = dojoninjaService.findNinjas(id);
    	List<Ninja> ninjas = dojo.getNinjas();	
    
    	model.addAttribute("ninjas", ninjas);
    	return "DojoNinja/bylocation.jsp";
    }
    @RequestMapping(value="/newninja", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("ninjas") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/DojoNinja/newninja.jsp";
        } else
        	System.out.println(ninja);
            dojoninjaService.createNinja(ninja);
            return "redirect:/dojo/new";
        }
}
