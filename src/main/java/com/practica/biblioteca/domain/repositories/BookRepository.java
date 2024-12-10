package com.practica.biblioteca.domain.repositories;

import com.practica.biblioteca.domain.entities.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> getAll();
}
