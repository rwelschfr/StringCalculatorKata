public class StringCalculatorKata {

    public int add(String numbers) throws Exception {
        int result = 0;
        String[] split = numbers.split(",");
        if(split.length > 2) {
            throw new Exception("Too many numbers (more than 2)");
        }
        for(String number : split) {
            if(!number.isEmpty()) {
                result += Integer.valueOf(number);
            }
        }
        return result;
    }

}
