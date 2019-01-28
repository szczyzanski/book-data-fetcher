package books.data.fetcher.integration;

import books.data.fetcher.entity.Book;
import books.data.fetcher.entity.BookList;
import books.data.fetcher.mapping.Mapping.WebControllerMapping;
import books.data.fetcher.services.BnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(WebControllerMapping.API)
public class WebController {
    @Autowired
    private BnService bnService;

    @GetMapping(WebControllerMapping.GET_BOOK_BY_ISBN)
    public Book getBookByIsbn(@RequestParam("isbn") String isbn) {
        return bnService.getBookByIsbn(isbn);
    }

    @GetMapping(WebControllerMapping.GET_BOOK_BY_AUTHOR)
    public BookList getBooksByAuthor(@RequestParam("author") String author) {
        return bnService.getBooksByAuthor(author);
    }

    @PostMapping(WebControllerMapping.POST_SEARCH_BOOK_BY_PARAMETERS)
    public BookList getBooksWithSearchBody(@RequestBody BookSearchRequestBody bookSearchRequestBody) {
        return bnService.getBook(bookSearchRequestBody);
    }
}
