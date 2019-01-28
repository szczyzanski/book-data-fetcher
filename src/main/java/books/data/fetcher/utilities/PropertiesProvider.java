package books.data.fetcher.utilities;

import books.data.fetcher.enums.ResourceType;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesProvider {

    public static String get(ResourceType resourceType, String key) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceType.getValue(), Locale.getDefault());
        return resourceBundle.getString(key);
    }
}
