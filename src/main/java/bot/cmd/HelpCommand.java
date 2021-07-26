package bot.cmd;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelpCommand extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase("!help")) {
            StringBuilder text = new StringBuilder();
            for (String cmd : AvaliableCommands.commandList) {
                event.getChannel().sendTyping().queue();
                text.append(cmd).append("\n");
            }
            event.getChannel().sendMessage(text.toString()).queue();
        }
    }
}
