package bot.cmd;


import bot.answers.BotAnswers;
import bot.answers.BotAnswersBidlo;
import bot.answers.BotAnswersNormal;
import bot.mode.Mode;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class RollCommand extends ListenerAdapter {

    BotAnswers botAnswers = new BotAnswersNormal();

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase("!roll")) {
            rollCmd(event, args);
        }
        if (args[0].equalsIgnoreCase("!setMode") || args[0].equalsIgnoreCase("!Mode")) {
            if (args.length > 1) {
                String mode = args[1];
                if (mode.equalsIgnoreCase(Mode.BIDLO.toString())) {
                    botAnswers = new BotAnswersBidlo();
                }
                if (mode.equalsIgnoreCase(Mode.NORMAL.toString())) {
                    botAnswers = new BotAnswersNormal();
                }
            }
        }
    }

    private void rollCmd(GuildMessageReceivedEvent event, String[] args) {
        int lower = 1;
        int upper = 100;
        if (args.length >= 2) {
            String[] bounds = args[1].split("-");
            if (bounds.length == 2) {
                try {
                    lower = Integer.parseInt(bounds[0]);
                    upper = Integer.parseInt(bounds[1]);
                } catch (NumberFormatException e) {
                    event.getChannel().sendTyping().queue();
                    event.getChannel().sendMessage(botAnswers.getWTF()).queue();
                } catch (IllegalArgumentException e) {
                    event.getChannel().sendTyping().queue();
                    event.getChannel().sendMessage(botAnswers.getONLY_POSITIVE()).queue();
                }
                if (lower > upper) {
                    event.getChannel().sendTyping().queue();
                    event.getChannel().sendMessage(botAnswers.getBAD_BOUND()).queue();
                }
            }
        }
        Random rand = new Random();
        int x = lower + rand.nextInt(upper - lower + 2);
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(event.getMember().getUser().getName() + "  rolled  " + x).queue();
    }
}
