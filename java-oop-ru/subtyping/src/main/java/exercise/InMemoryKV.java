package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    Map<String,String> storage = new HashMap<>();

    public InMemoryKV(Map<String, String> storage) {
        for(Map.Entry<String, String> entry: storage.entrySet()) {
            // get key
            String key = entry.getKey();
            // get value
            String value = entry.getValue();
            this.storage.put(key, value);
        }
    }

    public void set(String key, String value) {
        storage.put(key, value);
    };
    public void unset(String key){
        storage.remove(key);
    };
    public String get(String key, String defaultValue) {
        return storage.containsKey(key) ? storage.get(key) : defaultValue;
    };
    public Map<String, String> toMap(){
        return new HashMap<>(storage);
    };
}
// END
