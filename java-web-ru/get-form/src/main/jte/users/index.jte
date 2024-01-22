@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            <form action="/users" method="get">
                <input type="search" name="term" value="${page.getTerm()}" />
                <input type="submit" value="Search" />
            </form>
            @for(var user : page.getUsers())
                <div>
                    <h2><a href="/users/${user.getId()}">${user.getFirstName()} ${user.getLastName()}</a></h2>
                    <p>${user.getEmail()}</p>
                </div>
            @endfor
        </main>
    </div>
`)
