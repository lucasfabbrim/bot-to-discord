package br.com.lucas.bot.modules.discord.command;

import br.com.lucas.bot.modules.discord.entities.Discord;
import br.com.lucas.bot.modules.discord.listeners.DiscordListeners;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

public class Auth {

    private final Discord discord;

    public Auth() {
        this.discord = new Discord();
    }

    public void run(String token){
        try{
            JDABuilder builder = JDABuilder.createDefault(token);
            builder.addEventListeners(new DiscordListeners()).build();
        }catch (LoginException e){
            System.out.println(e.getMessage());
            execute();
        }

    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Discord Token: ");

        if(scanner.hasNextLine()){

            String command = scanner.nextLine();
            discord.setToken(command);
            System.out.println("Token: " +discord.getToken());
            run(discord.getToken());
            scanner.close();

        }else{
            System.out.println("Invalid Token");
        }
    }

}
