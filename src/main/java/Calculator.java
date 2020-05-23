public class Calculator {
    public int add(String numbers) {
        if ("".equals(numbers))
            return 0;
        else {
            String[] individualNumbers = numbers.split(",");
            if (individualNumbers.length == 1) {
                return getIntFrom(individualNumbers[0]);
            }
            return getIntFrom(individualNumbers[0]) + getIntFrom(individualNumbers[1]);
        }
    }

    private int getIntFrom(String individualNumber) {
        return Integer.parseInt(individualNumber);
    }
}
