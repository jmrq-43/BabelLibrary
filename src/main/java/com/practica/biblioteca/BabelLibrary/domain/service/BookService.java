package com.practica.biblioteca.BabelLibrary.domain.service;

import com.practica.biblioteca.BabelLibrary.domain.model.Book;

import java.util.List;

public interface BookService {
    String  saveBook(Book book);

    List<Book> getBooks();
}
