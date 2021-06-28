package ua.lviv.iot.bookstore.service;

import org.springframework.http.ResponseEntity;
import ua.lviv.iot.bookstore.model.Book;

import java.util.Map;

public interface BookService {

    Book createBook(Book book);

    Map<Long, Book> getAllBooks();

    Book getBook(Long id);

    ResponseEntity<Book> updateBookById(Long id, Book newBook);

    void deleteAllBooks();

    void deleteBookById(Long id);
}
