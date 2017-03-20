package rs.ac.bg.fon.ai.milansusa.rest.resource;

import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rs.ac.bg.fon.ai.milansusa.rest.service.AuthorService;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorResource {

	AuthorService authorService = new AuthorService();

	@GET
	public String getAuthors() {
		return authorService.getAllAuthors();
	}
	
}