package jp.pigumer.boot.autoconfigure;

import jp.pigumer.demo.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Demo Auto Configuration.
 */
@Configuration
public class DemoAutoConfiguration {

    @Bean
    Foo foo() {
        return new Foo();
    }

}
