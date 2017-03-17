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
public class GiveawayCommand implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {

        textChannel.sendMessage(new EmbedBuilder()
                .setAuthor("SpilledBukkit", null, user.getEffectiveAvatarUrl())
                .setDescription(":computer: Spilled Bukkit's official and unofficial giveaways! :computer: \n `Unofficial` 2GB Lifetime VPS Giveaway from XenonHosting.")
                .addField("2GB VPS Giveaway:", "[`Click Here`](http://bit.ly/2mrMFRo)", true)
                .setColor(Color.GREEN)
                .build())
                .queue();
        message.delete().queue();
    }

    @Override
    public String getCommand() {
        return "giveaways";
    }

    @Override
    public String getDescription() {
        return "Displays known giveaways";
    }
}
