public class StringCalculatorKata {

    public int add(String numbers) throws Exception {
        int result = 0;
        String[] split = numbers.split(",");
        for(String number : split) {
            if(!number.isEmpty()) {
                result += Integer.valueOf(number);
            }
        }
        return result;
    }

}
