package com.bookstore.Controller;

import com.bookstore.Entity.Book;
import com.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = { "http://127.0.0.1:5500", "*" })
@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable Long id) {
		return bookService.getBookById(id);
	}

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}
}
