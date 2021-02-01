package analyzer;

public class SymbolCounter extends InputAnalyzer {
    @Override
    protected long analyze(String text) {
        if (text != null) {
            return text.chars().filter(ch -> ch != ' ').count();
        } else {
            return 0;
        }
    }

    @Override
    protected void showOutput(long count) {
        System.out.println("There are " + count + " symbols in text");
    }
}
