
import bot.RollBot;

import javax.security.auth.login.LoginException;

public class App {

    public static void main(String[] args) throws LoginException {

        try {
            RollBot rollBot = new RollBot();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
