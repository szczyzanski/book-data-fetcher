package books.data.fetcher.services;

import books.data.fetcher.entity.Book;
import books.data.fetcher.entity.BookList;
import books.data.fetcher.enums.ResponseFileType;
import books.data.fetcher.enums.UrlType;
import books.data.fetcher.utilities.UrlBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

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

    public BookList getBooksByAuthor(String author) {
        UrlBuilder urlBuilder = new UrlBuilder();
        URL methodUrl = urlBuilder.createUrl(UrlType.BN).setFileType(ResponseFileType.JSON).withAuthor(author).build();

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(methodUrl, BookList.class);
        } catch (IOException e) {
            return null;
        }
    }

    public BookList getBook(String isbn, String author, String title) {
        return null;
    }
}
