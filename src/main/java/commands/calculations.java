package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class calculations extends Command {
    public calculations() {
        this.name = "math";
        this.aliases = new String[]{"Math"};
        this.aliases = new String[]{"MATH"};

    }

    @Override
    protected void execute(CommandEvent e) {
        String[] strMessage = e.getMessage().getContentRaw().split(" ");

        if (strMessage[1].equalsIgnoreCase("help")) {
            EmbedBuilder MathEB = new EmbedBuilder();
            MathEB.setTitle("Math Command Help");
            MathEB.setColor(Color.GREEN);

            MathEB.setDescription("**Addition** \n" + "sel-math add num1 num2 \n\n" +
                    "**Subtraction** \n" + "sel-math sub num1 num2 \n\n" +
                    "**Multiplication** \n" + "sel-math mul num1 num2 \n\n" +
                    "**Division** \n" + "sel-math div num1 num2 \n\n" +
                    "**Powers** \n" + "sel-math pow base exponent \n\n" +
                    "**Square Root** \n" + "sel-math sqrt number \n\n" +
                    "**Sin** \n" + "sel-math sin angle in degrees \n\n" +
                    "**Cos** \n" + "sel-math cos angle in degrees \n\n" +
                    "**Tan** \n" + "sel-math tan angle in degrees \n\n" +
                    "**Missing Angle Sine Law** \n" + "sel-math sinelawangle LengthA LengthB AngleA \n\n" +
                    "**Missing Length Sine Law** \n" + "sel-math sinelawlength LengthA AngleA AngleB \n\n" +
                    "**Missing Angle Cosine Law** \n" + "sel-math cosinelawangle LengthA LengthB LengthC \n\n" +
                    "**Missing Length Cosine Law** \n" + "sel-math cosinelawlength LengthA LengthB AngleA \n\n" +
                    "**Missing Angle Sine Law** \n" + "sel-math sinelawangle LengthB LengthC AngleA \n\n" +
                    "**2D Dot Product** \n" + "sel-math 2Ddot VectorA VectorB Angle \n\n" +
                    "**3D Dot Product** \n" + "sel-math 3Ddot VectorAx VectorAy VectorAz VectorBx VectorBy VectorBz \n\n" +
                    "**Angle in Dot Product** \n" + "sel-math dotproductangle VectorA VectorB DotProduct \n\n" +
                    "**Projection Vector A on B** \n" + "sel-math projAB VectorAx VectorAy VectorAz VectorBx VectorBy VectorBz \n\n" +
                    "**Projection Vector B on A** \n" + "sel-math projBA VectorAx VectorAy VectorAz VectorBx VectorBy VectorBz");

            e.getChannel().sendMessage(MathEB.build()).queue();
        }

        if (strMessage[1].equalsIgnoreCase("add")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double num2 = Double.parseDouble(strMessage[3]);
            e.getChannel().sendMessage("The answer is: " + (num1 + num2)).queue();
        } else if (strMessage[1].equalsIgnoreCase("sub")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double num2 = Double.parseDouble(strMessage[3]);
            e.getChannel().sendMessage("The answer is: " + (num1 - num2)).queue();
        } else if (strMessage[1].equalsIgnoreCase("mul")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double num2 = Double.parseDouble(strMessage[3]);
            e.getChannel().sendMessage("The answer is: " + (num1 * num2)).queue();
        } else if (strMessage[1].equalsIgnoreCase("div")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double num2 = Double.parseDouble(strMessage[3]);
            e.getChannel().sendMessage("The answer is: " + (num1 / num2)).queue();
        }

        if (strMessage[1].equalsIgnoreCase("sin")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double radians = Math.toRadians(num1);
            e.getChannel().sendMessage("The answer is: " + Math.sin(radians)).queue();
        } else if (strMessage[1].equalsIgnoreCase("cos")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double radians = Math.toRadians(num1);
            e.getChannel().sendMessage("The answer is: " + Math.cos(radians)).queue();
        } else if (strMessage[1].equalsIgnoreCase("tan")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double radians = Math.toRadians(num1);
            e.getChannel().sendMessage("The answer is: " + Math.tan(radians)).queue();
        } else if (strMessage[1].equalsIgnoreCase("pow")) {
            double num1 = Double.parseDouble(strMessage[2]);
            double num2 = Double.parseDouble(strMessage[3]);
            e.getChannel().sendMessage("The answer is: " + Math.pow(num1, num2)).queue();
        } else if (strMessage[1].equalsIgnoreCase("sqrt")) {
            double num1 = Double.parseDouble(strMessage[2]);
            e.getChannel().sendMessage("The answer is: " + Math.sqrt(num1)).queue();
        }

        if (strMessage[1].equalsIgnoreCase("sinelawangle")) {
            double sideA = Double.parseDouble(strMessage[2]);
            double sideB = Double.parseDouble(strMessage[3]);
            double angleA = Double.parseDouble(strMessage[4]);
            double radiansA = Math.toRadians(angleA);
            e.getChannel().sendMessage("The angle is: " + Math.toDegrees(Math.asin((sideA / (sideB / Math.sin(radiansA)))))).queue();
        } else if (strMessage[1].equalsIgnoreCase("sinelawlength")) { //Still Broken
            double sideA = Double.parseDouble(strMessage[2]);
            double angleA = Double.parseDouble(strMessage[3]);
            double radiansA = Math.toRadians(angleA);
            double angleB = Double.parseDouble(strMessage[4]);
            double radiansB = Math.toRadians(angleB);
            e.getChannel().sendMessage("The length is: " + (Math.sin(angleB) * (sideA / Math.sin(angleA)))).queue();
        } else if (strMessage[1].equalsIgnoreCase("cosinelawangle")) {
            double sideA = Double.parseDouble(strMessage[2]);
            double sideB = Double.parseDouble(strMessage[3]);
            double sideC = Double.parseDouble(strMessage[4]);
            e.getChannel().sendMessage("The angle is: " + Math.toDegrees(Math.acos((Math.pow(sideA, 2) - Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (-1 * 2 * sideB * sideC)))).queue();
        } else if (strMessage[1].equalsIgnoreCase("cosinelawlength")) { //Still Broken
            double sideB = Double.parseDouble(strMessage[2]);
            double sideC = Double.parseDouble(strMessage[3]);
            double angleA = Double.parseDouble(strMessage[4]);
            double radiansA = Math.toRadians(angleA);
            e.getChannel().sendMessage("The side length is: " + (Math.sqrt((Math.pow(sideB, 2) + Math.pow(sideC, 2)) - (2 * sideB * sideC * Math.cos(radiansA))))).queue();
        }

        if (strMessage[1].equalsIgnoreCase("2Ddot")) {
            double vectorA = Double.parseDouble(strMessage[2]);
            double vectorB = Double.parseDouble(strMessage[3]);
            double angleX = Double.parseDouble(strMessage[4]);
            double radiansX = Math.toRadians(angleX);
            e.getChannel().sendMessage("The dot product is: " + (vectorA * vectorB * Math.cos(radiansX))).queue();
        } else if (strMessage[1].equalsIgnoreCase("dotproductangle")) {
            double vectorA = Double.parseDouble(strMessage[2]);
            double vectorB = Double.parseDouble(strMessage[3]);
            double product = Double.parseDouble(strMessage[4]);
            e.getChannel().sendMessage("The angle is: " + Math.toDegrees(Math.acos(product / (vectorA * vectorB)))).queue();
        } else if (strMessage[1].equalsIgnoreCase("3Ddot")) {
            double vectorAx = Double.parseDouble(strMessage[2]);
            double vectorAy = Double.parseDouble(strMessage[3]);
            double vectorAz = Double.parseDouble(strMessage[4]);
            double vectorBx = Double.parseDouble(strMessage[5]);
            double vectorBy = Double.parseDouble(strMessage[6]);
            double vectorBz = Double.parseDouble(strMessage[7]);
            e.getChannel().sendMessage("The dot product is: " + ((vectorAx * vectorBx) + (vectorAy * vectorBy) + (vectorAz * vectorBz))).queue();
        } else if (strMessage[1].equalsIgnoreCase("crossprodAB")){
            double vectorAx = Double.parseDouble(strMessage[2]);
            double vectorAy = Double.parseDouble(strMessage[3]);
            double vectorAz = Double.parseDouble(strMessage[4]);
            double vectorBx = Double.parseDouble(strMessage[5]);
            double vectorBy = Double.parseDouble(strMessage[6]);
            double vectorBz = Double.parseDouble(strMessage[7]);
            e.getChannel().sendMessage("The cross product is: " + ((vectorAy) * (vectorBz) - (vectorBy) * (vectorAz))+ " , " + ((vectorAz) * (vectorBx) - (vectorBz) * (vectorAx)) + " ," + ((vectorAx) * (vectorBy) - (vectorBy) * (vectorAx)));

        }else if (strMessage[1].equalsIgnoreCase("ProjAB")) {
            double vectorAx = Double.parseDouble(strMessage[2]);
            double vectorAy = Double.parseDouble(strMessage[3]);
            double vectorAz = Double.parseDouble(strMessage[4]);
            double vectorBx = Double.parseDouble(strMessage[5]);
            double vectorBy = Double.parseDouble(strMessage[6]);
            double vectorBz = Double.parseDouble(strMessage[7]);
            double magB = Math.sqrt(Math.pow(vectorBx, 2) + Math.pow(vectorBy, 2) + Math.pow(vectorBz, 2));
            e.getChannel().sendMessage("The projection A has on B is: " + (((vectorAx * vectorBx) + (vectorAy * vectorBy) + (vectorAz * vectorBz)) / magB)).queue();
        } else if (strMessage[1].equalsIgnoreCase("ProjBA")) {
            double vectorAx = Double.parseDouble(strMessage[2]);
            double vectorAy = Double.parseDouble(strMessage[3]);
            double vectorAz = Double.parseDouble(strMessage[4]);
            double magA = Math.sqrt(Math.pow(vectorAx, 2) + Math.pow(vectorAy, 2) + Math.pow(vectorAz, 2));
            double vectorBx = Double.parseDouble(strMessage[5]);
            double vectorBy = Double.parseDouble(strMessage[6]);
            double vectorBz = Double.parseDouble(strMessage[7]);
            e.getChannel().sendMessage("The projection B has on A is: " + (((vectorAx * vectorBx) + (vectorAy * vectorBy) + (vectorAz * vectorBz)) / magA)).queue();
        }
    }
}
