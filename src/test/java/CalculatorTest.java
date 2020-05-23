import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroWhenEmptyStringGiven() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldReturnNumberWhenNumberGiven() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);
    }
}
