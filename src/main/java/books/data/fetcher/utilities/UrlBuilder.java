package books.data.fetcher.utilities;

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

    public URL build() {
        String host = urlType.getValue();
        String fileType = responseFileType.getValue();
        String parameters = "";
        for (Map.Entry<UrlParameter, String> parameter : urlParameters.entrySet()) {
            if (isPresent(parameter.getValue())) {
                parameters += formParameter(parameter);
            }
        }

        try {
            return new URL(host + fileType + parameters);
        } catch (MalformedURLException e) {
            return null;
        }
    }

    private boolean isPresent(String value) {
        return value != null && value.length() > 0;
    }

    private String formParameter(Map.Entry<UrlParameter, String> parameter) {
        return "?" + parameter.getKey().getValue() + "=" + parameter.getValue();
    }
}
