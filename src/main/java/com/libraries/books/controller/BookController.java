package com.libraries.books.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.libraries.books.model.Book;


@RestController
public class BookController {
    Map<Integer, Book> bookMap = new HashMap<>();
    static int count = 0;

    @PostMapping(value = "/books", consumes = "application/json", produces = "application/json")
    public Book createBooks(@RequestBody Book book) {
        book.setId(count++);
        //System.out.println(book);
        bookMap.put(book.getId(), book);
        return book;
    }

    @GetMapping("/books/{id}")
    public Book getBooks(@PathVariable Integer id) {
        return bookMap.get(id);
    }


    @DeleteMapping("/books/{id}")
    public Book deleteBooks(@PathVariable Integer id) {
        return bookMap.remove(id);
    }

    }


