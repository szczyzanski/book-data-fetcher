package books.data.fetcher.configuration;

import books.data.fetcher.integration.WebController;
import books.data.fetcher.services.BnService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BooksConfiguration {

    @Bean
    public BnService bnService() {
        return new BnService();
    }

    @Bean
    public WebController webController(BnService bnService) {
        return new WebController(bnService);
    }
}
