package br.com.lucas.bot.modules.discord.entities;

import br.com.lucas.bot.modules.discord.dto.DiscordRecord;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.dv8tion.jda.api.JDABuilder;

import java.time.Instant;
import java.util.regex.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class Discord {

    private String botName;
    private String token;
    private boolean operation;

    public Discord(DiscordRecord dto){
        this.botName = dto.botName();
        this.token = dto.token();
        this.operation = dto.operation();
    }
}
