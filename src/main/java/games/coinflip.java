package games;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class coinflip extends Command {
    public coinflip(){
        this.name = "coin";
        this.aliases = new String[]{"COIN"};
        this.aliases = new String[]{"Coin"};
    }

    @Override
    protected void execute(CommandEvent e) {
        int intCoinFlip = (int) (1 +(Math.random() * 2));
        if(intCoinFlip == 1){
            EmbedBuilder eb = new EmbedBuilder();
            eb.setColor(Color.RED);
            eb.setThumbnail("https://www.harperbilliardleague.com/Images/coin-flip-heads.gif?v=7");
            //eb.setImage("https://www.harperbilliardleague.com/Images/coin-flip-heads.gif?v=7");
            eb.setDescription("**YOU FLIPPED HEADS!!!**");
            e.getChannel().sendMessage(eb.build()).queue();
        } else if (intCoinFlip == 2){
            EmbedBuilder eb2 = new EmbedBuilder();
            eb2.setColor(Color.RED);
            eb2.setThumbnail("https://i.imgur.com/IcigPaK.gif");
            eb2.setDescription("**YOU FLIPPED TAILS!!!**");
            e.getChannel().sendMessage(eb2.build()).queue();
        }
    }
}
