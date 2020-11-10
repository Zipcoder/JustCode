package Mappers;

import Models.Roster;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RosterMapper implements RowMapper<Roster> {
    @Override
    public Roster mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
