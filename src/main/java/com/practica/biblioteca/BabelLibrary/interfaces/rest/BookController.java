package com.practica.biblioteca.BabelLibrary.interfaces.rest;

import com.practica.biblioteca.BabelLibrary.application.usecase.AddBookUseCase;
import com.practica.biblioteca.BabelLibrary.application.usecase.ObtainBooksUseCase;
import com.practica.biblioteca.BabelLibrary.domain.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final AddBookUseCase addBookUseCase;
    private final ObtainBooksUseCase obtainBooksUseCase;

    public BookController(AddBookUseCase addBookUseCase, ObtainBooksUseCase obtainBooksUseCase) {
        this.addBookUseCase = addBookUseCase;
        this.obtainBooksUseCase = obtainBooksUseCase;
    }

    @PostMapping
    public ResponseEntity<String> agregarLibro(@RequestBody Book book) {
        String id = String.valueOf(addBookUseCase.execute(book));
        return ResponseEntity.ok("book added with ID: " + id);
    }

    @GetMapping
    public ResponseEntity<List<Book>> obtenerLibros() {
        List<Book> books = obtainBooksUseCase.execute();
        return ResponseEntity.ok(books);
    }
}
