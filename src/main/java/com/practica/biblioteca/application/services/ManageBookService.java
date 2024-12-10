package com.practica.biblioteca.application.services;

import com.practica.biblioteca.domain.entities.Book;
import com.practica.biblioteca.domain.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageBookService {
    private final BookRepository bookRepository;

    public ManageBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(String title, String author) {
        Book book = new Book(null, title, author);
        return bookRepository.save(book);
    }

    public List<Book> listBooks() {
        return bookRepository.getAll();
    }
}
