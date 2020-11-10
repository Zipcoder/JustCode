import Models.Player;
import Models.PlayerEnums.Position;
import Models.Roster;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestRoster {
    private static final Logger LOGGER = Logger.getLogger(TestRoster.class.getName());

    @Test
    public void sizeTest(){
        Player player1 = new Player("Raheel Uppal");
        Position pg = Position.G;
        Player player2 = new Player("David Kelly");
        Position sg = Position.G;
        Player player3 = new Player("Sandeep Manglam");
        Position c = Position.F;
        Roster roster = new Roster();
        roster.setRoster(roster.getRoster());
        roster.addToRoster(player1,pg);
        roster.addToRoster(player2,sg);
        roster.addToRoster(player3,c);

        Integer expected = roster.size();
        Integer actual = 3;


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listRosterTest(){
        Player player1 = new Player("Raheel Uppal");
        Position pg = Position.G;
        Player player2 = new Player("David Kelly");
        Position sg = Position.G;
        Player player3 = new Player("Sandeep Manglam");
        Position sf = Position.F;
        Player player4 = new Player("Mat Ascone");
        Position c = Position.C;

        Roster roster = new Roster();
        roster.addToRoster(player1,pg);
        roster.addToRoster(player2,sg);
        roster.addToRoster(player3,sf);
        roster.addToRoster(player4,c);

        LOGGER.info(roster.listRoster(roster));

    }

}
