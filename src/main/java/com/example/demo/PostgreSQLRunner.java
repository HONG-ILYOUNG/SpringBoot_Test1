package com.example.demo;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PostgreSQLRunner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()){
            System.out.println(connection);
            String URL = connection.getMetaData().getURL();
            System.out.println(URL);
            String User = connection.getMetaData().getUserName();
            System.out.println(User);
            // PostgreSQL VARCHAR2 X VARCHAR O
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE TEST_ABSDE (" +
                    "Idx INTEGER," +
                    "TITLE VARCHAR(30)," +
                    "CONTENTS VARCHAR(200))";
//            statement.executeUpdate(sql);
        }

//        jdbcTemplate.execute("INSERT INTO TEST_ABSDE VALUES(2222, 'Test_Title', 'Test_Contents')");
    }
}