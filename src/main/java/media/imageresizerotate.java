package media;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.coobird.thumbnailator.Thumbnails;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

public class imageresizerotate extends Command {
    public imageresizerotate(){
        this.name = "imsize";
        this.aliases = new String[]{"IMSIZE"};
        this.aliases = new String[]{"ImSize"};
        this.aliases = new String[]{"imSize"};

    }

    @Override
    protected void execute(CommandEvent e) {

        if (e.getArgs().equalsIgnoreCase(" ")){
            e.reply("You did not provide any dimensions");
        }else{
            try{
                String[] args = e.getArgs().split(" ");
                int intWidth = Integer.parseInt(args[0]);
                int intHeight = Integer.parseInt(args[1]);
                URL imageURL= new URL(args[2]);

                int intRotate = 0;
                if(args.length == 4){
                    intRotate = Integer.parseInt(args[3]);
                }
                OutputStream os = new ByteArrayOutputStream();

                Thumbnails.of(imageURL).forceSize(intWidth, intHeight).rotate(intRotate).outputFormat("png").toOutputStream(os);
                //YOU CAN EVEN ADD FILTERS MAKE SURE TO TRY IT
                byte[] imageInBytes = ((ByteArrayOutputStream) os).toByteArray();

                e.getChannel().sendFile(imageInBytes, "newFile.png").queue();
                e.reply("Dimensions: " + intWidth + " Width " + intHeight + " Height " + intRotate + " Degrees rotated to the right");

            } catch(Exception ex){
                System.out.println("An exception happened");
            }

        }

    }
}
