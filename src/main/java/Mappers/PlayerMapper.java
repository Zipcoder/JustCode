package Mappers;

import Models.Player;
import Models.PlayerEnums.Position;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerMapper implements RowMapper<Player> {
    @Override
    public Player mapRow(ResultSet rs, int i) throws SQLException {
        Player player = new Player();
        player.setName(rs.getString("name"));
        player.setPPG(rs.getDouble("pointspergame"));
        player.setAPG(rs.getDouble("assistspergame"));
        player.setRPG(rs.getDouble("reboundspergame"));
        player.setTeamId(rs.getInt("teamid"));
        player.setGames(rs.getInt("games"));
        switch (rs.getString("position")) {
            case "C":
                player.setPosition(Position.C);
                break;
            case "F":
                player.setPosition(Position.F);
                break;
            case "G":
                player.setPosition(Position.G);
                break;
        }
        return player;
    }
}
