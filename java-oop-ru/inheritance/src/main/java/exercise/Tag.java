package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String toString() {
        var tag = new StringBuilder(String.format("<%s", name));
        attributes.entrySet().stream()
                .forEach(entry -> {
                    tag.append(" ");
                    tag.append(entry.getKey());
                    tag.append("=\"");
                    tag.append(entry.getValue());
                    tag.append("\"");
                });
        tag.append(">");
        return tag.toString();
    }
}
// END
