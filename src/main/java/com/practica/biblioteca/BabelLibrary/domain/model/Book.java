package com.practica.biblioteca.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String id;
    private String title;
    private String author;

    @Builder
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
