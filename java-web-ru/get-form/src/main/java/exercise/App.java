package exercise;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;
import exercise.model.User;
import exercise.dto.users.UsersPage;
import java.util.Collections;
import org.apache.commons.lang3.StringUtils;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            var term = ctx.queryParam("term");
            List<User> users = new ArrayList<>();
            if (term != null) {
                var prefix = term.toLowerCase();
                users = USERS.stream().filter(crs -> crs.getFirstName().toLowerCase().startsWith(prefix)).toList();

            } else {
                users = USERS;/* Извлекаем все курсы, которые хотим показать */
            }
            var page = new UsersPage(users, term);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });
        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
