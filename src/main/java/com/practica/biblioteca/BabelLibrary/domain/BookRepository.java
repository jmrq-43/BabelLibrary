package com.practica.biblioteca.BabelLibrary.domain.repository;

import com.practica.biblioteca.BabelLibrary.domain.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Optional<Book> fingById(String id);

    List<Book> findAll();

    void save(Book book);

    void delete(String id);

}
