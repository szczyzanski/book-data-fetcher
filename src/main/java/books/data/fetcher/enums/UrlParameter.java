package books.data.fetcher.enums;

public enum UrlParameter {
    ISBN("isbnIssn"), AUTHOR("author");

    private String value;

    UrlParameter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
