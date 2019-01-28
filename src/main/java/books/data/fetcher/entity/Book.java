package books.data.fetcher.entity;

import books.data.fetcher.enums.BookFieldForParsing;
import books.data.fetcher.utilities.BnRecordParser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    private String title;
    private String subject;
    private String author;
    private String subjectPlace;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubjectPlace() {
        return subjectPlace;
    }

    public void setSubjectPlace(String subjectPlace) {
        this.subjectPlace = subjectPlace;
    }

    @JsonProperty("bibs")
    private void unpackBibs(Map<String, Object>[] bibs) {
        BnRecordParser bnRecordParser = new BnRecordParser();
        bnRecordParser.parseBook(this, bibs[0],
                Arrays.asList(BookFieldForParsing.TITLE, BookFieldForParsing.AUTHOR, BookFieldForParsing.SUBJECT,
                        BookFieldForParsing.SUBJECT_PLACE));
    }
}
