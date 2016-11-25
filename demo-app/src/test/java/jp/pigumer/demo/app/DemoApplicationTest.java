package jp.pigumer.demo.app;

import jp.pigumer.demo.Foo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void autoconfigTest() {
        assertThat(foo, is(not(nullValue())));
        assertThat(foo.value, is("foo"));
    }

}
