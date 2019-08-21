package main.webapp.driuddemo;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplatedemo {
    private  static JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource1());
    public static void main(String[] args) {

    }
}
