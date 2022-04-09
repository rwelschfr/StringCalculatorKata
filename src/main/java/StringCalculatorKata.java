public class StringCalculatorKata {

    public int add(String numbers) {
        int result = 0;
        String splitRegex = ",|\n";

        if(numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, index);
            splitRegex = splitRegex + "|" + delimiter;
            numbers = numbers.substring(index + 1);
        }

        String[] split = numbers.split(splitRegex);
        for(String number : split) {
            if(!number.isEmpty()) {
                result += Integer.valueOf(number);
            }
        }
        return result;
    }

}
