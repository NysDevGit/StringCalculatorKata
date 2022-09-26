public class StringCalculator {
    public int add(String input) {
        if(input.isEmpty())
            return 0;
        if(input.length() == 1)
            return Integer.parseInt(input);
        else {
            String[] numbers = input.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
    }
}
