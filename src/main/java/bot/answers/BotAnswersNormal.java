package bot.answers;

public class BotAnswersNormal implements BotAnswers {
    private final String WTF = "Не могу обработать команду";
    private final String ONLY_POSITIVE = "Можно вводить только отрицательные числа";
    private final String BAD_BOUND = "Неверная граница, пример: !roll 1-100";

    @Override
    public String getWTF() {
        return WTF;
    }

    @Override
    public String getONLY_POSITIVE() {
        return ONLY_POSITIVE;
    }

    @Override
    public String getBAD_BOUND() {
        return BAD_BOUND;
    }
}
