package books.data.fetcher.integration;

public class BookSearchRequestBody {

    private String isbn;
    private String topic;
    private String topicPlace;
    private String topicTime;
    private String topicWork;
    private String publicationPlace;
    private String publisher;
    private String genre;
    private String timeOfCreation;
    private String culturalOrigin;
    private String yearOfPublication;
    private String originalLanguage;
    private String author;
    private String title;
    private String limit;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicPlace() {
        return topicPlace;
    }

    public void setTopicPlace(String topicPlace) {
        this.topicPlace = topicPlace;
    }

    public String getTopicTime() {
        return topicTime;
    }

    public void setTopicTime(String topicTime) {
        this.topicTime = topicTime;
    }

    public String getTopicWork() {
        return topicWork;
    }

    public void setTopicWork(String topicWork) {
        this.topicWork = topicWork;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(String timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public String getCulturalOrigin() {
        return culturalOrigin;
    }

    public void setCulturalOrigin(String culturalOrigin) {
        this.culturalOrigin = culturalOrigin;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        final String LINE_SEPARATOR = "line.separator";
        return "BookSearchRequestBody{" + System.getProperty(LINE_SEPARATOR) + "isbn='" + isbn + '\'' +
                System.getProperty(LINE_SEPARATOR) + "topic='" + topic + '\'' + System.getProperty(LINE_SEPARATOR) +
                "topicPlace='" + topicPlace + '\'' + System.getProperty(LINE_SEPARATOR) + "topicTime='" + topicTime +
                '\'' + System.getProperty(LINE_SEPARATOR) + "topicWork='" + topicWork + '\'' +
                System.getProperty(LINE_SEPARATOR) + "publicationPlace='" + publicationPlace + '\'' +
                System.getProperty(LINE_SEPARATOR) + "publisher='" + publisher + '\'' +
                System.getProperty(LINE_SEPARATOR) + "genre='" + genre + '\'' + System.getProperty(LINE_SEPARATOR) +
                "timeOfCreation='" + timeOfCreation + '\'' + System.getProperty(LINE_SEPARATOR) + "culturalOrigin='" +
                culturalOrigin + '\'' + System.getProperty(LINE_SEPARATOR) + "yearOfPublication='" + yearOfPublication +
                '\'' + System.getProperty(LINE_SEPARATOR) + "originalLanguage='" + originalLanguage + '\'' +
                System.getProperty(LINE_SEPARATOR) + "author='" + author + '\'' + System.getProperty(LINE_SEPARATOR) +
                "title='" + title + '\'' + System.getProperty(LINE_SEPARATOR) + "limit='" + limit + '\'' +
                System.getProperty(LINE_SEPARATOR) + '}';
    }
}
