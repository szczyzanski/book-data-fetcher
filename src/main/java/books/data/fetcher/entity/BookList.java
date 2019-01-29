package books.data.fetcher.entity;

import books.data.fetcher.utilities.BnRecordParser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static books.data.fetcher.enums.BookFieldForParsing.AUTHOR;
import static books.data.fetcher.enums.BookFieldForParsing.DEMOGRAPHIC_GROUP;
import static books.data.fetcher.enums.BookFieldForParsing.FORM_OF_WORK;
import static books.data.fetcher.enums.BookFieldForParsing.GENRE;
import static books.data.fetcher.enums.BookFieldForParsing.ISBN;
import static books.data.fetcher.enums.BookFieldForParsing.KIND;
import static books.data.fetcher.enums.BookFieldForParsing.LANGUAGE_OF_ORIGINAL;
import static books.data.fetcher.enums.BookFieldForParsing.PUBLICATION_PLACE;
import static books.data.fetcher.enums.BookFieldForParsing.PUBLICATION_YEAR;
import static books.data.fetcher.enums.BookFieldForParsing.PUBLISHER;
import static books.data.fetcher.enums.BookFieldForParsing.SUBJECT;
import static books.data.fetcher.enums.BookFieldForParsing.SUBJECT_PLACE;
import static books.data.fetcher.enums.BookFieldForParsing.SUBJECT_TIME;
import static books.data.fetcher.enums.BookFieldForParsing.SUBJECT_WORK;
import static books.data.fetcher.enums.BookFieldForParsing.TIME_PERIOD_OF_CREATION;
import static books.data.fetcher.enums.BookFieldForParsing.TITLE;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BookList {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @JsonProperty("bibs")
    private void unpackBibs(Map<String, Object>[] bibs) {
        List<Book> booksList = new ArrayList<>();
        BnRecordParser bnRecordParser = new BnRecordParser();
        for (Map<String, Object> entry : bibs) {
            Book book = new Book();
            bnRecordParser.parseBook(book, entry,
                    Arrays.asList(TITLE, AUTHOR, SUBJECT, SUBJECT_PLACE, SUBJECT_TIME, SUBJECT_WORK, ISBN,
                            PUBLICATION_PLACE, PUBLISHER, KIND, FORM_OF_WORK, GENRE, TIME_PERIOD_OF_CREATION,
                            DEMOGRAPHIC_GROUP, PUBLICATION_YEAR, LANGUAGE_OF_ORIGINAL));
            booksList.add(book);
        }
        this.setBooks(booksList);
    }
}
