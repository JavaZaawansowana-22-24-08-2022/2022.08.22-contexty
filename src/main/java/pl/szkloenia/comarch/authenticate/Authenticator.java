package pl.szkloenia.comarch.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.szkloenia.comarch.authenticate.database.DBInterface;
import pl.szkloenia.comarch.authenticate.database.UserDB;
import pl.szkloenia.comarch.authenticate.database.UserDB2;
import pl.szkloenia.comarch.authenticate.model.User;

import java.util.Optional;

@Component
public class Authenticator implements AuthenticatorInterface {

    @Autowired
    @Qualifier("db2")
    DBInterface userDB;

    @Override
    public boolean authenticate(String login, String password) {
        Optional<User> userBox = userDB.getUserByLogin(login);
        return userBox.isPresent() && userBox.get().getPass().equals(password);
    }
}
