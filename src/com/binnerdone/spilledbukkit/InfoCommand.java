package com.binnerdone.spilledbukkit;

import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;

import java.awt.*;

/**
 * Created by Jack on 15/03/2017.
 */
public class InfoCommand implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {
        final JDA jda = message.getJDA();
        textChannel.sendMessage(new EmbedBuilder()
                .setAuthor("SpilledBukkit", null, "https://cdn.discordapp.com/icons/247412763167555584/c7c8b8fc9208ba34b6b7534f11a44f82")
                .setDescription(":computer: Spilled Bukkit's Unofficial Bot! :computer: \n Bot Created by: Binner_Done#7696 \n For a list of commands, do `+help` ! \n SpilledBukkit was founded by Techno\\_Wizard\\_#3234. bwfcwalshy#1284 Created the subredit. \n Current Members in Spilled Bukkit(Including Bots): " + jda.getGuildById("247412763167555584").getMembers().size() )
                .setColor(Color.GREEN)
                .build())
                .queue();
        message.delete().queue();
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public String getDescription() {
        return "Displays information about SpilledBukkit";
    }
}
