package com.bookstore.Repository;

import com.bookstore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
	// You can add custom queries if needed, e.g., find by title, author, etc.
}
