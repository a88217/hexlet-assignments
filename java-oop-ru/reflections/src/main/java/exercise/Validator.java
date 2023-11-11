package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) throws IllegalArgumentException {
        List<String> notValidFields = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    field.setAccessible(true);
                    if (Objects.isNull(field.get(address))) {
                        notValidFields.add(field.getName());
                    }
                }
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
        return notValidFields;
    }
}
// END
