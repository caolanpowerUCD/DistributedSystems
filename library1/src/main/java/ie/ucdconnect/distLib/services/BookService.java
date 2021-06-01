package ie.ucdconnect.distLib.services;

import ie.ucdconnect.distLib.models.Book;
import ie.ucdconnect.distLib.repositories.BookRepository;
import ie.ucdconnect.distLib.repositories.FakeBookRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

	// @Autowired private BookRepository bookRepository;
	private FakeBookRepository bookRepository = new FakeBookRepository();

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public List<Book> searchBooks(String query) {
		// JPA doesn't allow for or queries with a single parameter. Simple solution is to just use the same parameter for each or.
		return bookRepository.findByTitleLikeOrAuthorLike(query, query);
	}

	@Nullable
	public Book createBook(String title, String author) {
		if (title == null || title.length() == 0) {
			return null;
		}
		if (author == null || author.length() == 0) {
			return null;
		}
		Book book = new Book(title, author);
		book = bookRepository.insert(book);
		return book;
	}

	@Nullable
	public Book updateBook(int bookId, Book newBook) {
		Book book = bookRepository.findById(bookId);
		if (book == null) {
			return bookRepository.save(book);	
		}
		return book;
	}

	@Nullable
	public Book deleteBook(int bookId) {
		Book book = bookRepository.findById(bookId);
		if (book == null) {
			return null;
		}
		bookRepository.delete(book);
		return book;
	}
}
