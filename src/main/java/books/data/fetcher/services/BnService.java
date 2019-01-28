package books.data.fetcher.services;

import books.data.fetcher.entity.Book;
import books.data.fetcher.entity.BookList;
import books.data.fetcher.enums.ResponseFileType;
import books.data.fetcher.enums.UrlType;
import books.data.fetcher.integration.BookSearchRequestBody;
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

    public BookList getBook(BookSearchRequestBody bookSearchRequestBody) {
        UrlBuilder urlBuilder = new UrlBuilder();
        URL methodUrl = urlBuilder.createUrl(UrlType.BN).setFileType(ResponseFileType.JSON)
                .withIsbn(bookSearchRequestBody.getIsbn())
                .withTopic(bookSearchRequestBody.getTopic())
                .withTopicPlace(bookSearchRequestBody.getTopicPlace())
                .withTopicTime(bookSearchRequestBody.getTopicTime())
                .withTopicWork(bookSearchRequestBody.getTopicWork())
                .withPublicationPlace(bookSearchRequestBody.getPublicationPlace())
                .withPublisher(bookSearchRequestBody.getPublisher())
                .withGenre(bookSearchRequestBody.getGenre())
                .withTimeOfCreation(bookSearchRequestBody.getTimeOfCreation())
                .withCulturalOrigin(bookSearchRequestBody.getCulturalOrigin())
                .withYearOfPublication(bookSearchRequestBody.getYearOfPublication())
                .withOriginalLanguage(bookSearchRequestBody.getOriginalLanguage())
                .withAuthor(bookSearchRequestBody.getAuthor())
                .withTitle(bookSearchRequestBody.getTitle())
                .withLimit(bookSearchRequestBody.getLimit())
                .build();

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(methodUrl, BookList.class);
        } catch (IOException e) {
            return null;
        }
    }
}
