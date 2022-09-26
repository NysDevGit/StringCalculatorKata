import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void should_return_zero_when_input_is_empty(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("");

        Assertions.assertEquals(0,sum);
    }
}
