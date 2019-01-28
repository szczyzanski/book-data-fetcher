package books.data.fetcher.entity;

import books.data.fetcher.enums.BookFieldForParsing;
import books.data.fetcher.utilities.BnRecordParser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
        List<Book> books = new ArrayList<>();
        BnRecordParser bnRecordParser = new BnRecordParser();
        for (Map<String, Object> entry : bibs) {
            Book book = new Book();
            bnRecordParser.parseBook(book, entry,
                    Arrays.asList(BookFieldForParsing.TITLE, BookFieldForParsing.AUTHOR, BookFieldForParsing.SUBJECT,
                    BookFieldForParsing.SUBJECT_PLACE));
            books.add(book);
        }
        this.setBooks(books);
    }
}
