package com.ilyess.omikujiForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {
	 @GetMapping("/omikuji")
	    public String showOmikujiForm() {
	        return "omikuji.jsp";
	    }
	    @PostMapping("/omikuji")
	    public String processOmikujiForm(@RequestParam int number,
	                                       @RequestParam String city,
	                                       @RequestParam String person,
	                                       @RequestParam String hobby,
	                                       @RequestParam String livingThing,
	                                       @RequestParam String somethingNice,
	                                       HttpSession session) {
	        String fortune = String.format(
	            "In %d years, you will live in %s with %s as your roommate, %s for a living. The next time you see a %s, you will have good luck. Also, %s.",
	            number, city, person, hobby, livingThing, somethingNice
	        );
	        session.setAttribute("fortune", fortune);
	        return "redirect:/omikuji/show";
	    }

	    @GetMapping("/omikuji/show")
	    public String showFortune(HttpSession session, Model model) {
	        String fortune = (String) session.getAttribute("fortune");
	        model.addAttribute("fortune", fortune);
	        return "fortune.jsp";
	    }

}
