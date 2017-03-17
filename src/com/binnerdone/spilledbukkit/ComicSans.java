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
public class ComicSans implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {

        textChannel.sendMessage(new EmbedBuilder()
                .setAuthor("Say NO to Comic Sans MS", null, "https://cdn.discordapp.com/avatars/138235433115975680/e7f879231bf7ebe9eeff238cc9fe28e7.png")
                .setDescription(":x: Stop I Al from using Comic Sans. Please, just £5 a month can help us stop I Al from using Comic Sans. \n Thank you, \n Binner_Done")
                .setColor(Color.RED)
                .build())
                .queue();
        message.delete().queue();
    }

    @Override
    public String getCommand() {
        return "saynotocomicsans";
    }

    @Override
    public String getDescription() {
        return "Secret Command";
    }
}
