package games;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class diceroll extends Command {
    public diceroll(){
        this.name = "dice";
        this.aliases = new String[]{"DICE"};
        this.aliases = new String[]{"Dice"};
    }

    @Override
    protected void execute(CommandEvent e) {
        int intDiceRoll = (int) (1 +(Math.random() * 6));
        if(intDiceRoll == 1){
            e.getChannel().sendMessage("You rolled a 1!").queue();
        } else if (intDiceRoll == 2){
            e.getChannel().sendMessage("You rolled a 2!").queue();
        } else if (intDiceRoll == 3){
            e.getChannel().sendMessage("You rolled a 3!").queue();
        }else if (intDiceRoll == 4){
            e.getChannel().sendMessage("You rolled a 4!").queue();
        }else if (intDiceRoll == 5){
            e.getChannel().sendMessage("You rolled a 5!").queue();
        }else if (intDiceRoll == 6){
            e.getChannel().sendMessage("You rolled a 6!").queue();
        }
    }
}
