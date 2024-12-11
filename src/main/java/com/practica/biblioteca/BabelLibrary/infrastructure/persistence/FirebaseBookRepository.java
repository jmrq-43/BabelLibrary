package com.practica.biblioteca.BabelLibrary.infrastructure.persistence;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;
import com.practica.biblioteca.BabelLibrary.domain.Book;
import com.practica.biblioteca.BabelLibrary.domain.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ExecutionException;

@Repository
public class FirebaseBookRepository implements BookRepository {

    private final Firestore firestore;

    public FirebaseBookRepository(Firestore firestore) {
        this.firestore = firestore;
    }

    @Override
    public void saveBook(Book book) {
        try {
            WriteResult writeResult = firestore.collection("books")
                    .document(book.getId())
                    .set(book)
                    .get();
            System.out.println("saved book: " + writeResult.getUpdateTime());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error to saved book: " + e.getMessage(), e);
        }
    }

    @Override
    public Book getBook(String id) {
        try {
            DocumentReference docRef = firestore.collection("books").document(id);
            DocumentSnapshot document = docRef.get().get();
            return document.exists() ? document.toObject(Book.class) : null;
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error to get book: " + e.getMessage(), e);
        }
    }
}
