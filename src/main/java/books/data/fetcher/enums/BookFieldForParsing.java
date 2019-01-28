package books.data.fetcher.enums;

public enum BookFieldForParsing {
    TITLE("title"), SUBJECT("subject"), AUTHOR("author"), SUBJECT_PLACE("subjectPlace");

    private String value;

    BookFieldForParsing(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
