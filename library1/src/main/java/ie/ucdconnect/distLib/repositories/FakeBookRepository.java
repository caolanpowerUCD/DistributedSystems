package ie.ucdconnect.distLib.repositories;

import ie.ucdconnect.distLib.models.Book;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FakeBookRepository implements BookRepository {

	private final Map<Integer, Book> books = createMap();

	private Map<Integer, Book> createMap() {
		Map<Integer, Book> map = new HashMap<>();
		map.put(1, Book.createTestBook(1, "Test Book 1", "Author 1"));
		map.put(2, Book.createTestBook(2, "Test Book 2", "Author 1"));
		map.put(3, Book.createTestBook(3, "Test Book 3", "Author 1"));
		map.put(4, Book.createTestBook(4, "Test Book 4", "Author 2"));
		map.put(5, Book.createTestBook(5, "Test Book 5", "Author 2"));
		return map;
	}

	private int nextId = 6;

	private static boolean like(String string, String query) {
		return string.toLowerCase().contains(query.toLowerCase());
	}

	@Override
	public List<Book> findAll() {
		return List.copyOf(books.values());
	}

	@Override
	public List<Book> findByTitleLikeOrAuthorLike(String title, String author) {
		return books.values().stream().filter(b -> like(b.title, title) || like(b.author, author)).collect(Collectors.toList());
	}

	@Override
	public List<Book> findByTitle(String title) {
		return books.values().stream().filter(b -> b.title.equals(title)).collect(Collectors.toList());
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return books.values().stream().filter(b -> b.author.equals(author)).collect(Collectors.toList());
	}

	@Override
	public Book findById(int id) {
		return books.values().stream().filter(b -> b.id == id).findFirst().orElse(null);
	}

	@Override
	public <S extends Book> S insert(S s) {
		s.id = nextId;
		books.put(nextId, s);
		nextId++;
		return s;
	}

	@Override
	public void delete(Book book) {
		books.remove(book.id);
	}

	@Override
	public <S extends Book> S save(S s) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public Optional<Book> findById(String s) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public boolean existsById(String s) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public Iterable<Book> findAllById(Iterable<String> iterable) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public long count() {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void deleteById(String s) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void deleteAll(Iterable<? extends Book> iterable) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public List<Book> findAll(Sort sort) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> List<S> insert(Iterable<S> iterable) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> List<S> findAll(Example<S> example) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public Page<Book> findAll(Pageable pageable) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public void deleteAll() {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> Optional<S> findOne(Example<S> example) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> List<S> saveAll(Iterable<S> iterable) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> long count(Example<S> example) {
		throw new RuntimeException("Unimplemented");
	}

	@Override
	public <S extends Book> boolean exists(Example<S> example) {
		throw new RuntimeException("Unimplemented");
	}
}
