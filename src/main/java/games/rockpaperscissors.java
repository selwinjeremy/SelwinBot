package games;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;

public class rockpaperscissors extends Command {

    public rockpaperscissors(){
        this.name = "rps";
        this.aliases = new String[]{"RPS"};
        this.aliases = new String[]{"Rps"};

    }

    @Override
    protected void execute(CommandEvent event) {

        String[] strChoice = event.getMessage().getContentRaw().split(" ");

        if (strChoice[1].equalsIgnoreCase("Rock")){
            int intAI = (int) (1 +(Math.random() * 3));
            if(intAI == 1){ //ROCK
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://cdn.instructables.com/F02/BBV9/I7Q0TFTU/F02BBV9I7Q0TFTU.LARGE.jpg?fit=bounds");
                eb.setDescription("**OPPONENT CHOSE ROCK: DRAW!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            } else if (intAI == 2){ //PAPER
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://graphics8.nytimes.com/images/2011/08/21/magazine/21mag-abstractimages-slide-2T4N/21mag-abstractimages-slide-2T4N-jumbo.jpg");
                eb.setDescription("**OPPONENT CHOSE PAPER: YOU LOSE!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            } else if (intAI == 3){ //SCISSORS
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://graphics8.nytimes.com/images/2011/08/21/magazine/21mag-abstractimages-slide-IRQ1/21mag-abstractimages-slide-IRQ1-jumbo.jpg");
                eb.setDescription("**OPPONENT CHOSE SCISSORS: YOU WIN!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            }

        } else if (strChoice[1].equalsIgnoreCase("Paper")){
            int intAI = (int) (1 +(Math.random() * 3));
            if(intAI == 1){ //ROCK
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://cdn.instructables.com/F02/BBV9/I7Q0TFTU/F02BBV9I7Q0TFTU.LARGE.jpg?fit=bounds");
                eb.setDescription("**OPPONENT CHOSE ROCK: YOU WIN!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            } else if (intAI == 2){ //PAPER
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://graphics8.nytimes.com/images/2011/08/21/magazine/21mag-abstractimages-slide-2T4N/21mag-abstractimages-slide-2T4N-jumbo.jpg");
                eb.setDescription("**OPPONENT CHOSE PAPER: DRAW!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            } else if (intAI == 3){ //SCISSORS
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://graphics8.nytimes.com/images/2011/08/21/magazine/21mag-abstractimages-slide-IRQ1/21mag-abstractimages-slide-IRQ1-jumbo.jpg");
                eb.setDescription("**OPPONENT CHOSE SCISSORS: YOU LOSE!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            }

        } else if (strChoice[1].equalsIgnoreCase("Scissors")){
            int intAI = (int) (1 +(Math.random() * 3));
            if(intAI == 1){ //ROCK
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://cdn.instructables.com/F02/BBV9/I7Q0TFTU/F02BBV9I7Q0TFTU.LARGE.jpg?fit=bounds");
                eb.setDescription("**OPPONENT CHOSE ROCK: YOU LOSE!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            } else if (intAI == 2){ //PAPER
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://graphics8.nytimes.com/images/2011/08/21/magazine/21mag-abstractimages-slide-2T4N/21mag-abstractimages-slide-2T4N-jumbo.jpg");
                eb.setDescription("**OPPONENT CHOSE PAPER: YOU WIN!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            } else if (intAI == 3){ //SCISSORS
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setImage("https://graphics8.nytimes.com/images/2011/08/21/magazine/21mag-abstractimages-slide-IRQ1/21mag-abstractimages-slide-IRQ1-jumbo.jpg");
                eb.setDescription("**OPPONENT CHOSE SCISSORS: DRAW!!!**");
                event.getChannel().sendMessage(eb.build()).queue();
            }
        }

    }
}
