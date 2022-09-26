public class StringCalculator {
    public int add(String input) {
        if (input.isEmpty())
            return 0;
        else {
            String[] numbers = input.split(",");
            return getSumOf(numbers);
        }
    }

    private int getSumOf(String[] numbers) {
        var sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
