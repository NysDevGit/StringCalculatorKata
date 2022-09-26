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

    @Test
    public void should_return_sum_when_there_are_two_numbers_in_input(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("1,1");

        Assertions.assertEquals(2,sum);
    }

    @Test
    public void should_return_sum_when_there_are_three_numbers_in_input(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("1,1,3");

        Assertions.assertEquals(5,sum);
    }

    @Test
    public void should_return_sum_when_there_are_four_numbers_in_input(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("1,1,3,4");

        Assertions.assertEquals(9,sum);
    }

    @Test
    public void should_return_sum_when_there_are_fiveour_numbers_in_input(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("1,1,3,4,5");

        Assertions.assertEquals(14,sum);
    }

    @Test
    public void should_return_sum_when_there_are_two_separators(){
        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.add("1\n2,3");

        Assertions.assertEquals(6,sum);
    }
}
