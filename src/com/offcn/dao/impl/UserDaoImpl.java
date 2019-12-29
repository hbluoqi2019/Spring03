package com.offcn.dao.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
private JdbcTemplate jdbcTemplate;
    @Override
    public void login() {
        System.out.println("nihao");
    }

    @Override
    public User findById(int id) {
        return jdbcTemplate.queryForObject("select * from user where id =?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return new User(){{
                    setId(resultSet.getInt("id"));
                    setName(resultSet.getString("name"));
                    setSex(resultSet.getInt("sex"));
                    setAddress(resultSet.getString("address"));

                }};
            }
        },id);
    }
}
