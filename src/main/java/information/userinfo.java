package information;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;

import java.awt.*;
import java.time.format.DateTimeFormatter;

public class userinfo extends Command {



    public userinfo(){
        super.name = "userinfo";
        super.aliases = new String[] {"UserInfo"};
        super.aliases = new String[] {"Userinfo"};
        super.aliases = new String[] {"userInfo"};
        super.aliases = new String[] {"USERINFO"};
        super.category = new Category("members");

    }

    @Override
    protected void execute(CommandEvent e) {
        if(e.getArgs().isEmpty()){
            e.reply("Please enter the username of a server member");
        } else {
            Member name;
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            try {
                name = e.getMessage().getMentionedMembers().get(0);
                EmbedBuilder eb = new EmbedBuilder()
                        .setColor(Color.magenta)
                        .setAuthor("Information on " + name.getUser().getName(), "http://www.google.com", name.getUser().getAvatarUrl())
                        .setDescription(name.getUser().getName() + " is currently " + name.getOnlineStatus() + "\n"
                                + name.getUser().getName() + " joined the server on " + name.getTimeJoined().format(fmt) + "\n")
                        .addField("Game", displayGameInfo(name), true);
                e.reply(eb.build());
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Exception Occurred");
                e.reply("Provide the name as a mention @ ");
            }

        }
    }

    private String displayGameInfo(Member name){
        try {
            String game = name.getActivities().toString();
            return "Playing game: " + game;
        } catch(NullPointerException ex2){
            return "No game is being played";
        }

    }
}
