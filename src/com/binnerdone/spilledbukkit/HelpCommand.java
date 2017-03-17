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
public class HelpCommand implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {


        textChannel.sendMessage(new EmbedBuilder()
                .setAuthor("SpilledBukkit", null, "https://cdn.discordapp.com/icons/247412763167555584/c7c8b8fc9208ba34b6b7534f11a44f82")
                .setDescription(":computer: Spilled Bukkit's Unofficial Bot Commands! :computer: \n `+giveaways` Current official and unofficial giveaways! \n `+info` List of information about SpilledBukkit")
                .setColor(Color.GREEN)
                .build())
                .queue();
        message.delete().queue();
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Displays help";
    }
}
