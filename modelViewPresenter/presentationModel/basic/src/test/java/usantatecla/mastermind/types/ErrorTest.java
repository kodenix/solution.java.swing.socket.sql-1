package usantatecla.mastermind.types;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ErrorTest {

    Error error;

    @Test
    void testGivenNullErrorWhenIsNullThenReturnsTrue() {
        this.error = Error.NULL;
        assertThat(this.error.isNull(), is(true));
    }

    @Test
    void testGivenNotNullErrorWhenIsNullThenReturnsFalse() {
        this.error = Error.DUPLICATED;
        assertThat(this.error.isNull(), is(false));
    }
}
