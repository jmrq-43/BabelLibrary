package com.practica.biblioteca.BabelLibrary.application;

import com.practica.biblioteca.BabelLibrary.domain.Book;
import com.practica.biblioteca.BabelLibrary.domain.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.saveBook(book);
    }

    public Book findBook(String id) {
        return bookRepository.getBook(id);
    }
}
