package com.practica.biblioteca.BabelLibrary.infrastructure.repository;

import com.practica.biblioteca.BabelLibrary.domain.model.Book;
import com.practica.biblioteca.BabelLibrary.domain.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<Book> libros = new ArrayList<>();

    @Override
    public String saveBook(Book libro) {
        libros.add(libro);
        return libro.getId();
    }

    @Override
    public List<Book> getBooks() {
        return libros;
    }
}
