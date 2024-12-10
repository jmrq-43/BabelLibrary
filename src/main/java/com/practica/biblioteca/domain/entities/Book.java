package com.practica.biblioteca.domain.entities;

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
    public Book(String name, String title, String author) {
        this.name = name;
        this.title = title;
        this.author = author;
    }
}
