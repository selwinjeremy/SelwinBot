package information;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.util.Arrays;

public class serverInfo extends Command {

    public serverInfo(){
        this.name = "serverInfo";
        this.aliases = new String[]{"ServerInfo"};
        this.aliases = new String[]{"serverinfo"};
        this.aliases = new String[]{"SERVERINFO"};
    }

    @Override
    protected void execute(CommandEvent e) {
        String[] strMembers = new String[e.getGuild().getMembers().size()];
        for (int i = 0; i < e.getGuild().getMembers().size(); i++){
            strMembers[i] = e.getGuild().getMembers().get(i).getEffectiveName();
        }
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.RED);
        eb.setThumbnail("https://i.kym-cdn.com/entries/icons/medium/000/033/233/cover8.jpg");
        eb.setAuthor(e.getGuild().getName());
        eb.addField("Number Of Members: " , Integer.toString(e.getGuild().getMembers().size()) , true);

        eb.setDescription(
                "**Invite Link:** \n" + "https://discord.gg/Z3DwxK \n \n" +
                "**sel-userinfo @name \n" + "Look at the use info of other members!\n" +
                "**sel-hello:** \n" + "Have a look at your custom greeting!\n" +
                "**sel-positivity:** \n" + "Motivate yourself with a positive quote!\n" +
                "**sel-math operation:** \n" + "Preform calculations from basic operations to vector problems! (type sel-math help)\n" +
                "**sel-rps choice:** \n" + "Play the bot in a game of rock, paper, scissors!\n" +
                "**sel-dice:** \n" + "Test your luck and roll the dice!\n" +
                "**sel-coin:** \n" + "Can't decide what to do? Flip a coin and figure out!\n" +
                "**sel-filter on:** \n" + "Disable the use of bad words!\n" +
                "**sel-filter off:** \n" + "Enable the use of bad words!\n" +
                "**sel-imsize width height URL rotate** \n" + "Resize and Rotate an image(downloadable)!\n");

        e.getChannel().sendMessage(eb.build()).queue();

    }
}
