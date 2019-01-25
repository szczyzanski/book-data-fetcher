package books.data.fetcher.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private String title;
    private String subject;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("bibs")
    private void unpackBibs(Map<String, Object>[] bibs) {
        this.title = bibs[0].get("title").toString();
        this.subject = bibs[0].get("subject").toString();
        this.author = bibs[0].get("author").toString();
    }
}
