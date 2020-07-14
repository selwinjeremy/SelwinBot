package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class positivity extends Command {
    public positivity(){
        this.name = "positivity";
        this.aliases = new String[]{"Positivity"};
        this.aliases = new String[]{"POSITIVITY"};
    }

    @Override
    protected void execute(CommandEvent e) {

        int intNumber;
        intNumber = (int) (1 +(Math.random() * 5));

        if(intNumber == 1){
            e.getChannel().sendMessage("“Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking. Don’t let the noise of other’s opinions drown out your own inner voice. And most important, have the courage to follow your heart and intuition.” – Steve Jobs").queue();
        }
        if (intNumber == 2){
            e.getChannel().sendMessage("“The courageous do not lie down and accept defeat. Instead, they are all the more determined to struggle for a better future.” – Queen Elizabeth II").queue();
        }
        if (intNumber == 3){
            e.getChannel().sendMessage("“If you work hard and meet your responsibilities, you can get ahead; no matter where you came from, what you look like, or who you love.” – Barack Obama").queue();

        }
        if (intNumber == 4){
            e.getChannel().sendMessage("“The greatest glory in living lies not in never falling, but in rising every time we fall.” – Nelson Mandela").queue();
        }
        if (intNumber == 5){
            e.getChannel().sendMessage("“Falling does not shape your personality. It’s how you react upon your failure. Do you dust yourself off and mope, or do you dust yourself off and come back stronger the next time? Eventually you will win.” – Tiger Woods").queue();
        }
    }
}
