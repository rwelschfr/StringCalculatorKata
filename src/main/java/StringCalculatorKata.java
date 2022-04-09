import java.util.ArrayList;
import java.util.List;

public class StringCalculatorKata {

    public int add(String numbers) throws Exception {
        int result = 0;
        String splitRegex = ",|\n";

        if(numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, index);
            splitRegex = splitRegex + "|" + delimiter;
            numbers = numbers.substring(index + 1);
        }

        String[] split = numbers.split(splitRegex);
        List<Integer> negatives = new ArrayList<>();
        for(String number : split) {
            if(!number.isEmpty()) {
                Integer integer = Integer.valueOf(number);
                if(integer < 0) {
                    negatives.add(integer);
                }
                result += integer;
            }
        }

        if(!negatives.isEmpty()) {
            String exceptionMsg = "negatives not allowed: ";
            for(Integer integer : negatives) {
                exceptionMsg = exceptionMsg + String.valueOf(integer);
                if(negatives.indexOf(integer) < negatives.size() - 1) {
                    exceptionMsg = exceptionMsg + ",";
                }
            }
            throw new Exception(exceptionMsg);
        }

        return result;
    }

}
