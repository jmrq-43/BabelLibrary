package com.practica.biblioteca.BabelLibrary.domain;

public interface BookRepository {
    void saveBook(Book book);
    Book getBook(String id);
}
