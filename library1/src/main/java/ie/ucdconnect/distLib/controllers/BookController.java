package ie.ucdconnect.distLib.controllers;

import ie.ucdconnect.distLib.models.Book;
import ie.ucdconnect.distLib.services.BookService;
import ie.ucdconnect.distLib.util.Verify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

	@Autowired private BookService bookService;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks(@RequestParam(name = "searchTerm", required = false) String searchTerm) {
		if (!Verify.string(searchTerm)) { // No search term supplied
			// TODO: This should be "paged" or limited.
			return ResponseEntity.ok(bookService.getBooks());
		} else {
			return ResponseEntity.ok(bookService.searchBooks(searchTerm));
		}
	}

	@PostMapping("/books")
	public ResponseEntity<Integer> createBook(@RequestParam(name = "title") String title, @RequestParam(name = "author") String author) {
		if (!Verify.string(title)) {
			return ResponseEntity.badRequest().build();
		}
		if (!Verify.string(author)) {
			return ResponseEntity.badRequest().build();
		}
		Book book = bookService.createBook(title, author);
		return ResponseEntity.ok(book.id);
	}

	@PutMapping("/books")
	public ResponseEntity<Book> updateBook(@RequestParam(name = "id") int bookId, @RequestBody Book newBook) {
		if (!Verify.id(bookId)) {
			return ResponseEntity.badRequest().build();
		}
		
		Book book = bookService.updateBook(bookId, newBook);
		if (book == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(book);
	}

	@DeleteMapping("/books")
	public ResponseEntity<String> deleteBook(@RequestParam(name = "id") int bookId) {
		if (!Verify.id(bookId)) {
			return ResponseEntity.badRequest().build();
		}
		Book book = bookService.deleteBook(bookId);
		if (book == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().build();
	}
}