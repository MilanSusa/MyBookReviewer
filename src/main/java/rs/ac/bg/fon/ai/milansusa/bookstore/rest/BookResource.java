package rs.ac.bg.fon.ai.milansusa.bookstore.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rs.ac.bg.fon.ai.milansusa.bookstore.model.Book;
import rs.ac.bg.fon.ai.milansusa.bookstore.rest.json.BookJsonSerializer;
import rs.ac.bg.fon.ai.milansusa.bookstore.services.BookService;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

	private BookService bookService = new BookService();

	@GET
	public String getBooks() {
//		return "["
//				+ "{"
//				+ "\"id\": 1,"
//				+ "\"title\": \"Think and Grow Rich\","
//				+ "\"releaseYear\": 1937"
//				+ "},"
//				+ "{"
//				+ "\"id\": 2,"
//				+ "\"title\": \"The Power of Now\","
//				+ "\"releaseYear\": 1997"
//				+ "}"
//				+ "]";
		
		List<Book> allBooks = bookService.getAllBooks();
		String response = BookJsonSerializer.serializeBooks(allBooks);
		return response;
	}

	@Path("/{id}/reviews")
	public String getReviewResource(@PathParam("id") long bookId) {
		if (bookId == 1) {
			return "[" 
					+ "{" 
					+ "\"id\": 1, "
					+ "\"reviewerFirstName\": \"Mika\", "
					+ "\"reviewerLastName\": \"Peric\", " 
					+ "\"rank\": 9.18 "
					+ "}" 
					+ "]";
		} else {
			return "[" 
					+ "{ " 
					+ "\"id\": 2,"
					+ "\"reviewerFirstName\":\"Jovana\", "
					+ "\"reviewerLastName\": \"Lazic\", " 
					+ "\"rank\": 8.54 "
					+ "}" 
					+ "]";
		}
	}
}
