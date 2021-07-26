package bot;

import bot.cmd.HelpCommand;
import bot.cmd.RollCommand;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class RollBot {
    public RollBot(String token) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault(token);
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setActivity(Activity.playing("КАЗИНО"));
        builder.addEventListeners(new RollCommand());
        builder.addEventListeners(new HelpCommand());
        builder.build();
    }


}
