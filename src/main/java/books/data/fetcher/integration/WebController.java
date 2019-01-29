package books.data.fetcher.integration;

import books.data.fetcher.entity.BookList;
import books.data.fetcher.mapping.Mapping;
import books.data.fetcher.mapping.Mapping.WebControllerMapping;
import books.data.fetcher.services.BnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static books.data.fetcher.mapping.Mapping.WebControllerMessage.INFO_GET_BOOKS_BY_SEARCH_BODY;


@RestController
@RequestMapping(WebControllerMapping.API)
public class WebController {

    private static final Logger log = LoggerFactory.getLogger(Mapping.Logger.FILE_LOGGER);

    private BnService bnService;

    public WebController(BnService bnService) {
        this.bnService = bnService;
    }

    @PostMapping(WebControllerMapping.POST_SEARCH_BOOK_BY_PARAMETERS)
    public BookList getBooksBySearchBody(@RequestBody BookSearchRequestBody bookSearchRequestBody) {
        log.info(INFO_GET_BOOKS_BY_SEARCH_BODY, bookSearchRequestBody);

        return bnService.getBook(bookSearchRequestBody);
    }
}
