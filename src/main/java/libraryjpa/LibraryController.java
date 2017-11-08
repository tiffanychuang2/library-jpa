package libraryjpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {

	@Resource
	GenreRepository genreRepo;

	@Resource
	BookRepository bookRepo;

	@Resource
	AuthorRepository authorRepo;

	@RequestMapping("/")
	public String getAllBooksIndex(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}

	@RequestMapping("/books")
	public String getAllBooks(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}

	@RequestMapping("/book")
	public String getOneBook(@RequestParam String title, Model model) {
		model.addAttribute("book", bookRepo.findOne(title));
		return "book";
	}

	@RequestMapping("/authors")
	public String getAllAuthors(Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}

	@RequestMapping("/genres")
	public String getAllGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}

}
