package com.boonya.lab.es.repository;

/**
 * @author Pengjunlin
 * @date 2024/11/28
 */

import com.boonya.lab.es.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * 接口关系：
 * ElasticsearchRepository --> ElasticsearchCrudRepository --> PagingAndSortingRepository --> CrudRepository
 */
@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    //Optional<Book> findById(String id);

    Page<Book> findByAuthor(String author, Pageable pageable);

    Page<Book> findByTitle(String title, Pageable pageable);

}
