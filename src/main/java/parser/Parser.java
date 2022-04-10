package parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    private static final String BASE_SPLIT_REGEX = ",|\n";

    public static List<Integer> parseString(String numbers) {
        ParserInput parserInput = createInput(numbers);
        String[] tokens = parserInput.getNumbers().split(parserInput.getSplitRegex());
        return Arrays.asList(tokens)
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static ParserInput createInput(String numbers) {
        if(numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, index);
            String splitRegex = BASE_SPLIT_REGEX + "|" + delimiter;
            return new ParserInput(numbers.substring(index + 1), splitRegex) ;
        }
        return new ParserInput(numbers, BASE_SPLIT_REGEX);
    }
}
