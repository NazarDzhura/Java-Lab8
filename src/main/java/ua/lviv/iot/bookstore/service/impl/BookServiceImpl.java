package ua.lviv.iot.bookstore.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.bookstore.model.Book;
import ua.lviv.iot.bookstore.service.BookService;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    private Long id = 0L;
    private Map<Long, Book> books = new HashMap<>();

    @Override
    public Book createBook(Book book) {
        books.put(++id, book);
        return book;
    }

    @Override
    public Map<Long, Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBook(Long id) {
        return books.get(id);
    }

    /**
     * Returns 200 status code and previous Book object if Book with this id exists
     * Returns 404 status code if Book with this id is missing
     */
    @Override
    public ResponseEntity<Book> updateBookById(Long id, Book newBook) {

        Book oldBook = getBook(id);
        return books.replace(id, newBook) != null ? new ResponseEntity<>(oldBook, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public void deleteAllBooks() {
        books = new HashMap<>();
    }

    @Override
    public void deleteBookById(Long id) {
        books.remove(id);
    }
}
