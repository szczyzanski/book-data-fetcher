package books.data.fetcher.enums;

public enum UrlType {
    BN("bn");

    private String value;

    UrlType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
