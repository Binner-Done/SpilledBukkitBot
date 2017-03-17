package com.binnerdone.spilledbukkit;

import com.walshydev.jba.JBA;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

/**
 * Created by Jack on 15/03/2017.
 */
// MjkxNjU1NzAyNDY2Nzg5Mzk3.C6spDA.ZrhSVunuM0pJyxf5Op-lZ0QpO1k
public class SpilledBukkit extends JBA  {
    public static void main(String[] args){

            new SpilledBukkit().init(new JDABuilder(AccountType.BOT)
                    .setToken(Secret.secret)
                    .setGame(Game.of("+help | Unofficial SpilledBukkit Bot"))
                    , "+");
            getInstance().getClient().getGuildById("247412763167555584").getMembers().size();


    }
    //public static int sizeofguild = getInstance().getClient().getGuildById("247412763167555584").getMembers().size();
    @Override
    public void run() {

        registerCommand(new InfoCommand());
        registerCommand(new HelpCommand());
        registerCommand(new GiveawayCommand());
        registerCommand(new ArsenIsHard());
        registerCommand(new ComicSans());
        registerCommand(new JBACommand());
        registerCommand(new QuitCommand());
    }
}
