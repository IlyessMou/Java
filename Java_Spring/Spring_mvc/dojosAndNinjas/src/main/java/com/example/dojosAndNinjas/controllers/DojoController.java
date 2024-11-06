package com.example.dojosAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojosAndNinjas.models.Dojo;
import com.example.dojosAndNinjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

    @Autowired
    private DojoService dojoService;

    @GetMapping("/dojos/new")
    public String newDojo(Model model) {
        model.addAttribute("dojo", new Dojo());
        return "newDojo.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "newDojo.jsp";  
        }
        dojoService.createDojo(dojo);
        return "redirect:/ninjas/new";
    }
    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojo(id);
        model.addAttribute("dojo", dojo);
        return "dojoDetails.jsp";
    }
}