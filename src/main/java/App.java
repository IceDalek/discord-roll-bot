import bot.RollBot;

import javax.security.auth.login.LoginException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws LoginException {
        try {
            InputStream in = App.class.getResourceAsStream("tokens/token.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String token = reader.readLine();
            reader.close();
            RollBot rollBot = new RollBot(token);
        } catch (LoginException | IOException e) {
            e.printStackTrace();
        }
    }
}
