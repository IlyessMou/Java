package com.example.JPADemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.JPADemo.models.Book;
import com.example.JPADemo.services.BookService;

@Controller
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
    
    @PostMapping("/books")
    public String create(
        @RequestParam("title") String title,
        @RequestParam("description") String description,
        @RequestParam("language") String language,
        @RequestParam("pages") Integer pages) 
    {
        // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
        Book book = new Book(title, description, language, pages);
        bookService.createBook(book);
        return "redirect:/books";
    }
    
    @GetMapping("/books/new")
    public String newBookForm() {
        return "/books/new.jsp";
    }
}