package books.data.fetcher.services;

import books.data.fetcher.entity.BookList;
import books.data.fetcher.enums.ResponseFileType;
import books.data.fetcher.enums.UrlType;
import books.data.fetcher.integration.BookSearchRequestBody;
import books.data.fetcher.mapping.Mapping;
import books.data.fetcher.utilities.UrlBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

import static books.data.fetcher.mapping.Mapping.BnServiceMessage.INFO_SEARCH_LINK;

@Service
public class BnService {

    private static final Logger log = LoggerFactory.getLogger(Mapping.Logger.FILE_LOGGER);

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

        log.info(INFO_SEARCH_LINK, methodUrl);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(methodUrl, BookList.class);
        } catch (IOException e) {
            return null;
        }
    }
}
