package br.com.lucas.bot;


import br.com.lucas.bot.modules.discord.command.Auth;

import javax.security.auth.login.LoginException;

public class BotDiscordApplication {

	public static void main(String[] args) throws LoginException {
		new Auth().execute();
	}
}
