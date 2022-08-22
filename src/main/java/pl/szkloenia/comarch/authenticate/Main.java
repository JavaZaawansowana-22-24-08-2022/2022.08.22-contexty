package pl.szkloenia.comarch.authenticate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.szkloenia.comarch.authenticate.configuration.AppConfiguration;
import pl.szkloenia.comarch.authenticate.gui.GUI;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        GUI gui = context.getBean(GUI.class);
        gui.authenticate();
    }
}
