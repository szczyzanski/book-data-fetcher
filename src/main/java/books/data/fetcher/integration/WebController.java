package books.data.fetcher.integration;

import books.data.fetcher.mapping.Mapping.WebControllerMapping;
import books.data.fetcher.services.BnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(WebControllerMapping.API)
public class WebController {
    @Autowired
    private BnService bnService;

    @RequestMapping(value = WebControllerMapping.GET_BOOK_BY_ISBN, method = RequestMethod.GET)
    public Object getBookByIsbn(@PathVariable String isbn) {
        return bnService.getBookByIsbn(isbn);
    }

}
