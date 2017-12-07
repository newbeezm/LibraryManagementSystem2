package com.niit.book.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {

    private static final String MATCH_ADMIN_SQL = "SELECT COUNT(*) FROM admin WHERE admin_id = ? AND password = ? ";
    private static final String RE_PASSWORD_SQL = "UPDATE admin SET password = ? WHERE admin_id = ? ";
    private static final String GET_PASSWD_SQL = "SELECT password FROM admin WHERE admin_id = ?";
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(int adminId, String password) {
        return jdbcTemplate.queryForObject(MATCH_ADMIN_SQL, new Object[]{adminId, password}, Integer.class);
    }

    public int rePassword(int adminId, String newPasswd) {
        return jdbcTemplate.update(RE_PASSWORD_SQL, new Object[]{newPasswd, adminId});
    }

    public String getPasswd(int id) {
        return jdbcTemplate.queryForObject(GET_PASSWD_SQL, new Object[]{id}, String.class);
    }

}
