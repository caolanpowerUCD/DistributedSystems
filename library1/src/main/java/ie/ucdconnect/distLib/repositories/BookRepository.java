package ie.ucdconnect.distLib.repositories;

import ie.ucdconnect.distLib.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
	Book findById(int id);
	List<Book> findAll();
	List<Book> findByTitle(String title);
	List<Book> findByAuthor(String author);
	List<Book> findByTitleLikeOrAuthorLike(String title, String author);
}