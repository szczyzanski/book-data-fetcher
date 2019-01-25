package books.data.fetcher.enums;

public enum ResponseFileType {
    JSON(".json");

    private String value;

    ResponseFileType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
