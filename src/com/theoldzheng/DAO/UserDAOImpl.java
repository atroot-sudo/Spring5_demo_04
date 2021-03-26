package com.theoldzheng.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.26 19:12
 */
@Repository
public class UserDAOImpl implements DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addMoney() {
        String sql = "update tx_users  set money = money - ? where name = ?";
        jdbcTemplate.update(sql,-100,"李华" );
    }

    public void reduceMoney() {
        String sql = "update tx_users  set money = money - ? where name = ?";
        jdbcTemplate.update(sql,100,"张志" );
    }

}
