package com.example.mybookstore_backend.Service;

import com.example.mybookstore_backend.models.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(int id);
    public Book getBooksByTitle(String title);
}
