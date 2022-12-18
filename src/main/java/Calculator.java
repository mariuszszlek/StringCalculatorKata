public class Calculator {

    public int add(String input) {
        if(input.isEmpty()){
            return 0;
        }

        if(input.matches("[0-9]")){
            return Integer.parseInt(input);
        }

        String[] numbers = input.split(",");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
