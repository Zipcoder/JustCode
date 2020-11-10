package Services;

import Mappers.PlayerMapper;
import Models.Player;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class PlayerService {

    DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://ec2-18-210-51-239.compute-1.amazonaws.com:5432/ddmgjgkagckgto?user=qsbbjcdcnayhnp&password=e902ec9c2d2458dd577f2655c521499e28b90b01bda8728ac907ad9e7db2ea3f", "qsbbjcdcnayhnp", "e902ec9c2d2458dd577f2655c521499e28b90b01bda8728ac907ad9e7db2ea3f");
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

    public List<Player> getPlayersByTeamId(int teamId){
        return jdbcTemplate.query("select * from player_stats_final where teamid = '" + teamId+ "' order by games desc;", new PlayerMapper());
    }
}
