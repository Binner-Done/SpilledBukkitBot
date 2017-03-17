package com.binnerdone.spilledbukkit;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;

import java.awt.*;

/**
 * Created by Jack on 15/03/2017.
 */
public class ArsenIsHard implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {

        textChannel.sendMessage(new EmbedBuilder()
                .setAuthor("ArsenArsen", null, "https://cdn.discordapp.com/avatars/155954930191040513/62b008eaab4db286f4dd66fa8f968570.png")
                .setDescription("one kid pissed me off and I almost broke his bones\n" + "dont\n" + "do it")
                .setColor(Color.YELLOW)
                .build())
                .queue();
        message.delete().queue();
    }

    @Override
    public String getCommand() {
        return "arsenishard";
    }

    @Override
    public String getDescription() {
        return "Secret command!";
    }
}
