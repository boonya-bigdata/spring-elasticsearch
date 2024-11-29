package com.boonya.lab.es.service;

import com.boonya.lab.es.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

/**
 * @author Pengjunlin
 * @date 2024/11/28
 */
public interface BookService {

    Optional<Book> findById(String id);

    Book save(Book blog);

    void delete(Book blog);

    Optional<Book> findOne(String id);

    List<Book> findAll();

    Page<Book> findByAuthor(String author, PageRequest pageRequest);

    Page<Book> findByTitle(String title, PageRequest pageRequest);
}
