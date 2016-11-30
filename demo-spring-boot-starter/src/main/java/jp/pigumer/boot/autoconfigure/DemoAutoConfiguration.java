package jp.pigumer.boot.autoconfigure;

import jp.pigumer.demo.Foo;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Demo Auto Configuration.
 */
@Configuration
public class DemoAutoConfiguration {

    @Bean
    Foo foo() {
        return new Foo();
    }

    @Bean
    MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("jp.pigumer.message.Messages");
        messageSource.setFallbackToSystemLocale(false);
        return messageSource;
    }
}
