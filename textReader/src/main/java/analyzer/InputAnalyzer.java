package analyzer;

import customIO.TextFileWrapper;

public abstract class InputAnalyzer {

    public final void analyzeInput(String filePath) throws Exception {
        String text = readInput(filePath);
        long count = analyze(text);
        showOutput(count);
    }

    protected String readInput(String filePath) throws Exception {
        try (TextFileWrapper text = new TextFileWrapper(filePath)) {
            return text.read();
        }
    }

    protected abstract long analyze(String text);

    protected void showOutput(long count) throws Exception {
        try (TextFileWrapper text = new TextFileWrapper()) {
            text.write("AnalyzedInput","The count is: " + count);
        }
    }
}
