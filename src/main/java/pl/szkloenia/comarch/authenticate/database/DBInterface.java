package pl.szkloenia.comarch.authenticate.database;

import pl.szkloenia.comarch.authenticate.model.User;

import java.util.Optional;

public interface DBInterface {
    Optional<User> getUserByLogin(String login);
}
