import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void should_return_zero_when_input_is_empty(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("");

        Assertions.assertEquals(0,sum);
    }

    @Test
    public void should_return_one_when_input_number_is_equal_to_one(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("1");

        Assertions.assertEquals(1,sum);
    }

    @Test
    public void should_return_two_when_input_number_is_equal_to_two(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("2");

        Assertions.assertEquals(2,sum);
    }

    @Test
    public void should_return_three_when_input_number_is_equal_to_three(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("3");

        Assertions.assertEquals(3,sum);
    }
}
