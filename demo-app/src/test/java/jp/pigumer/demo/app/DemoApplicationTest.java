package jp.pigumer.demo.app;

import jp.pigumer.demo.Foo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Demo Application Test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    Foo foo;

    @Autowired
    MessageSource messageSource;

    @Test
    public void autoconfigTest() {
        assertThat(foo, is(not(nullValue())));
        assertThat(foo.value, is("foo"));
    }

    @Test
    public void messageSourceTest() {
        String message = messageSource.getMessage("foo", null, Locale.JAPANESE);
        assertThat(message, is("FOO"));
    }
}
