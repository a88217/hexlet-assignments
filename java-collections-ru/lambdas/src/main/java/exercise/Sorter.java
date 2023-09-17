package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {
        List<Map<String, String>> result = new ArrayList<>();
        result = list.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(new Comparator<Map<String, String>>() {
                            @Override
                            public int compare(Map<String, String> o1, Map<String, String> o2) {
                                return o1.get("birthday").compareTo(o2.get("birthday"));
                            }
                        }

                )
                .toList();
        List<String> resultList = new ArrayList<>();
        result.stream()
                .map(user -> resultList.add(user.get("name")))
                .toList();
        return resultList;
    }
}
// END
