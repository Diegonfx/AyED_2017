package Cursada.TrabajosPracticos.TrabajoPractico3.LexicographicAnalyzer.Exercise;

import Cursada.TrabajosPracticos.TrabajoPractico3.Stacks.DynamicStack.DynamicStack;
import java.io.*;

/**
 * Created by DiegoMancini on 24/3/17.
 */
public class LexicographicAnalyzer {

    int errors;
    char currentChar;
    int currentLine;
    DynamicStack<Character> symbols;

    public LexicographicAnalyzer() {
        errors = 0;
        currentLine = 1;
        currentChar = '\0';
        symbols = new DynamicStack<>();
    }

    public void checkText(String anyFile) throws Exception {
        String text = readFile(anyFile);

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '(' ||text.charAt(i) == '{' || text.charAt(i) == '[')
                symbols.push(text.charAt(i));
            if(text.charAt(i) == ')' ||text.charAt(i) == '}' || text.charAt(i) == ']')
                symbols.pop();
        }
    }

    public int countErrors(){
        if (!symbols.isEmpty())
            errors = symbols.size();
        return errors;
    }

    private String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

}