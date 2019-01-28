package books.data.fetcher.utilities;

import books.data.fetcher.entity.Book;
import books.data.fetcher.enums.BookFieldForParsing;

import java.util.List;
import java.util.Map;

public class BnRecordParser {

    public void parseBook(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        parseTitle(book, bibs, fields);
        parseAuthor(book, bibs, fields);
        parseSubject(book, bibs, fields);
        parseSubjectPlace(book, bibs, fields);
    }

    private void parseTitle(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(BookFieldForParsing.TITLE)) {
            String title = bibs.get(BookFieldForParsing.TITLE.getValue()).toString();
            book.setTitle(title);
        }
    }

    private void parseAuthor(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(BookFieldForParsing.AUTHOR)) {
            String author = bibs.get(BookFieldForParsing.AUTHOR.getValue()).toString();
            book.setAuthor(author);
        }
    }

    private void parseSubject(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(BookFieldForParsing.SUBJECT)) {
            String subject = bibs.get(BookFieldForParsing.SUBJECT.getValue()).toString();
            book.setSubject(subject);
        }
    }

    private void parseSubjectPlace(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(BookFieldForParsing.SUBJECT_PLACE)) {
            String subjectPlace = bibs.get(BookFieldForParsing.SUBJECT_PLACE.getValue()).toString();
            book.setSubjectPlace(subjectPlace);
        }
    }
}
