package analyzer;

import java.io.*;

public abstract class InputAnalyzer {

    public final void analyzeInput(String filePath) {
        String text = readInput(filePath);
        long count = analyze(text);
        showOutput(count);
    }

    protected String readInput(String filePath) {
        String line = null;
        StringBuilder text = new StringBuilder();
        try (FileInputStream fin = new FileInputStream(filePath)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fin));
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found. " + fnf.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception");
        }
        return text.toString();
    }

    protected abstract long analyze(String text);

    protected void showOutput(long count) {
        System.out.println("The count is: " + count);
    }
}
