package com.practica.biblioteca.BabelLibrary.application.usecase;

import com.practica.biblioteca.BabelLibrary.domain.model.Book;
import com.practica.biblioteca.BabelLibrary.domain.service.BookService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtainBooksUseCase {

    private final BookService bookService;

    public ObtainBooksUseCase(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> execute() {
        return bookService.getBooks();
    }
}
