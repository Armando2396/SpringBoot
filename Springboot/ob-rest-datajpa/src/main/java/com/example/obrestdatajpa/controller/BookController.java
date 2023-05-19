package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BookController {
    // atributos
    private BookRepository bookRepository;

    //contructores
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    // CRUD sobre la entidad Book

    // Buscar todos los libros
    @GetMapping("/api/books")
    public List<Book> findAll(){
        //recuperar y devolver los libros de base de datos
        return bookRepository.findAll();
    }

    //buscar un solo libro en base de datos segun su id
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id){
        //El PathVariable enlaza el id con el id del getMapping(url)
        Optional<Book> bookOptional = bookRepository.findById(id);

        if (bookOptional.isPresent())
            return ResponseEntity.ok(bookOptional.get());
        else
            return ResponseEntity.notFound().build();
    }

    // crear un nuevo libro en base de datos
    @PostMapping("/api/books/")
    public Book create(@RequestBody Book book){
        //guardar el libro recibido por parametro en la base de datos
        return bookRepository.save(book);
    }

    //actualizar un libro existente en base de datos

    //borrar un libro en base de datos

}
