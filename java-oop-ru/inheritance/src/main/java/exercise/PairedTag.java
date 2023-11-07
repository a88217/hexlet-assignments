package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    private String tagBody;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String tagBody, List<Tag> children) {
        super(name, attributes);
        this.tagBody = tagBody;
        this.children = children;
    }

    @Override
    public String toString() {
        var result = new StringBuilder(super.toString());
        result.append(tagBody);
        children.stream()
                .forEach(child -> result.append(child.toString()));
        result.append(String.format("</%s>", super.getName()));
        return result.toString();
    }
}
// END
