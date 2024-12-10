package com.practica.biblioteca.BabelLibrary.infrastructure.repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.practica.biblioteca.BabelLibrary.domain.model.Book;
import com.practica.biblioteca.BabelLibrary.domain.service.BookService1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FirebaseService1 implements BookService1 {

    private final Firestore firestore;

    public FirebaseService1(Firestore firestore) {
        this.firestore = firestore;
    }

    @Override
    public Book save(Book book) {
        DocumentReference documentRef = firestore.collection("books").document();
        book.setId(documentRef.getId());
        ApiFuture<WriteResult> resul = documentRef.set(book);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        try {
            ApiFuture<QuerySnapshot> query = firestore.collection("books").get();
            for (DocumentSnapshot doc : query.get().getDocuments()) {
                books.add(doc.toObject(Book.class));
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
