package com.practica.biblioteca.BabelLibrary.infrastructure.persistence;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.practica.biblioteca.BabelLibrary.domain.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FirebaseService {

    private final DatabaseReference librosRef = FirebaseDatabase.getInstance().getReference("libros");

    public String agregarLibro(Book book) {
        String id = librosRef.push().getKey();
        book.setId(id);
        librosRef.child(id).setValueAsync(book);
        return id;
    }

    public List<Book> obtenerLibros() {
        return new ArrayList<>();
    }
}

