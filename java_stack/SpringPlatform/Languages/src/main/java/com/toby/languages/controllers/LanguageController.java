package com.toby.languages.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toby.languages.models.ModelLanguage;
import com.toby.languages.services.LanguageService;



@Controller
public class LanguageController {
    private final LanguageService languageService;
    
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    
    @RequestMapping("/languages")
    public String index(Model model) {
        List<ModelLanguage> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "/languages/index.jsp";
    }
    @RequestMapping("/languages/new")
    public String newBook(@ModelAttribute("language") ModelLanguage language) {
        return "/languages/new.jsp";
    }
    @RequestMapping(value="/languages/delete/{id}", method=RequestMethod.GET)
    public String destroy(@PathVariable("id") Long id) {
    	System.out.println("in destroy control");
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
    @RequestMapping(value="/languages/edit/{id}", method=RequestMethod.POST)
    public String update(@Valid @ModelAttribute("language") ModelLanguage language, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("in error");
            return "/languages/edit.jsp";
        } else {
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping("/languages/edit/{id}")
    
    public String edit(@PathVariable("id") Long id, Model model) {
    	System.out.println("in showedit control");
        ModelLanguage language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/edit.jsp";
    }



    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") ModelLanguage language, BindingResult result) {
    	System.out.println("TESTTING");
    	System.out.println(result);
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/languages/index.jsp";
        } else {
        	System.out.println("in else");
        	System.out.println(language);
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
    
    
}
