package jp.pigumer.message;

import java.util.ListResourceBundle;

/**
 * Resource Bundle.
 */
public class Messages extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                { "foo", "FOO" },
                { "bar", "BAR" },
                { "baz", "BAZ" }
        };
    }
}
