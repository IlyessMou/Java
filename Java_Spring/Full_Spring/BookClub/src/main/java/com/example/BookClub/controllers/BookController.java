package com.example.BookClub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.BookClub.models.Book;
import com.example.BookClub.models.LoginUser;
import com.example.BookClub.models.User;
import com.example.BookClub.services.BookService;
import com.example.BookClub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

    @Autowired
    private UserService users;
    @Autowired
    private BookService books;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        User user = users.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = users.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model, HttpSession session) {
        if(session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        model.addAttribute("books", books.all());
        model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
        return "home.jsp";
    }

    @GetMapping("/addPage")
    public String addPage(@ModelAttribute("book") Book book, Model model, HttpSession session) {
        User user = users.findById((Long)session.getAttribute("userId"));
        model.addAttribute("user", user);
        return "addPage.jsp";
    }

    @PostMapping("/books")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "addPage.jsp";
        }
        books.create(book);
        return "redirect:/home";
    }

    @GetMapping("/books/{id}")
    public String showPage(Model model, @PathVariable("id") Long id, HttpSession session) {
        if(session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        Book book = books.findById(id);
        model.addAttribute("book", book);
        model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
        return "book.jsp";
    }

    @GetMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
        Book book = books.findById(id);
        if (book == null) {
            return "redirect:/home";
        }
        Long loggedInUserId = (Long) session.getAttribute("userId");
        if (book.getUser().getId().equals(loggedInUserId)) {
            model.addAttribute("book", book);
            return "edit.jsp";
        }
        return "redirect:/home";
    }

    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
        Book existingBook = books.findById(id);
        if (existingBook == null) {
            return "redirect:/home";
        }
        Long loggedInUserId = (Long) session.getAttribute("userId");
        if (!existingBook.getUser().getId().equals(loggedInUserId)) {
            return "redirect:/home";
        }

        if (result.hasErrors()) {
            return "edit.jsp";
        }

        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setThoughts(book.getThoughts());

        books.create(existingBook); 
        return "redirect:/books/" + existingBook.getId();
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
        Book book = books.findById(id);
        if (book == null) {
            return "redirect:/home";
        }
        Long loggedInUserId = (Long) session.getAttribute("userId");
        if (book.getUser().getId().equals(loggedInUserId)) {
            books.delete(id);
        }
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
