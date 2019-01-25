package books.data.fetcher.enums;

public enum UrlType {
    BN("https://data.bn.org.pl/api/bibs");

    private String value;

    UrlType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
