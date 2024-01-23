@template.layout.page(
content = @`
    <h1>Пользователи</h1>

    <div class="mb-3">
        <h2>Зарегистрировать нового пользователя</h2>
    </div>

    <form action="/users" method="post">
        <div>
            <label>
                Имя
                <input type="text" name="firstName" />
            </label>
        </div>
        <div>
            <label>
                Фамилия
                <input type="text" name="lastName" />
            </label>
        </div>
        <div>
            <label>
                Email
                <input type="text" required name="email" />
            </label>
        </div>
        <div>
            <label>
                Пароль
                <input type="text" required name="password" />
            </label>
        </div>

        <input type="submit" value="Зарегистрировать" />
    </form>
`
)