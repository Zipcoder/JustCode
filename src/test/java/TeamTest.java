import Models.Roster;
import Models.Team;
import org.junit.Assert;
import org.junit.Test;

public class TeamTest {
    Roster testRoster = new Roster();
    Team testTeam = new Team();

    @Test
    public void getSetTeamRoster() {
        testTeam.setTeamRoster(testRoster);
        Roster expected = testRoster;
        Roster actual = testTeam.getTeamRoster();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSetRecords() {
        testTeam.setRecords("records");
        String expected = "records";
        String actual = testTeam.getRecords();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSetProjections() {
        testTeam.setProjections("proj");
        String expected = "proj";
        String actual = testTeam.getProjections();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSetHistory() {
        testTeam.setHistory("hist");
        String expected = "hist";
        String actual = testTeam.getHistory();
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void getSetSchedule() {
        testTeam.setSchedule("schedule");
        String expected = "schedule";
        String actual = testTeam.getSchedule();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSetTeamName() {
        testTeam.setTeamName("Duke");
        String expected = "Duke";
        String actual = testTeam.getTeamName();
        Assert.assertEquals(expected, actual);
    }
}