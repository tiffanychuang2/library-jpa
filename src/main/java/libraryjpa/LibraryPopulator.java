package libraryjpa;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryPopulator implements CommandLineRunner {

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private BookRepository bookRepo;

	@Resource
	private AuthorRepository authorRepo;

	@Override
	public void run(String... args) throws Exception {
		Genre fiction = new Genre("Fiction");
		genreRepo.save(fiction);
		Genre nonFiction = new Genre("Non-Fiction");
		genreRepo.save(nonFiction);

		Author kathy = new Author("Kathy ", "Sierra");
		authorRepo.save(kathy);
		Author bert = new Author("Bert ", "Bates");
		authorRepo.save(bert);
		Author elisabeth = new Author("Elisabeth ", "Freeman");
		authorRepo.save(elisabeth);
		Author clifford = new Author("Clifford ", "Stoll");
		authorRepo.save(clifford);

		Book book1 = new Book(nonFiction, "Head First Design Patterns", kathy, bert);
		bookRepo.save(book1);
		Book book2 = new Book(nonFiction, "Head First Java", kathy, elisabeth);
		bookRepo.save(book2);
		Book book3 = new Book(fiction, "The Cukoo's Egg", clifford);
		bookRepo.save(book3);
	}
}
