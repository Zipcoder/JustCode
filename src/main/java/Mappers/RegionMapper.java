package Mappers;

import Models.Region;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegionMapper implements RowMapper<Region> {

    @Override
    public Region mapRow(ResultSet rs, int row) throws SQLException {
          return new Region();
//        region.
//        ArrayList<Integer> seedPicks;
//        Models.Team champ;

    }
}
