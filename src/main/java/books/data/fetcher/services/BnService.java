package books.data.fetcher.services;

import books.data.fetcher.enums.ResponseFileType;
import books.data.fetcher.enums.UrlType;
import books.data.fetcher.utilities.UrlBuilder;
import books.data.fetcher.entity.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

@Service
public class BnService {

    public Book getBookByIsbn(String isbn) {
        UrlBuilder urlBuilder = new UrlBuilder();
        URL methodUrl = urlBuilder.createUrl(UrlType.BN).setFileType(ResponseFileType.JSON).withIsbn(isbn).build();

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(methodUrl, Book.class);
        } catch (IOException e) {
            return null;
        }
    }
}
