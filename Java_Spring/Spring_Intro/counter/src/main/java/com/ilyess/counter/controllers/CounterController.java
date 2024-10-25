package com.ilyess.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

    @RequestMapping("/")
    public String index(HttpSession session) {
    	// If the count is not already in session
        if (session.getAttribute("count") == null) {
        	// Use setAttribute to initialize the count in session
            session.setAttribute("count", 0); 
        } else {
        	// increment the count by 1 using getAttribute and setAttribute
            int currentCount = (Integer) session.getAttribute("count");
            session.setAttribute("count", currentCount + 1);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String showCounter(HttpSession session, Model model) {
        Integer count = (Integer) session.getAttribute("count");
        // dealing with the case where the visitor visists the counter before the main page
        model.addAttribute("count", count != null ? count : 0);
        return "counter.jsp";
    }

    //Ninja Bonus 1
    @GetMapping("/doubleCounter")
    public String doubleCounter(HttpSession session) {
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        } else {
            int count = (int) session.getAttribute("count");
            session.setAttribute("count", count + 2);
        }
        return "doubleCounter.jsp";
    }

    //Ninja Bonus 2
    @RequestMapping("/reset")
    public String resetCounter(HttpSession session) {
        session.setAttribute("count", 0); 
        return "redirect:/counter";
    }
}
