package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new LinkedHashMap<>();
        data1.entrySet().stream()
                .forEach(entry -> {
                    if(!data2.containsKey(entry.getKey())) {
                        result.put(entry.getKey(), "deleted");
                    } else if (entry.getValue().equals(data2.get(entry.getKey()))) {
                        result.put(entry.getKey(), "unchanged");
                    } else if (!entry.getValue().equals(data2.get(entry.getKey()))) {
                        result.put(entry.getKey(), "changed");
                    }
                });
        data2.entrySet().stream()
                .forEach(entry -> {
                    if(!data1.containsKey(entry.getKey())) {
                        result.put(entry.getKey(), "added");
                    }
                });
        Map<String, String> resultSorted = new LinkedHashMap<>();
        result.entrySet().stream()
                .sorted(new Comparator<Map.Entry<String, String>>() {
                    @Override
                    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                })
                .forEach(entry -> resultSorted.put(entry.getKey(), entry.getValue()));

        return resultSorted;
    }
}
//END
