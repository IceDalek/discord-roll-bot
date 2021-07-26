package bot.mode;

public class BotMode {
    private static BotMode instance;
    private Mode mode;

    public synchronized static BotMode getInstance() {
        if (instance == null) {
            instance = new BotMode();
        }
        return instance;
    }

    public static void setInstance(BotMode instance) {
        BotMode.instance = instance;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
