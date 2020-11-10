import org.junit.Test;

public class JDBCTest {
    JDBC jdbc = new JDBC();

    @Test
    public void connect() {}

    @Test
    public void getTeamListFromRegion() {
        System.out.println(jdbc.getTeamListFromRegion("east"));
    }

    @Test
    public void parseToStringArray() {
    }

    @Test
    public void mapify() {
    }
}