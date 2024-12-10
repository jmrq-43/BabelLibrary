package com.practica.biblioteca.interfaces.rest;

import com.practica.biblioteca.domain.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final com.practica.biblioteca.application.controller.BookController bookController;

    public BookController(com.practica.biblioteca.application.controller.BookController bookController) {
        this.bookController = bookController;
    }

    @PostMapping
    public Book addBook(@RequestParam String title, @RequestParam String author) {
        return bookController.addBook(title, author);
    }

    @GetMapping
    public List<Book> bookList(){
        return bookController.listBooks();
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookController.getAllBooks();
        return ResponseEntity.ok(books);
    }

}
