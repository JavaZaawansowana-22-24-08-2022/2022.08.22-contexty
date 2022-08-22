package pl.szkloenia.comarch.authenticate.database;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.szkloenia.comarch.authenticate.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static pl.szkloenia.comarch.authenticate.database.UserDB.x;

@Component(x)
public class UserDB implements DBInterface {

    static final String x = "abc";
    private List<User> users = new ArrayList<>();

    public UserDB() {
        this.users.add(new User(1, "admin", "admin"));
        this.users.add(new User(2, "janusz", "janusz"));
    }

    @Override
    public Optional<User> getUserByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equals(login)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
