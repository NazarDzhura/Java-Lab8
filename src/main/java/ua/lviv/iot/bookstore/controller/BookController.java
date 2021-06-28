package ua.lviv.iot.bookstore.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.bookstore.model.Book;
import ua.lviv.iot.bookstore.service.BookService;

import java.util.Map;

@RestController
@RequestMapping("/book-store")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/books")
    public Book addBook(final @RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/books")
    public Map<Long, Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(final @PathVariable("id") Long id) {
        return bookService.getBook(id);
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(final @PathVariable("id") Long id, final @RequestBody Book book) {
        return bookService.updateBookById(id, book);
    }

    @DeleteMapping("/books")
    public void deleteAllBook() {
        bookService.deleteAllBooks();
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(final @PathVariable("id") Long id) {
        bookService.deleteBookById(id);
    }
}
