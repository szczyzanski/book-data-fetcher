package books.data.fetcher.mapping;

public class Mapping {
    public static final class WebControllerMapping {
        public static final String API = "/bn-fetcher-api";
        public static final String POST_SEARCH_BOOK_BY_PARAMETERS = "/books";
    }
    public static final class WebControllerMessage {
        public static final String INFO_GET_BOOKS_BY_SEARCH_BODY = "Search books by: \n{}";
    }
    public static final class Logger {
        public static final String FILE_LOGGER = "file";
    }
    public static final class BnServiceMessage {
        public static final String INFO_SEARCH_LINK = "Fetching data from target: {}";
    }
}
