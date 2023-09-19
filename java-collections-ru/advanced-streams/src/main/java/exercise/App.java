package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String input) {

        String[] arrayFile = input.split("\n");
        StringBuilder result = new StringBuilder();
        Arrays.stream(arrayFile).filter(x -> x.contains("environment=\""))
                .map(i -> i.replaceAll("environment=\"", ""))
                .map(i -> i.replaceAll("\"", ""))
                .flatMap(i -> Arrays.stream(i.split(",")))
                .filter(i -> i.startsWith("X_FORWARDED"))
                .map(i -> i.replaceAll("X_FORWARDED_", ""))
                .forEach(i -> result.append(i + ","));
        String output = result.toString();
        return output.substring(0, output.length() - 1);
    }
}
//END
