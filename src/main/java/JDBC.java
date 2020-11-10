import java.sql.*;
import java.util.HashMap;

public class JDBC {
    // change this to the remote server
    private final String url = "jdbc:postgresql://ec2-18-210-51-239.compute-1.amazonaws.com:5432/ddmgjgkagckgto?user=qsbbjcdcnayhnp&password=e902ec9c2d2458dd577f2655c521499e28b90b01bda8728ac907ad9e7db2ea3f";
    private final String user = "qsbbjcdcnayhnp";
    private final String password = "e902ec9c2d2458dd577f2655c521499e28b90b01bda8728ac907ad9e7db2ea3f";

    //connect to postgres database

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to SQL server.");

            } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public String getTeamListFromRegion(String region) {
        //String SQL = "SELECT school_name FROM" + region;
        //below runs on local database for testing, above is actual query once connected to remote db
        String SQL = "SELECT seed FROM ncaa;";
        String teamList = "";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()){
            //teamList = rs.getString("school_name");
            teamList += rs.getString("seed") + "\n";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return teamList;
    }

    // need to make this parse query results

    public String[] parseToStringArray(String queryResults){
        return null;
    }
    public HashMap<String, Integer> mapify(String queryResults){
        return new HashMap<String, Integer>();
    }

}
