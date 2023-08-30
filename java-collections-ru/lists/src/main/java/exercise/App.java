package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        String[] lettersArray = letters.split("");
        String[] wordLettersArray = word.toLowerCase().split("");
        List<String> lettersList = new ArrayList<>(Arrays.asList(lettersArray));
        List<String> wordLetters = new ArrayList<>(Arrays.asList(wordLettersArray));
        boolean result = true;
        for (String s : wordLetters) {
            if (lettersList.contains(s)) {
                lettersList.remove(s);
            } else {
                result = false;
            }
        }
        return result;
    }
}
//END
