package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class hello extends Command {
    public hello(){
        this.name = "hello";
        this.aliases = new String[]{"Hello"};
        this.aliases = new String[]{"HELLO"};
    }

    @Override
    protected void execute(CommandEvent e) {
        String strName = e.getMember().getUser().getName();
        e.reply("Hello there " + e.getAuthor().getAsMention() + "!!!");
    }
}
