package books.data.fetcher.enums;

public enum UrlParameter {
    ISBN("isbnIssn"), AUTHOR("author"), TOPIC("subject"), TOPIC_PLACE("subjectPlace"), TOPIC_TIME("subjectTime"),
    TOPIC_WORK("subjectWork"), PUBLICATION_PLACE("placeOfPublication"), PUBLISHER("publisher"), GENRE("genre"),
    TIME_OF_CREATION("timePeriodOfCreation"), CULTURAL_ORIGIN("demographicGroup"),
    YEAR_OF_PUBLICATION("publicationYear"), ORIGINAL_LANGUAGE("languageOfOriginal"), TITLE("title"), LIMIT("limit");

    private String value;

    UrlParameter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
