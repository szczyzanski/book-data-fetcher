package books.data.fetcher.utilities;

import books.data.fetcher.enums.ResourceType;
import books.data.fetcher.enums.ResponseFileType;
import books.data.fetcher.enums.UrlParameter;
import books.data.fetcher.enums.UrlType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.EnumMap;
import java.util.Map;

public class UrlBuilder {
    private UrlType urlType;
    private ResponseFileType responseFileType;
    private EnumMap<UrlParameter, String> urlParameters = new EnumMap<>(UrlParameter.class);

    public UrlBuilder createUrl(UrlType urlType) {
        this.urlType = urlType;
        return this;
    }

    public UrlBuilder setFileType(ResponseFileType responseFileType) {
        this.responseFileType = responseFileType;
        return this;
    }

    public UrlBuilder withIsbn(String isbn) {
        urlParameters.put(UrlParameter.ISBN, isbn);
        return this;
    }

    public UrlBuilder withAuthor(String author) {
        urlParameters.put(UrlParameter.AUTHOR, author);
        return this;
    }

    public UrlBuilder withTopic(String topic) {
        urlParameters.put(UrlParameter.TOPIC, topic);
        return this;
    }

    public UrlBuilder withTopicPlace(String topicPlace) {
        urlParameters.put(UrlParameter.TOPIC_PLACE, topicPlace);
        return this;
    }

    public UrlBuilder withTopicTime(String topicTime) {
        urlParameters.put(UrlParameter.TOPIC_TIME, topicTime);
        return this;
    }

    public UrlBuilder withTopicWork(String topicWork) {
        urlParameters.put(UrlParameter.TOPIC_WORK, topicWork);
        return this;
    }

    public UrlBuilder withPublicationPlace(String publicationPlace) {
        urlParameters.put(UrlParameter.PUBLICATION_PLACE, publicationPlace);
        return this;
    }

    public UrlBuilder withPublisher(String publisher) {
        urlParameters.put(UrlParameter.PUBLISHER, publisher);
        return this;
    }

    public UrlBuilder withGenre(String genre) {
        urlParameters.put(UrlParameter.GENRE, genre);
        return this;
    }

    public UrlBuilder withTimeOfCreation(String timeOfCreation) {
        urlParameters.put(UrlParameter.TIME_OF_CREATION, timeOfCreation);
        return this;
    }

    public UrlBuilder withCulturalOrigin(String culturalOrigin) {
        urlParameters.put(UrlParameter.CULTURAL_ORIGIN, culturalOrigin);
        return this;
    }

    public UrlBuilder withYearOfPublication(String yearOfPublication) {
        urlParameters.put(UrlParameter.YEAR_OF_PUBLICATION, yearOfPublication);
        return this;
    }

    public UrlBuilder withOriginalLanguage(String originalLanguage) {
        urlParameters.put(UrlParameter.ORIGINAL_LANGUAGE, originalLanguage);
        return this;
    }

    public UrlBuilder withTitle(String title) {
        urlParameters.put(UrlParameter.TITLE, title);
        return this;
    }

    public UrlBuilder withLimit(String limit) {
        urlParameters.put(UrlParameter.LIMIT, limit);
        return this;
    }

    public URL build() {
        String host = getUrl(urlType);
        String fileType = responseFileType.getValue();
        StringBuilder parameters = new StringBuilder();
        for (Map.Entry<UrlParameter, String> parameter : urlParameters.entrySet()) {
            if (isPresent(parameter.getValue())) {
                parameters.append(formParameter(parameter));
            }
        }

        try {
            return new URL(host + fileType + "?" + parameters);
        } catch (MalformedURLException e) {
            return null;
        }
    }

    private boolean isPresent(String value) {
        return value != null && value.length() > 0;
    }

    private String formParameter(Map.Entry<UrlParameter, String> parameter) {
        return parameter.getKey().getValue() + "="
                    + parameter.getValue().replace(" ", "+") + "&amp;";
    }

    private String getUrl(UrlType urlType) {
        return PropertiesProvider.get(ResourceType.URL_TYPE, urlType.getValue());
    }
}
