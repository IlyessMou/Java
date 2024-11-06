package com.example.burgerTracker.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.burgerTracker.models.Burger;
import com.example.burgerTracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
    private final BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping("/burgers")
    public String index(Model model, @ModelAttribute("burger") Burger burger) {
        List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }

    @PostMapping("/burgers")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burgers", burgerService.allBurgers());
            return "index.jsp";
        }
        burgerService.createBurger(burger);
        return "redirect:/burgers";
    }
    
    @GetMapping("/burgers/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerService.findBurger(id);
        model.addAttribute("burger", burger); 
        return "edit.jsp"; 
    }
    
    @PostMapping("/burgers/{id}")
    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burger", burger);
            return "edit.jsp"; 
        } else {
            burgerService.updateBurger(burger); 
            return "redirect:/burgers";
        }
    }
    @DeleteMapping("/burgers/{id}")
    public String destroy(@PathVariable("id") Long id) {
        burgerService.deleteBurger(id);
        return "redirect:/burgers";
    }


}