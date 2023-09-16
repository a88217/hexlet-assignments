package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static boolean isFree(String eMail) {
        String domen = eMail.split("@")[1];
        return (domen.equals("gmail.com") || domen.equals("yandex.ru") || domen.equals("hotmail.com"));
    }
    public static int getCountOfFreeEmails(List<String> eMails) {
        long count = eMails.stream()
                .filter(eMail -> isFree(eMail))
                .count();
        return (int) count;
    }
}
// END
