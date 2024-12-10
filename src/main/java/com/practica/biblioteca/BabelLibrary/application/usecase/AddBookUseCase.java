package com.practica.biblioteca.BabelLibrary.application.usecase;

import com.practica.biblioteca.BabelLibrary.domain.model.Book;
import com.practica.biblioteca.BabelLibrary.domain.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class AddBookUseCase {

    private final BookService bookService;

    public AddBookUseCase(BookService bookService) {
        this.bookService = bookService;
    }

    public Book execute(Book book) {
        return bookService.saveBook(book);
    }
}
