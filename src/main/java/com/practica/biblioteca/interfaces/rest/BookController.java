package com.practica.biblioteca.interfaces.rest;

import com.practica.biblioteca.application.services.ManageBookService;
import com.practica.biblioteca.domain.entities.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final ManageBookService manageBookService;

    public BookController(ManageBookService manageBookService) {
        this.manageBookService = manageBookService;
    }

    @PostMapping
    public Book addBook(@RequestParam String title, @RequestParam String author) {
        return manageBookService.addBook(title, author);
    }

    @GetMapping
    public List<Book> bookList(){
        return manageBookService.listBooks();
    }

}
