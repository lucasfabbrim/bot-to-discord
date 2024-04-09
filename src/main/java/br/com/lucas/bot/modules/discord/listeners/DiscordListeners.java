package br.com.lucas.bot.modules.discord.listeners;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DiscordListeners extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        TextChannel channel = event.getJDA().getTextChannelsByName("bot-discord", true).get(0);
        channel.sendMessage("auth-with-sucessfully").queue();
    }

}
