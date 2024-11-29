package com.boonya.lab.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Pengjunlin
 * @date 2024/11/28
 */
@Document(indexName = "book")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String postDate;

    public Book() {
    }

    public Book(String id, String title, String author, String postDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.postDate = postDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", postDate='" + postDate + '\'' +
                '}';
    }
}
