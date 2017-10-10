package rs.ac.bg.fon.ai.milansusa.bookstore.persistance;

import java.util.Optional;

import rs.ac.bg.fon.ai.milansusa.bookstore.model.Author;
import rs.ac.bg.fon.ai.milansusa.bookstore.model.Book;
import rs.ac.bg.fon.ai.milansusa.bookstore.model.Review;
import rs.ac.bg.fon.ai.milansusa.bookstore.model.User;

public interface BookstorePersistence {

	Result<Author> getAllAuthors(int page, int limit, String query);

	Author getAuthor(long id);

	Result<Book> getAllBooks(int page, int limit, String query);

	Book getBook(long id);

	Result<Review> getAllReviews(int page, int limit, String query);

	Review getReview(long id);

	Result<Review> getBookReviews(long bookId, int page, int limit, String query);

	Optional<User> getUser(String username);
}