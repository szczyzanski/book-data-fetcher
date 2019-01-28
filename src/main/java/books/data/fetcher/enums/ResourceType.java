package books.data.fetcher.enums;

public enum ResourceType {
    URL_TYPE("urltype");

    private String value;

    ResourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
