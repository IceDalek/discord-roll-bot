package bot.answers;

public class BotAnswersBidlo implements BotAnswers {

    private final String WTF = "Что за хуйню ты написал???";
    private final String ONLY_POSITIVE = "И как мне ролить отрицательные числа? А? А?";
    private final String BAD_BOUND = "Ты тупой? Как я это ролить буду???";

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
