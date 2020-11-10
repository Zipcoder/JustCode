import Models.Bracket;
import Models.Region;
import Models.Team;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class RegionTest {
    Region testRegion = new Region("East");
    Bracket testBracket = new Bracket();
    HashMap<Integer, Team> testMap = new HashMap<>();

    @Test
    public void getSetRegionBracket() {
        testRegion.setRegionBracket(testBracket);
        Bracket expected = testBracket;
        Bracket actual = testRegion.getRegionBracket();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSetTeamSeedMap() {
        testRegion.setSeedTeamMap(testMap);
        HashMap expected = testMap;
        HashMap actual = testRegion.getSeedTeamMap();
        Assert.assertEquals(expected,actual);
    }
}