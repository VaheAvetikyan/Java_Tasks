import analyzer.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Open file:");
            String filePath = br.readLine();
            InputAnalyzer input;
            input = new SentenceCounter();
            input.analyzeInput(filePath);
            input = new WordCounter();
            input.analyzeInput(filePath);
            input = new SymbolCounter();
            input.analyzeInput(filePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
