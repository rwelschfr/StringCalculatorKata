public class StringCalculatorKata {

    public int add(String numbers) {
        int result = 0;
        String[] split = numbers.split(",|\n");
        for(String number : split) {
            if(!number.isEmpty()) {
                result += Integer.valueOf(number);
            }
        }
        return result;
    }

}
