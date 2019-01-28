package books.data.fetcher.integration;

import books.data.fetcher.entity.Book;
import books.data.fetcher.entity.BookList;
import books.data.fetcher.mapping.Mapping.WebControllerMapping;
import books.data.fetcher.services.BnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(WebControllerMapping.API)
public class WebController {
    @Autowired
    private BnService bnService;

    @GetMapping(value = WebControllerMapping.GET_BOOK_BY_ISBN)
    public Book getBookByIsbn(@RequestParam("isbn") String isbn) {
        return bnService.getBookByIsbn(isbn);
    }

    @GetMapping(value = WebControllerMapping.GET_BOOK_BY_AUTHOR)
    public BookList getBooksByAuthor(@RequestParam("author") String author) {
        return bnService.getBooksByAuthor(author);
    }

}
