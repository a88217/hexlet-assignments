package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> bookInList : books) {
            if ((!where.containsKey("year") || bookInList.get("year").equals(where.get("year"))) && (!where.containsKey("author") || bookInList.get("author").equals(where.get("author"))) && (!where.containsKey("title") || bookInList.get("title").equals(where.get("title")))) {
                result.add(bookInList);
            }
        }
        return result;
    }
}
//END
