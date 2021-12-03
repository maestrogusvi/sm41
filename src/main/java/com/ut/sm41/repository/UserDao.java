package com.ut.sm41.repository;

import com.ut.sm41.model.Role;
import com.ut.sm41.model.User;
import com.ut.sm41.service.impl.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUser(String name) {
        return jdbcTemplate.queryForObject("select name, password from user where name = ?",
                new Object[] { name }, new UserRowMapper());
    }

    public List<Role> getRoles(String username) {
        List<Map<String, Object>> results = jdbcTemplate
                .queryForList("select user_role from user_role where user_name = ?", new Object[] { username });
        List<Role> roles = results.stream().map(m -> {
            Role role = new Role();
            role.setRole(String.valueOf(m.get("user_role")));
            return role;
        }).collect(Collectors.toList());
        return roles;
    }

}
