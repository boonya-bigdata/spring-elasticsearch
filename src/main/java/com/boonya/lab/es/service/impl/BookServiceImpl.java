package com.boonya.lab.es.service.impl;

import com.boonya.lab.es.entity.Book;
import com.boonya.lab.es.repository.BookRepository;
import com.boonya.lab.es.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Pengjunlin
 * @date 2024/11/28
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookRepository")
    private BookRepository bookRepository;


    @Override
    public Optional<Book> findById(String id) {
        //CrudRepository中的方法
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book blog) {
        return bookRepository.save(blog);
    }

    @Override
    public void delete(Book blog) {
        bookRepository.delete(blog);
    }

    @Override
    public Optional<Book> findOne(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
        return bookRepository.findByAuthor(author,pageRequest);
    }

    @Override
    public Page<Book> findByTitle(String title, PageRequest pageRequest) {
        return bookRepository.findByTitle(title,pageRequest);
    }
}
