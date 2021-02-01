package analyzer;

public class WordCounter extends InputAnalyzer {
    @Override
    protected long analyze(String text) {
        if (text != null) {
            return text.split("\\W+").length;
        } else {
            return 0;
        }
    }

    @Override
    protected void showOutput(long count) {
        System.out.println("Word count in the text: " + count);

    }
}
