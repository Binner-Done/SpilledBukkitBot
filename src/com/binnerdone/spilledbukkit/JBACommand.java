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
public class JBACommand implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {

        textChannel.sendMessage(new EmbedBuilder()
                .setAuthor("Is JBA good?", null, "https://cdn.discordapp.com/avatars/158310004187725824/4ebe50dc71133e00ed3ede284e5d873f.png")
                .setDescription(":white_check_mark: Currently, JBA is good \n Evil Walshy could overthrow us though!")
                .setImage("https://cdn.discordapp.com/avatars/158310004187725824/4ebe50dc71133e00ed3ede284e5d873f.png")
                .setColor(Color.ORANGE)
                .build())
                .queue();
        message.delete().queue();
    }

    @Override
    public String getCommand() {
        return "isjbagood";
    }

    @Override
    public String getDescription() {
        return "Secret Command!";
    }
}
