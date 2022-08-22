package pl.szkloenia.comarch.authenticate.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.szkloenia.comarch.authenticate.Authenticator;
import pl.szkloenia.comarch.authenticate.AuthenticatorInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class GUI {

    @Autowired
    AuthenticatorInterface authenticator;

    public void authenticate() throws IOException {
        System.out.println("Wprowadz login:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String login = reader.readLine();

        System.out.println("Wprowadz haslo:");
        String pass = reader.readLine();

        boolean authResult = this.authenticator.authenticate(login, pass);

        if(authResult) {
            System.out.println("Autentykacja udana !!!");
        } else {
            System.out.println("Autentykacja nie udana !!!");
        }
    }
}
