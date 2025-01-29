package org.nour.booksmanagementapi.controllers;
import org.nour.booksmanagementapi.models.Book;
import org.nour.booksmanagementapi.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BooksRepository books; // REPO OF BOOKS TO CRUD USING IT

    @Autowired // INJECTING BOOKS REPO TO MAKE IT AVALIABLE HERE
    public BooksController (BooksRepository inject) {
        books = inject;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return books.findAll();
    }
    // IMPLEMENT THE REST OF THE MAPPINGS AND ADD SECURITY AND HANDLE EXCEPTIONS FOR SURE
}
