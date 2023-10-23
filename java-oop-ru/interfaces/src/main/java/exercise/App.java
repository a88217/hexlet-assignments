package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homeList, int n) {
        List<String> resultFull = new ArrayList<>();
        List<String> result = new ArrayList<>();
        homeList.stream()
                .sorted(Comparator.comparing(x -> x.getArea()))
                .forEach(home -> resultFull.add(home.toString()));
        if (homeList.size() > 0) {
            for (int i = 0; i < n; i++) {
                result.add(i, resultFull.get(i));
            }
        }
        return result;
    }
}
// END
