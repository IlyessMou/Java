package com.example.dojosAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojosAndNinjas.models.Ninja;
import com.example.dojosAndNinjas.services.DojoService;
import com.example.dojosAndNinjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {

    @Autowired
    private DojoService dojoService;

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/ninjas/new")
    public String newNinja(Model model) {
        model.addAttribute("ninja", new Ninja());
        model.addAttribute("dojos", dojoService.allDojos());
        return "newNinja.jsp";
    }

    @PostMapping("/ninjas")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.allDojos());
            return "newNinja.jsp";
        }
        ninjaService.createNinja(ninja);
        return "redirect:/dojos/" + ninja.getDojo().getId();
    }
}