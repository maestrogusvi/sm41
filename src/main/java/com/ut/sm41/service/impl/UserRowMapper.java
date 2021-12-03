package com.ut.sm41.service.impl;

import com.ut.sm41.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(rs.getString("name"), rs.getString("password"), rs.getString("role"));
    }

}