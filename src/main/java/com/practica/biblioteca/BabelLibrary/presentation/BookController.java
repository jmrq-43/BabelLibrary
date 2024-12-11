package com.practica.biblioteca.BabelLibrary.presentation;

import com.practica.biblioteca.BabelLibrary.application.BookService;
import com.practica.biblioteca.BabelLibrary.domain.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable String id) {
        return bookService.findBook(id);
    }
}
