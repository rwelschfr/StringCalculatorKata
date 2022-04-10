import parser.Parser;

import java.util.List;
import java.util.stream.Collectors;

public class StringCalculatorKata {

    public int add(String numbers) throws Exception {
        if("".equals(numbers)) {
            return 0;
        }

        List<Integer> split = Parser.parseString(numbers);
        checkNegativeNumbers(split);

        return split.stream().reduce(0, Integer::sum);
    }

    private void checkNegativeNumbers(List<Integer> split) throws Exception {
        List<Integer> negatives = split.stream()
                .filter(i -> i < 0)
                .collect(Collectors.toList());

        if(!negatives.isEmpty()) {
            String negativesStr = negatives.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(","));
            throw new Exception("negatives not allowed: " + negativesStr);
        }
    }
}
