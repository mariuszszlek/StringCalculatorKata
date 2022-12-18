import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnZeroWhenGotEmptyString() {
        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldReturnNumberWhenGivenNumber() {
        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldAddTwoNumberSeparatedWithComma() {
        int result = calculator.add("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldAddThreeNumbersSeparatedWithComma() {
        int result = calculator.add("1,2,4");
        assertThat(result).isEqualTo(7);
    }

    @Test
    void shouldAddThreeNumbersSeparatedWithCommaAndNewLine() {
        int result = calculator.add("1,2\n5");
        assertThat(result).isEqualTo(8);
    }
}
