import Models.Player;
import Models.PlayerEnums.Position;
import Models.PlayerEnums.Year;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestPlayer {
    private static final Logger LOGGER = Logger.getLogger(TestPlayer.class.getName());
    @Test
    public void playerDetailsTest(){
        Player player = new Player("Raheel Uppal",Position.G,6.3,230.5,32.6,8.6,9.2, Year.FM);
        String expected = player.playerDetails(player);
        String actual ="Name: Raheel Uppal\n" +
                " Models.PlayerEnums.Position: G\n" +
                " Height: 6.3\n" +
                " Weight: 230.5\n" +
                " PPG: 32.6\n" +
                " APG: 8.6\n" +
                " RPG 9.2\n" +
                " Class: FM";
        LOGGER.info(player.playerDetails(player));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSetterTest(){
        Player player = new Player("Raheel Uppal");
        player.setName("Raheel Uppal");
        player.setAPG(8.9);
        player.setHeight(6.3);
        player.setPosition(Position.G);
        player.setWeight(230.5);
        player.setPPG(33.6);
        player.setRPG(12.2);
        player.setYear(Year.FM);

        String nameE = player.getName();
        String nameA = "Raheel Uppal";
        Assert.assertEquals(nameE,nameA);

        Double ppgE = player.getPPG();
        Double ppgA = 33.6;
        Assert.assertEquals(ppgE,ppgA);

        Double rpgE = player.getRPG();
        Double rpgA = 12.2;
        Assert.assertEquals(rpgE,rpgA);

        Double apgE = player.getAPG();
        Double apgA = 8.9;
        Assert.assertEquals(apgE,apgA);

        Double heightE = player.getHeight();
        Double heightA = 6.3;
        Assert.assertEquals(heightE,heightA);

        Double weightE = player.getWeight();
        Double weightA = 230.5;
        Assert.assertEquals(weightE,weightA);

        Position expected = player.getPosition();
        Position actual = Position.G;
        Assert.assertEquals(expected,actual);
    }
}
