package Services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TeamService {

    DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://ec2-18-210-51-239.compute-1.amazonaws.com:5432/ddmgjgkagckgto?user=qsbbjcdcnayhnp&password=e902ec9c2d2458dd577f2655c521499e28b90b01bda8728ac907ad9e7db2ea3f", "qsbbjcdcnayhnp", "e902ec9c2d2458dd577f2655c521499e28b90b01bda8728ac907ad9e7db2ea3f");
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
}
