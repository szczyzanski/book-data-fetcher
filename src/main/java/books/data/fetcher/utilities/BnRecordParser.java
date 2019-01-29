package books.data.fetcher.utilities;

import books.data.fetcher.entity.Book;
import books.data.fetcher.enums.BookFieldForParsing;

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

public class BnRecordParser {

    public void parseBook(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        parseTitle(book, bibs, fields);
        parseAuthor(book, bibs, fields);
        parseSubject(book, bibs, fields);
        parseSubjectPlace(book, bibs, fields);
        parseSubjectTime(book, bibs, fields);
        parseDemographicGroup(book, bibs, fields);
        parseFormOfWork(book, bibs, fields);
        parseGenre(book, bibs, fields);
        parseIsbn(book, bibs, fields);
        parseKind(book, bibs, fields);
        parseLanguageOfOriginal(book, bibs, fields);
        parsePublicationPlace(book, bibs, fields);
        parsePublicationYear(book, bibs, fields);
        parsePublisher(book, bibs, fields);
        parseSubjectWork(book, bibs, fields);
        parseTimePeriodOfCreation(book, bibs, fields);
    }

    private void parseTitle(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(TITLE)) {
            String title = bibs.get(TITLE.getValue()).toString();
            book.setTitle(title);
        }
    }

    private void parseAuthor(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(AUTHOR)) {
            String author = bibs.get(AUTHOR.getValue()).toString();
            book.setAuthor(author);
        }
    }

    private void parseSubject(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(SUBJECT)) {
            String subject = bibs.get(SUBJECT.getValue()).toString();
            book.setSubject(subject);
        }
    }

    private void parseSubjectPlace(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(SUBJECT_PLACE)) {
            String subjectPlace = bibs.get(SUBJECT_PLACE.getValue()).toString();
            book.setSubjectPlace(subjectPlace);
        }
    }

    private void parseSubjectTime(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(SUBJECT_TIME)) {
            String subjectTime = bibs.get(SUBJECT_TIME.getValue()).toString();
            book.setSubjectTime(subjectTime);
        }
    }

    private void parseDemographicGroup(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(DEMOGRAPHIC_GROUP)) {
            String demographicGroup = bibs.get(DEMOGRAPHIC_GROUP.getValue()).toString();
            book.setDemographicGroup(demographicGroup);
        }
    }

    private void parseFormOfWork(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(FORM_OF_WORK)) {
            String formOfWork = bibs.get(FORM_OF_WORK.getValue()).toString();
            book.setFormOfWork(formOfWork);
        }
    }

    private void parseGenre(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(GENRE)) {
            String genre = bibs.get(GENRE.getValue()).toString();
            book.setGenre(genre);
        }
    }

    private void parseIsbn(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(ISBN)) {
            String isbn = bibs.get(ISBN.getValue()).toString();
            book.setIsbn(isbn);
        }
    }

    private void parseKind(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(KIND)) {
            String kind = bibs.get(KIND.getValue()).toString();
            book.setKind(kind);
        }
    }

    private void parseLanguageOfOriginal(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(LANGUAGE_OF_ORIGINAL)) {
            String language = bibs.get(LANGUAGE_OF_ORIGINAL.getValue()).toString();
            book.setLanguageOfOriginal(language);
        }
    }

    private void parsePublicationPlace(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(PUBLICATION_PLACE)) {
            String publicationPlace = bibs.get(PUBLICATION_PLACE.getValue()).toString();
            book.setPublicationPlace(publicationPlace);
        }
    }

    private void parsePublicationYear(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(PUBLICATION_YEAR)) {
            String publicationYear = bibs.get(PUBLICATION_YEAR.getValue()).toString();
            book.setPublicationYear(publicationYear);
        }
    }

    private void parsePublisher(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(PUBLISHER)) {
            String publisher = bibs.get(PUBLISHER.getValue()).toString();
            book.setPublisher(publisher);
        }
    }

    private void parseSubjectWork(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(SUBJECT_WORK)) {
            String subjectWork = bibs.get(SUBJECT_WORK.getValue()).toString();
            book.setSubjectWork(subjectWork);
        }
    }

    private void parseTimePeriodOfCreation(Book book, Map<String, Object> bibs, List<BookFieldForParsing> fields) {
        if (fields.contains(TIME_PERIOD_OF_CREATION)) {
            String timePeriodOfCreation = bibs.get(TIME_PERIOD_OF_CREATION.getValue()).toString();
            book.setTimePeriodOfCreation(timePeriodOfCreation);
        }
    }
}
