package com.example.saveTravels.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.saveTravels.models.Expense;
import com.example.saveTravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expenses")
    public String index(Model model, @ModelAttribute("expense") Expense expense) {
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    @PostMapping("/expenses")
    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("expenses", expenseService.allExpenses());
            return "index.jsp";
        }
        expenseService.createExpense(expense);
        return "redirect:/expenses";
    }
    
    @GetMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense); 
        return "edit.jsp"; 
    }
    
    @PostMapping("/expenses/{id}")
    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("expense", expense);
            return "edit.jsp"; 
        } else {
            expenseService.updateExpense(expense); 
            return "redirect:/expenses";
        }
    }
    
    @RequestMapping("/expenses/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "show.jsp";
    }
    @DeleteMapping("/expenses/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }


}