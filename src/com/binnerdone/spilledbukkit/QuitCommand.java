package com.binnerdone.spilledbukkit;

import com.walshydev.jba.JBA;
import com.walshydev.jba.commands.Command;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;

/**
 * Created by Jack on 15/03/2017.
 */
public class QuitCommand extends JBA implements Command {
    @Override
    public void onCommand(User user, TextChannel textChannel, Message message, String[] strings, Member member) {
    }

    @Override
    public String getCommand() {
        return "quit";
    }

    @Override
    public String getDescription() {
        return "Shuts the bot down";
    }

    @Override
    public void run() {

    }
}
