package books.data.fetcher.enums;

public enum BookFieldForParsing {
    TITLE("title"), SUBJECT("subject"), AUTHOR("author"), SUBJECT_PLACE("subjectPlace"), SUBJECT_TIME("subjectTime"),
    SUBJECT_WORK("subjectWork"), PUBLICATION_PLACE("placeOfPublication"), PUBLISHER("publisher"), KIND("kind"),
    FORM_OF_WORK("formOfWork"), GENRE("genre"), TIME_PERIOD_OF_CREATION("timePeriodOfCreation"),
    DEMOGRAPHIC_GROUP("demographicGroup"), PUBLICATION_YEAR("publicationYear"),
    LANGUAGE_OF_ORIGINAL("languageOfOriginal"), ISBN("isbnIssn");

    private String value;

    BookFieldForParsing(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
