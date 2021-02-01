package analyzer;

public class SentenceCounter extends InputAnalyzer {
    @Override
    protected long analyze(String text) {
        if (text != null) {
            return text.chars().filter(ch -> ch == '.' || ch == '?' || ch == '!').count();
        } else {
            return 0;
        }
    }

    @Override
    protected void showOutput(long count) {
        System.out.println("Sentence count in the text: " + count);
    }
}
