package com.ilyess.ninjaGold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class GoldController {
    private final Random random = new Random();
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy h:mm a"); // Date format

    @PostMapping("/processGold")
    public String processGold(@RequestParam("activity") String activity, HttpSession session) {
        int gold = 0;
        String message = "";
        switch (activity) {
            case "farm":
                gold = random.nextInt(11) + 10;
                message = "You entered a farm and earned " + gold + " gold!";
                break;
            case "cave":
                gold = random.nextInt(6) + 5;
                message = "You entered a cave and earned " + gold + " gold!";
                break;
            case "house":
                gold = random.nextInt(4) + 2;
                message = "You entered a house and earned " + gold + " gold!";
                break;
            case "quest":
                gold = random.nextInt(101) - 50;
                message = gold >= 0 ? "You completed a quest and earned " + gold + " !" : "You failed a quest and lost " + (-gold) + " gold. Ouch.";
                break;
        }
        Integer currentGold = (Integer) session.getAttribute("gold");
        if (currentGold == null) {
            currentGold = 0;
        }
        currentGold += gold;
        session.setAttribute("gold", currentGold);

        ArrayList<String> activityLog = (ArrayList<String>) session.getAttribute("activityLog");
        if (activityLog == null) {
            activityLog = new ArrayList<>();
        }
        String timestamp = dateFormat.format(new Date());
        activityLog.add(message + " ( " +timestamp + " )");
        session.setAttribute("activityLog", activityLog);

        return "redirect:/";
    }
    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        Integer gold = (Integer) session.getAttribute("gold");
        if (gold == null) {
            gold = 0;
        }
        model.addAttribute("gold", gold);
        model.addAttribute("activityLog", session.getAttribute("activityLog"));
        return "index.jsp";
    }
}
