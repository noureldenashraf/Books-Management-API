package org.nour.booksmanagementapi.repositories;

import org.nour.booksmanagementapi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book,Integer>{
    // USING JPA_REPOSITORY FOR THE BASIC CRUD OPERATIONS ALSO U CAN
    // ADD UR CUSTOM BUISNESS LOGIC HERE :)
}
