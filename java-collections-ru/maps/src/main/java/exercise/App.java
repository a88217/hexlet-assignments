package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        String[] wordsArray = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        if (sentence.equals("") ) {
            return result;
        }
        for (String word: wordsArray) {
            result.put(word, 1);
        }
        for (String uniqWord: result.keySet()) {
            int wordCount = 0;
            for (String wordFromArray: wordsArray) {
                if (uniqWord.equals(wordFromArray)) {
                    wordCount++;
                }
            }
            result.put(uniqWord, wordCount);
        }
        return result;
    }
    public static String toString(Map wordCount) {
        Map<String, Integer> words = new HashMap<>(wordCount);
        if (wordCount.isEmpty()) {
            return "{}";
        }
        String result = "{\n";
        for (Map.Entry<String, Integer> word: words.entrySet()) {
            result += "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        result += "}";
        return result;
    }
}

//END
