package pl.szkloenia.comarch.authenticate;

public interface AuthenticatorInterface {
    boolean authenticate(String login, String password);
}
