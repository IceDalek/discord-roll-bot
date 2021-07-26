package bot.cmd;

import java.util.ArrayList;

public class AvaliableCommands {

    public static String rollCmd = "\"!roll - выбрасывает случайное число от 1 до 100," +
            " !roll x-y выбрасывает случайное число от x до y, где x < y \"\n";
    public static String modeCmd = "\"!mode или !setMode устанавливает режим ответа бота " +
            "!mode bidlo, !mode normal\"\n";
    public static final ArrayList<String> commandList = new ArrayList<>();

    static {
        commandList.add(rollCmd);
        commandList.add(modeCmd);
    }
}
