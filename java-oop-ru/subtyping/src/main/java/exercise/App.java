package exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage input) {
        Map<String, String> resultMap = new HashMap<>();
        Set<String> keySet = new HashSet<>();
        keySet = input.toMap().keySet();
        System.out.println(keySet);
        input.toMap().entrySet().stream()
                .forEach(entry -> resultMap.put(entry.getValue(), entry.getKey()));
        System.out.println(resultMap);
        Set<String> set = new HashSet();
        for (String key : keySet)
        {
            set.add(key);
        }
        System.out.println("New set" + set);
        for (String text : set)
        {
            input.unset(text);
        }
        System.out.println(input.toMap());

        resultMap.entrySet().stream()
                .forEach(entry -> input.set(entry.getKey(), entry.getValue()));
        System.out.println(input.toMap());
    }
}
// END
