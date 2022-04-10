package parser;

public class ParserInput {

    private String numbers;

    private String splitRegex;

    public ParserInput(String numbers, String splitRegex) {
        this.numbers = numbers;
        this.splitRegex = splitRegex;
    }

    public String getNumbers() {
        return numbers;
    }

    public String getSplitRegex() {
        return splitRegex;
    }
}
