package books.data.fetcher.enums;

public enum UrlParameter {
    ISBN("isbnIssn");

    private String value;

    UrlParameter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
