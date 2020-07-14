import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.*;
import commands.hello;
import commands.positivity;
import games.coinflip;
import games.diceroll;
import games.rockpaperscissors;
import information.serverInfo;
import information.userinfo;
import media.imageresizerotate;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class selbot {

    public static void main (String args[]) throws Exception{

        JDA jda = new JDABuilder("NzE1NjQzOTQwOTI1MzQxNzI3.XtANmg.thSBNv-8BxLjaLKYiCYupD-_z90").build();

        EventWaiter waiter = new EventWaiter();

        CommandClientBuilder builder = new CommandClientBuilder();
        builder.setOwnerId("715643940925341727");
        builder.setPrefix("sel-");
        builder.setHelpWord("Command");

        builder.addCommand(new serverInfo());
        builder.addCommand(new userinfo());

        builder.addCommand(new calculations());

        builder.addCommand(new imageresizerotate());

        builder.addCommand(new hello());
        builder.addCommand(new positivity());

        builder.addCommand(new rockpaperscissors());
        builder.addCommand(new diceroll());
        builder.addCommand(new coinflip());

        CommandClient client = builder.build();
        jda.addEventListener(client);
        jda.addEventListener(waiter);

    }
}
